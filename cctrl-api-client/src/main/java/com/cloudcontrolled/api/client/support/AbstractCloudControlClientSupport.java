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
package com.cloudcontrolled.api.client.support;

import java.io.InputStream;

import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.log4j.Logger;

import com.cloudcontrolled.api.client.exception.AuthorizationException;
import com.cloudcontrolled.api.client.util.HttpStatus;
import com.cloudcontrolled.api.client.util.PathUtil;
import com.cloudcontrolled.api.client.util.RequestUtil;
import com.cloudcontrolled.api.client.util.Timer;
import com.cloudcontrolled.api.request.CreateTokenRequest;
import com.cloudcontrolled.api.request.Request;
import com.cloudcontrolled.api.response.Response;

/**
 * <p>
 * Abstract AbstractCloudControlClientSupport class.
 * </p>
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
public abstract class AbstractCloudControlClientSupport {
	protected final Logger log = Logger.getLogger(this.getClass());

	/**
	 * <p>
	 * doGet.
	 * </p>
	 * 
	 * @param webClient
	 *            a {@link org.apache.cxf.jaxrs.client.WebClient} object.
	 * @param request
	 *            a {@link com.cloudcontrolled.api.request.Request} object.
	 * @param <T>
	 *            a T object.
	 * @return a {@link com.cloudcontrolled.api.response.Response} object.
	 */
	protected <T> Response<T> doGet(WebClient webClient, Request<T> request) {
		webClient = webClient.path(inquirePath(request));

		Timer timer = Timer.tic();
		javax.ws.rs.core.Response cxfResponse = webClient.get();
		timer.toc();

		log.debug(cxfResponse.getStatus() + " " + webClient.getCurrentURI() + " took " + timer.getDifference() + "ms");

		Response<T> response = toResponse(timer, cxfResponse, request);

		log.debug(response);

		return response;
	}

	/**
	 * <p>
	 * doPost.
	 * </p>
	 * 
	 * @param webClient
	 *            a {@link org.apache.cxf.jaxrs.client.WebClient} object.
	 * @param request
	 *            a {@link com.cloudcontrolled.api.request.Request} object.
	 * @param <T>
	 *            a T object.
	 * @return a {@link com.cloudcontrolled.api.response.Response} object.
	 */
	protected <T> Response<T> doPost(WebClient webClient, Request<T> request) {
		webClient = webClient.path(inquirePath(request));

		Timer timer = Timer.tic();
		javax.ws.rs.core.Response cxfResponse = webClient.post(RequestUtil.getBodyAsMultiValuedMap(request));
		timer.toc();

		log.debug(cxfResponse.getStatus() + " " + webClient.getCurrentURI() + " took " + timer.getDifference() + "ms");

		Response<T> response = toResponse(timer, cxfResponse, request);

		log.debug(response);

		return response;
	}

	/**
	 * <p>
	 * doPut.
	 * </p>
	 * 
	 * @param webClient
	 *            a {@link org.apache.cxf.jaxrs.client.WebClient} object.
	 * @param request
	 *            a {@link com.cloudcontrolled.api.request.Request} object.
	 * @param <T>
	 *            a T object.
	 * @return a {@link com.cloudcontrolled.api.response.Response} object.
	 */
	protected <T> Response<T> doPut(WebClient webClient, Request<T> request) {
		webClient = webClient.path(inquirePath(request));

		Timer timer = Timer.tic();
		javax.ws.rs.core.Response cxfResponse = webClient.put(RequestUtil.getBodyAsMultiValuedMap(request));
		timer.toc();

		log.debug(cxfResponse.getStatus() + " " + webClient.getCurrentURI() + " took " + timer.getDifference() + "ms");

		Response<T> response = toResponse(timer, cxfResponse, request);

		log.debug(response);

		return response;
	}

	/**
	 * <p>
	 * doDelete.
	 * </p>
	 * 
	 * @param webClient
	 *            a {@link org.apache.cxf.jaxrs.client.WebClient} object.
	 * @param request
	 *            a {@link com.cloudcontrolled.api.request.Request} object.
	 * @param <T>
	 *            a T object.
	 * @return a {@link com.cloudcontrolled.api.response.Response} object.
	 */
	protected <T> Response<T> doDelete(WebClient webClient, Request<T> request) {
		webClient = webClient.path(inquirePath(request));

		Timer timer = Timer.tic();
		javax.ws.rs.core.Response cxfResponse = webClient.delete();
		timer.toc();

		log.debug(cxfResponse.getStatus() + " " + webClient.getCurrentURI() + " took " + timer.getDifference() + "ms");

		Response<T> response = toResponse(timer, cxfResponse, request);

		log.debug(response);

		return response;
	}

	/**
	 * 
	 * @param timer
	 * @param cxfResponse
	 * @param request
	 * @return
	 */
	private <T> Response<T> toResponse(Timer timer, javax.ws.rs.core.Response cxfResponse, Request<T> request) {
		if (!(request instanceof CreateTokenRequest) && cxfResponse.getStatus() == HttpStatus.Unauthorized.ordinal()) {
			throw new AuthorizationException(HttpStatus.Unauthorized.toString());
		}

		InputStream inputStream = (InputStream) cxfResponse.getEntity();
		Response<T> response = null;

		HttpStatus status = HttpStatus.getStatus(cxfResponse.getStatus());

		if (status.isError()) {
			response = deserializeError(inputStream, request);
		} else {
			response = deserialize(inputStream, request);
		}

		response.setStatusCode(status.getCode());
		response.setResponseTime(timer.getDifference());

		return response;
	}

	/**
	 * <p>
	 * inquirePath.
	 * </p>
	 * 
	 * @param request
	 *            a {@link com.cloudcontrolled.api.request.Request} object.
	 * @param <T>
	 *            a T object.
	 * @return a {@link java.lang.String} object.
	 */
	protected <T> String inquirePath(Request<T> request) {
		return PathUtil.resolveResourcePath(request);
	}

	/**
	 * <p>
	 * deserialize.
	 * </p>
	 * 
	 * @param response
	 *            a {@link java.lang.String} object.
	 * @param request
	 *            a {@link com.cloudcontrolled.api.request.Request} object.
	 * @param <T>
	 *            a T object.
	 * @return a {@link com.cloudcontrolled.api.response.Response} object.
	 */
	protected abstract <T> Response<T> deserialize(String response, Request<T> request);

	/**
	 * <p>
	 * deserialize.
	 * </p>
	 * 
	 * @param inputStream
	 *            a {@link java.io.InputStream} object.
	 * @param request
	 *            a {@link com.cloudcontrolled.api.request.Request} object.
	 * @param <T>
	 *            a T object.
	 * @return a {@link com.cloudcontrolled.api.response.Response} object.
	 */
	protected abstract <T> Response<T> deserialize(InputStream inputStream, Request<T> request);

	/**
	 * <p>
	 * deserializeError.
	 * </p>
	 * 
	 * @param inputStream
	 *            a {@link java.io.InputStream} object.
	 * @param request
	 *            a {@link com.cloudcontrolled.api.request.Request} object.
	 * @param <T>
	 *            a T object.
	 * @return a {@link com.cloudcontrolled.api.response.Response} object.
	 */
	protected abstract <T> Response<T> deserializeError(InputStream inputStream, Request<T> request);

	/**
	 * <p>
	 * deserializeError.
	 * </p>
	 * 
	 * @param response
	 *            a {@link java.lang.String} object.
	 * @param request
	 *            a {@link com.cloudcontrolled.api.request.Request} object.
	 * @param <T>
	 *            a T object.
	 * @return a {@link com.cloudcontrolled.api.response.Response} object.
	 */
	protected abstract <T> Response<T> deserializeError(String response, Request<T> request);

}
