/*
 * Copyright 2012 Denis Neuling 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */
package com.cloudcontrolled.api.client;

import org.apache.cxf.jaxrs.client.WebClient;

import com.cloudcontrolled.api.client.auth.Credentials;
import com.cloudcontrolled.api.client.common.HttpStatus;
import com.cloudcontrolled.api.client.exception.AuthorizationException;
import com.cloudcontrolled.api.client.exception.CommunicationErrorException;
import com.cloudcontrolled.api.client.exception.ValidationConstraintViolationException;
import com.cloudcontrolled.api.client.support.CloudControlClientSupport;
import com.cloudcontrolled.api.client.util.HttpMethodUtil;
import com.cloudcontrolled.api.client.util.PathUtil;
import com.cloudcontrolled.api.client.util.RequestUtil;
import com.cloudcontrolled.api.common.HttpMethod;
import com.cloudcontrolled.api.request.CreateTokenRequest;
import com.cloudcontrolled.api.request.Request;
import com.cloudcontrolled.api.response.CreateTokenResponse;
import com.cloudcontrolled.api.response.Response;

/**
 * <p>
 * CloudControlClient class.
 * </p>
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 *
 */
public class CloudControlClient extends CloudControlClientSupport implements ICloudControlClient {

	private Credentials credentials;

	@SuppressWarnings("unused")
	private CloudControlClient() {
	}

	/**
	 * <p>
	 * Constructor for CloudControlClient.
	 * </p>
	 *
	 * @param credentials
	 *            a {@link com.cloudcontrolled.api.client.auth.Credentials}
	 *            object.
	 */
	public CloudControlClient(Credentials credentials) {
		this.credentials = credentials;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloudcontrolled.api.client.ICloudControlClient#renewToken()
	 */
	/** {@inheritDoc} */
	@Override
	public void renewToken() {
		CreateTokenRequest createTokenRequest = new CreateTokenRequest();
		createTokenRequest.setUser(credentials.getUserName());
		createTokenRequest.setPassword(credentials.getPassword());

		CreateTokenResponse createTokenResponse;
		try {
			createTokenResponse = send(createTokenRequest);
		} catch (ValidationConstraintViolationException vcve) {
			throw new AuthorizationException(vcve);
		}

		HttpStatus status = HttpStatus.getStatus(createTokenResponse.getStatusCode());
		if (status.isError()) {
			if (status.equals(HttpStatus.Unauthorized)) {
				throw new AuthorizationException(HttpStatus.Unauthorized.toString());
			} else {
				throw new CommunicationErrorException(status);
			}
		}

		String newToken = createTokenResponse.getToken();
		tokenStore.setToken(newToken);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cloudcontrolled.api.client.ICloudControlClient#send(com.cloudcontrolled
	 * .api.request.Request)
	 */
	/** {@inheritDoc} */
	@Override
	@SuppressWarnings("unchecked")
	public <T> T send(Request<T> request) {

		if (request == null) {
			throw new CommunicationErrorException("Request cannot be null.");
		}
		PathUtil.infixPotentialPathDefaults(request, request.getClass());
		RequestUtil.validate(request);

		T response;
		try {
			response = (T) dispatchByMethod(request);
		} catch (AuthorizationException ae) {
			renewToken();
			response = (T) dispatchByMethod(request);
		}

		return response;
	}

	/**
	 * 
	 * @param request
	 * @return
	 */
	private <T> Response<T> dispatchByMethod(Request<T> request) {
		HttpMethod method = HttpMethodUtil.retrieveMethod(request);

		String target = getTargetUrl();

		WebClient webClient = instantiateWebClient(target);

		webClient = prepareAuthorization(webClient, request);

		switch (method) {
			case GET:
				return doGet(webClient, request);
			case POST:
				return doPost(webClient, request);
			case PUT:
				return doPut(webClient, request);
			case DELETE:
				return doDelete(webClient, request);
			default:
				throw new CommunicationErrorException(HttpStatus.Not_Implemented);
		}
	}

	/**
	 * 
	 * @param webClient
	 * @param request
	 * @return
	 */
	private <T> WebClient prepareAuthorization(WebClient webClient, Request<T> request) {
		if (request instanceof CreateTokenRequest) {
			webClient = setAuthorizationBase64(webClient, toBase64(((CreateTokenRequest) request).getUser(), ((CreateTokenRequest) request).getPassword()));
		} else {
			webClient = setAuthorizationCCAuthToken(webClient);
		}
		return webClient;
	}
}
