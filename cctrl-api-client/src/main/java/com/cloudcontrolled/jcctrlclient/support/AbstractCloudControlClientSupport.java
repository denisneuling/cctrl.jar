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
package com.cloudcontrolled.jcctrlclient.support;

import java.io.InputStream;

import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.log4j.Logger;

import com.cloudcontrolled.jcclib.request.Request;
import com.cloudcontrolled.jcclib.response.Response;
import com.cloudcontrolled.jcctrlclient.util.HttpStatus;
import com.cloudcontrolled.jcctrlclient.util.PathUtil;
import com.cloudcontrolled.jcctrlclient.util.RequestUtil;
import com.cloudcontrolled.jcctrlclient.util.Timer;

public abstract class AbstractCloudControlClientSupport {
	protected final Logger log = Logger.getLogger(this.getClass());

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

	private <T> Response<T> toResponse(Timer timer, javax.ws.rs.core.Response cxfResponse, Request<T> request) {
		InputStream inputStream = (InputStream) cxfResponse.getEntity();
		Response<T> response = null;

		HttpStatus status = HttpStatus.getStatus(cxfResponse.getStatus());

		if (status.isError()) {
			response = deserializeError(inputStream, request);
		} else {
			response = deserialize(inputStream, request);
		}

		response.setResponseTime(timer.getDifference());

		return response;
	}

	protected <T> String inquirePath(Request<T> request) {
		return PathUtil.resolveResourcePath(request);
	}

	protected abstract <T> Response<T> deserialize(String response, Request<T> request);

	protected abstract <T> Response<T> deserialize(InputStream inputStream, Request<T> request);

	protected abstract <T> Response<T> deserializeError(InputStream inputStream, Request<T> request);

	protected abstract <T> Response<T> deserializeError(String response, Request<T> request);

}
