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
package com.cloudcontrolled.cctrl.maven.plugin;

import com.cloudcontrolled.api.client.CloudControlClient;
import com.cloudcontrolled.api.client.auth.Credentials;
import com.cloudcontrolled.api.request.ApplicationRequest;
import com.cloudcontrolled.api.request.UpdateDeploymentRequest;

/**
 * <p>
 * CloudControlSupport class.
 * </p>
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
public class CloudControlSupport {

	/** Constant <code>CCTRL_EMAIL="CCTRL_EMAIL"</code> */
	protected static final String CCTRL_EMAIL = "CCTRL_EMAIL";
	/** Constant <code>CCTRL_PASSWORD="CCTRL_PASSWORD"</code> */
	protected static final String CCTRL_PASSWORD = "CCTRL_PASSWORD";

	/** Constant <code>MASTER_BRANCH="master"</code> */
	public static final String MASTER_BRANCH = "master";
	/**
	 * Constant
	 * <code>LLINE="---------------------------------------"{trunked}</code>
	 */
	public static final String LLINE = "------------------------------------------------------------------------";

	/**
	 * 
	 * @return
	 */
	private static Credentials retrieveCredentials() {
		String userName;
		String password;

		userName = System.getProperty(CCTRL_EMAIL);
		password = System.getProperty(CCTRL_PASSWORD);

		if (userName == null && password == null) {
			userName = System.getenv().get(CCTRL_EMAIL);
			password = System.getenv().get(CCTRL_PASSWORD);
		}

		Credentials credentials = new Credentials(userName, password);

		return credentials;
	}

	/**
	 * <p>
	 * createCloudControlClient.
	 * </p>
	 * 
	 * @return a {@link com.cloudcontrolled.api.client.CloudControlClient}
	 *         object.
	 */
	public static CloudControlClient createCloudControlClient() {
		Credentials credentials = retrieveCredentials();
		CloudControlClient cloudControlClient = new CloudControlClient(credentials);

		return cloudControlClient;
	}

	/**
	 * <p>
	 * createUpdateDeploymentRequest.
	 * </p>
	 * 
	 * @param applicationName
	 *            a {@link java.lang.String} object.
	 * @param deploymentName
	 *            a {@link java.lang.String} object.
	 * @param commitId
	 *            a {@link java.lang.String} object.
	 * @return a {@link com.cloudcontrolled.api.request.UpdateDeploymentRequest}
	 *         object.
	 */
	public static UpdateDeploymentRequest createUpdateDeploymentRequest(String applicationName, String deploymentName, String commitId) {
		UpdateDeploymentRequest updateDeploymentRequest = new UpdateDeploymentRequest();
		updateDeploymentRequest.setApplicationName(applicationName);
		updateDeploymentRequest.setDeploymentName(deploymentName);
		updateDeploymentRequest.setVersion(commitId);

		return updateDeploymentRequest;
	}

	/**
	 * <p>
	 * createApplicationRequest.
	 * </p>
	 * 
	 * @param applicationName
	 *            a {@link java.lang.String} object.
	 * @return a {@link com.cloudcontrolled.api.request.ApplicationRequest}
	 *         object.
	 */
	public static ApplicationRequest createApplicationRequest(String applicationName) {
		ApplicationRequest applicationRequest = new ApplicationRequest();
		applicationRequest.setApplicationName(applicationName);

		return applicationRequest;
	}
}
