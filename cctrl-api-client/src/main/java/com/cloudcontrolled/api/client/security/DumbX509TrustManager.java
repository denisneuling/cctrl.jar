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

/**
 * 
 * @author Denis Neuling (denisneuling@gmail.com) 
 */
public class DumbX509TrustManager extends X509ExtendedTrustManager implements TrustManager {

	/*
	 * (non-Javadoc)
	 * @see javax.net.ssl.X509TrustManager#checkClientTrusted(java.security.cert.X509Certificate[], java.lang.String)
	 */
	public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
	}

	/*
	 * (non-Javadoc)
	 * @see javax.net.ssl.X509TrustManager#checkServerTrusted(java.security.cert.X509Certificate[], java.lang.String)
	 */
	public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
	}

	/*
	 * (non-Javadoc)
	 * @see javax.net.ssl.X509TrustManager#getAcceptedIssuers()
	 */
	public X509Certificate[] getAcceptedIssuers() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see com.sun.net.ssl.internal.ssl.X509ExtendedTrustManager#checkClientTrusted(java.security.cert.X509Certificate[], java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void checkClientTrusted(X509Certificate[] arg0, String arg1, String arg2, String arg3) throws CertificateException {
	}

	/*
	 * (non-Javadoc)
	 * @see com.sun.net.ssl.internal.ssl.X509ExtendedTrustManager#checkServerTrusted(java.security.cert.X509Certificate[], java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void checkServerTrusted(X509Certificate[] arg0, String arg1, String arg2, String arg3) throws CertificateException {
	}
}