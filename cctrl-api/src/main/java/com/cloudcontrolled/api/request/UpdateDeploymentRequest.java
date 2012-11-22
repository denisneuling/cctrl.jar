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

	// if null we have to retrieve them
	// from the api before firing the put request
	private String min;
	private String max;

	// haaaeee?
	private String billingAccount;

	private String stack;

	public UpdateDeploymentRequest() {
	}

	/**
	 * 
	 * @return applicationName
	 */
	public String getApplicationName() {
		return applicationName;
	}

	/**
	 * 
	 * @param applicationName
	 */
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	/**
	 * 
	 * @return deploymentName
	 */
	public String getDeploymentName() {
		return deploymentName;
	}

	/**
	 * 
	 * @param deploymentName
	 */
	public void setDeploymentName(String deploymentName) {
		this.deploymentName = deploymentName;
	}

	/**
	 * 
	 * @return version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * 
	 * @param version
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * 
	 * @return min
	 */
	public String getMin() {
		return min;
	}

	/**
	 * 
	 * @param min
	 */
	public void setMin(String min) {
		this.min = min;
	}

	/**
	 * 
	 * @return max
	 */
	public String getMax() {
		return max;
	}

	/**
	 * 
	 * @param max
	 */
	public void setMax(String max) {
		this.max = max;
	}

	/**
	 * 
	 * @return billingAccount
	 */
	public String getBillingAccount() {
		return billingAccount;
	}

	/**
	 * 
	 * @param billingAccount
	 */
	public void setBillingAccount(String billingAccount) {
		this.billingAccount = billingAccount;
	}

	/**
	 * 
	 * @return stack
	 */
	public String getStack() {
		return stack;
	}

	/**
	 * 
	 * @param stack
	 */
	public void setStack(String stack) {
		this.stack = stack;
	}
}
