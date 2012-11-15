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
package com.cloudcontrolled.api.client.security;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.TrustManager;

import com.sun.net.ssl.internal.ssl.X509ExtendedTrustManager;

public class DumbX509TrustManager extends X509ExtendedTrustManager implements TrustManager {

	public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
	}

	public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
	}

	public X509Certificate[] getAcceptedIssuers() {
		return null;
	}

	@Override
	public void checkClientTrusted(X509Certificate[] arg0, String arg1, String arg2, String arg3) throws CertificateException {
	}

	@Override
	public void checkServerTrusted(X509Certificate[] arg0, String arg1, String arg2, String arg3) throws CertificateException {
	}
}