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

import com.cloudcontrolled.api.annotation.Default;
import com.cloudcontrolled.api.annotation.Method;
import com.cloudcontrolled.api.annotation.Path;
import com.cloudcontrolled.api.annotation.PathVariable;
import com.cloudcontrolled.api.annotation.Required;
import com.cloudcontrolled.api.common.HttpMethod;
import com.cloudcontrolled.api.response.ListWorkerResponse;

/**
 * 
 * Or for reference have a look here: <a
 * href="https://api.cloudcontrol.com/doc/#WorkerREAD"
 * >https://api.cloudcontrol.com/doc/#WorkerREAD</a>
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
@Method(HttpMethod.GET)
@Path("/app/${app}/deployment/${dep}/worker/")
public class ListWorkerRequest extends Request<ListWorkerResponse> {
	private static final long serialVersionUID = -767679568310726872L;

	@Required
	@PathVariable("${app}")
	private String applicationName;

	@Required
	@Default("default")
	@PathVariable("${dep}")
	private String deploymentName;

	/**
	 * <p>
	 * Constructor for ListWorkerRequest.
	 * </p>
	 */
	public ListWorkerRequest() {
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
}
