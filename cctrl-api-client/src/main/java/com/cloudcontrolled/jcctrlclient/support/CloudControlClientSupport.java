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

import com.cloudcontrolled.jcclib.request.Request;
import com.cloudcontrolled.jcclib.response.Response;
import com.cloudcontrolled.jcctrlclient.auth.Token;
import com.cloudcontrolled.jcctrlclient.exception.SerializationException;
import com.cloudcontrolled.jcctrlclient.json.JsonDeserializer;
import com.cloudcontrolled.jcctrlclient.security.DumbX509TrustManager;
import com.cloudcontrolled.jcctrlclient.util.RequestUtil;

public class CloudControlClientSupport extends AbstractCloudControlClientSupport {

	protected final static String ENV_API_URL_KEY = "CCTRL_API_URL";
	protected final static String apiUrl = "https://api.cloudcontrol.com";

	protected JsonDeserializer jsonDeserializer = new JsonDeserializer();

	@Override
	protected <T> Response<T> deserializeError(InputStream inputStream, Request<T> request) {
		String content = null;
		try {
			content = IOUtils.readStringFromStream(inputStream);
		} catch (IOException e) {
			throw new SerializationException(e);
		}

		System.out.println(content);

		return deserializeError(content, request);
	}

	@Override
	protected <T> Response<T> deserializeError(String response, Request<T> request) {
		Response<T> target = RequestUtil.getInstanceOfParameterizedType(request);
		target.setError(true);

		System.out.println(target);

		// TODO source out and improve!

		target.setContent(response);

		return target;
	}

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

	public static String getTargetUrl() {
		String targetUrl = System.getenv(ENV_API_URL_KEY);
		if (targetUrl != null) {
			return targetUrl;
		} else {
			targetUrl = apiUrl;
		}
		return targetUrl;
	}

	protected String toBase64(String user, String password) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(user);
		stringBuffer.append(":");
		stringBuffer.append(password);
		return Base64Utility.encode(stringBuffer.toString().getBytes());
	}

	protected WebClient instantiateWebClient(String targetUrl) {
		WebClient webClient = WebClient.create(targetUrl).type("application/x-www-form-urlencoded").accept(MediaType.TEXT_PLAIN).accept(MediaType.APPLICATION_JSON);

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

	protected WebClient setAuthorizationBase64(WebClient webClient, String base64) {
		return webClient.header("Authorization", "Basic " + base64);
	}

	protected WebClient setAuthorizationCCAuthToken(WebClient webClient) {
		return webClient.header("Authorization", "cc_auth_token=\"" + Token.getInstance().toString() + "\"");
	}
}
