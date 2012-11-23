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
package com.cloudcontrolled.api.request;

import com.cloudcontrolled.api.annotation.Body;
import com.cloudcontrolled.api.annotation.Default;
import com.cloudcontrolled.api.annotation.Method;
import com.cloudcontrolled.api.annotation.Path;
import com.cloudcontrolled.api.annotation.PathVariable;
import com.cloudcontrolled.api.annotation.Required;
import com.cloudcontrolled.api.common.HttpMethod;
import com.cloudcontrolled.api.response.UpdateDeploymentResponse;

/**
 * 
 * Or for reference have a look here: <a
 * href="https://api.cloudcontrol.com/doc/#DeploymentUPDATE"
 * >https://api.cloudcontrol.com/doc/#DeploymentUPDATE</a>
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
@Method(HttpMethod.PUT)
@Path("/app/${app}/deployment/${dep}/")
public class UpdateDeploymentRequest extends Request<UpdateDeploymentResponse> {
	private static final long serialVersionUID = 123036200428417092L;

	@Required
	@PathVariable("${app}")
	private String applicationName;

	@Required
	@Default("default")
	@PathVariable("${dep}")
	private String deploymentName;

	@Default("-1")
	@Body
	private String version;

	@Required
	private int min;

	@Required
	private int max;

	// haaaeee?
	private String billingAccount;

	private String stack;

	/**
	 * <p>
	 * Constructor for UpdateDeploymentRequest.
	 * </p>
	 */
	public UpdateDeploymentRequest() {
	}

	/**
	 * <p>
	 * Getter for the field <code>applicationName</code>.
	 * </p>
	 * 
	 * @return applicationName
	 */
	public String getApplicationName() {
		return applicationName;
	}

	/**
	 * <p>
	 * Setter for the field <code>applicationName</code>.
	 * </p>
	 * 
	 * @param applicationName
	 *            a {@link java.lang.String} object.
	 */
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	/**
	 * <p>
	 * Getter for the field <code>deploymentName</code>.
	 * </p>
	 * 
	 * @return deploymentName
	 */
	public String getDeploymentName() {
		return deploymentName;
	}

	/**
	 * <p>
	 * Setter for the field <code>deploymentName</code>.
	 * </p>
	 * 
	 * @param deploymentName
	 *            a {@link java.lang.String} object.
	 */
	public void setDeploymentName(String deploymentName) {
		this.deploymentName = deploymentName;
	}

	/**
	 * <p>
	 * Getter for the field <code>version</code>.
	 * </p>
	 * 
	 * @return version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <p>
	 * Setter for the field <code>version</code>.
	 * </p>
	 * 
	 * @param version
	 *            a {@link java.lang.String} object.
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * <p>
	 * Getter for the field <code>min</code>.
	 * </p>
	 * 
	 * @return min
	 */
	public int getMin() {
		return min;
	}

	/**
	 * <p>
	 * Setter for the field <code>min</code>.
	 * </p>
	 * 
	 * @param min
	 *            a {@link java.lang.String} object.
	 */
	public void setMin(int min) {
		this.min = min;
	}

	/**
	 * <p>
	 * Getter for the field <code>max</code>.
	 * </p>
	 * 
	 * @return max
	 */
	public int getMax() {
		return max;
	}

	/**
	 * <p>
	 * Setter for the field <code>max</code>.
	 * </p>
	 * 
	 * @param max
	 *            a {@link java.lang.String} object.
	 */
	public void setMax(int max) {
		this.max = max;
	}

	/**
	 * <p>
	 * Getter for the field <code>billingAccount</code>.
	 * </p>
	 * 
	 * @return billingAccount
	 */
	public String getBillingAccount() {
		return billingAccount;
	}

	/**
	 * <p>
	 * Setter for the field <code>billingAccount</code>.
	 * </p>
	 * 
	 * @param billingAccount
	 *            a {@link java.lang.String} object.
	 */
	public void setBillingAccount(String billingAccount) {
		this.billingAccount = billingAccount;
	}

	/**
	 * <p>
	 * Getter for the field <code>stack</code>.
	 * </p>
	 * 
	 * @return stack
	 */
	public String getStack() {
		return stack;
	}

	/**
	 * <p>
	 * Setter for the field <code>stack</code>.
	 * </p>
	 * 
	 * @param stack
	 *            a {@link java.lang.String} object.
	 */
	public void setStack(String stack) {
		this.stack = stack;
	}
}
