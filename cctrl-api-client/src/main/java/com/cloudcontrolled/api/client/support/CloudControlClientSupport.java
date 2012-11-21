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

import java.io.IOException;
import java.io.InputStream;

import javax.net.ssl.TrustManager;
import javax.ws.rs.core.MediaType;

import org.apache.cxf.common.util.Base64Utility;
import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

import com.cloudcontrolled.api.client.auth.TokenStore;
import com.cloudcontrolled.api.client.exception.SerializationException;
import com.cloudcontrolled.api.client.json.JsonDeserializer;
import com.cloudcontrolled.api.client.security.DumbX509TrustManager;
import com.cloudcontrolled.api.client.util.Header;
import com.cloudcontrolled.api.client.util.RequestUtil;
import com.cloudcontrolled.api.request.Request;
import com.cloudcontrolled.api.response.Response;

/**
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 */
public class CloudControlClientSupport extends AbstractCloudControlClientSupport {

	protected final static String ENV_API_URL_KEY = "CCTRL_API_URL";
	protected final static String apiUrl = "https://api.cloudcontrol.com";

	protected TokenStore tokenStore = new TokenStore();

	protected JsonDeserializer jsonDeserializer = new JsonDeserializer();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cloudcontrolled.api.client.support.AbstractCloudControlClientSupport
	 * #deserializeError(java.io.InputStream,
	 * com.cloudcontrolled.api.request.Request)
	 */
	@Override
	protected <T> Response<T> deserializeError(InputStream inputStream, Request<T> request) {
		String content = null;
		try {
			content = IOUtils.readStringFromStream(inputStream);
		} catch (IOException e) {
			throw new SerializationException(e);
		}

		return deserializeError(content, request);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cloudcontrolled.api.client.support.AbstractCloudControlClientSupport
	 * #deserializeError(java.lang.String,
	 * com.cloudcontrolled.api.request.Request)
	 */
	@Override
	protected <T> Response<T> deserializeError(String response, Request<T> request) {
		Response<T> target = RequestUtil.getInstanceOfParameterizedType(request);
		target.setError(true);
		target.setContent(response);
		return target;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cloudcontrolled.api.client.support.AbstractCloudControlClientSupport
	 * #deserialize(java.io.InputStream,
	 * com.cloudcontrolled.api.request.Request)
	 */
	@Override
	protected <T> Response<T> deserialize(InputStream inputStream, Request<T> request) {
		String content = null;
		try {
			content = IOUtils.readStringFromStream(inputStream);
		} catch (IOException e) {
			throw new SerializationException(e);
		}

		return deserialize(content, request);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cloudcontrolled.api.client.support.AbstractCloudControlClientSupport
	 * #deserialize(java.lang.String, com.cloudcontrolled.api.request.Request)
	 */
	@Override
	protected <T> Response<T> deserialize(String response, Request<T> request) {
		Response<T> target = RequestUtil.getInstanceOfParameterizedType(request);
		target.setContent(response);
		target.setError(false);

		try {
			return jsonDeserializer.fromJSON(response, target);
		} catch (SerializationException jse) {
			return target;
		}
	}

	/**
	 * 
	 * @return
	 */
	public static String getTargetUrl() {
		String targetUrl = System.getenv(ENV_API_URL_KEY);
		if (targetUrl != null) {
			return targetUrl;
		} else {
			targetUrl = apiUrl;
		}
		return targetUrl;
	}

	/**
	 * 
	 * @param user
	 * @param password
	 * @return
	 */
	protected String toBase64(String user, String password) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(user);
		stringBuffer.append(":");
		stringBuffer.append(password);
		return Base64Utility.encode(stringBuffer.toString().getBytes());
	}

	/**
	 * 
	 * @param targetUrl
	 * @return
	 */
	protected WebClient instantiateWebClient(String targetUrl) {
		WebClient webClient = WebClient.create(targetUrl).type("application/x-www-form-urlencoded").accept(MediaType.TEXT_PLAIN).accept(MediaType.APPLICATION_JSON);
		webClient = Header.setHeader(webClient);

		HTTPConduit conduit = WebClient.getConfig(webClient).getHttpConduit();
		TLSClientParameters params = conduit.getTlsClientParameters();
		if (params == null) {
			params = new TLSClientParameters();
			conduit.setTlsClientParameters(params);
		}
		params.setTrustManagers(new TrustManager[] { new DumbX509TrustManager() });
		params.setDisableCNCheck(true);

		HTTPClientPolicy policy = new HTTPClientPolicy();
		policy.setConnectionTimeout(600000);
		policy.setReceiveTimeout(600000);
		policy.setAllowChunking(false);
		conduit.setClient(policy);

		return webClient;
	}

	/**
	 * 
	 * @param webClient
	 * @param base64
	 * @return
	 */
	protected WebClient setAuthorizationBase64(WebClient webClient, String base64) {
		return webClient.header("Authorization", "Basic " + base64);
	}

	/**
	 * 
	 * @param webClient
	 * @return
	 */
	protected WebClient setAuthorizationCCAuthToken(WebClient webClient) {
		return webClient.header("Authorization", "cc_auth_token=\"" + tokenStore.getToken() + "\"");
	}
}
