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
package com.cloudcontrolled.jcctrlclient;

import org.apache.cxf.jaxrs.client.WebClient;

import com.cloudcontrolled.jcclib.common.HttpMethod;
import com.cloudcontrolled.jcclib.request.CreateTokenRequest;
import com.cloudcontrolled.jcclib.request.Request;
import com.cloudcontrolled.jcclib.response.CreateTokenResponse;
import com.cloudcontrolled.jcclib.response.Response;
import com.cloudcontrolled.jcctrlclient.auth.Credentials;
import com.cloudcontrolled.jcctrlclient.auth.Token;
import com.cloudcontrolled.jcctrlclient.exception.AuthorizationException;
import com.cloudcontrolled.jcctrlclient.exception.CommunicationErrorException;
import com.cloudcontrolled.jcctrlclient.exception.ValidationConstraintViolationException;
import com.cloudcontrolled.jcctrlclient.support.CloudControlClientSupport;
import com.cloudcontrolled.jcctrlclient.util.HttpMethodUtil;
import com.cloudcontrolled.jcctrlclient.util.HttpStatus;
import com.cloudcontrolled.jcctrlclient.util.PathUtil;
import com.cloudcontrolled.jcctrlclient.util.ValidationUtil;

public class CloudControlClient extends CloudControlClientSupport implements ICloudControlClient {

	private Credentials credentials;

	@SuppressWarnings("unused")
	private CloudControlClient() {
	}

	public CloudControlClient(Credentials credentials) {
		this.credentials = credentials;
	}

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
			throw new CommunicationErrorException(status);
		}

		String newToken = createTokenResponse.getToken();
		Token.getInstance().setToken(newToken);
	}

	@SuppressWarnings("unchecked")
	public <T> T send(Request<T> request) {

		if (request == null) {
			throw new CommunicationErrorException("Request cannot be null.");
		}
		PathUtil.infixPotentialDefaults(request);
		ValidationUtil.validate(request);

		T response = (T) dispatchByMethod(request);

		return response;
	}

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

	private <T> WebClient prepareAuthorization(WebClient webClient, Request<T> request) {
		if (request instanceof CreateTokenRequest) {
			webClient = setAuthorizationBase64(webClient, toBase64(((CreateTokenRequest) request).getUser(), ((CreateTokenRequest) request).getPassword()));
		} else {
			renewToken();
			webClient = setAuthorizationCCAuthToken(webClient);
		}
		return webClient;
	}
}