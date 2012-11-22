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
import com.cloudcontrolled.api.response.DeleteWorkerResponse;

/**
 * 
 * Or for reference have a look here: <a
 * href="https://api.cloudcontrol.com/doc/#WorkerDELETE"
 * >https://api.cloudcontrol.com/doc/#WorkerDELETE</a>
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 */
@Method(HttpMethod.DELETE)
@Path("/app/${app}/deployment/${dep}/worker/${workerId}")
public class DeleteWorkerRequest extends Request<DeleteWorkerResponse> {
	private static final long serialVersionUID = 1820748358013229696L;

	@Required
	@PathVariable("${app}")
	private String applicationName;

	@Required
	@Default("default")
	@PathVariable("${dep}")
	private String deploymentName;

	@Required
	@PathVariable("${workerId}")
	private String workerId;

	public DeleteWorkerRequest() {
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
	 * @return workerId
	 */
	public String getWorkerId() {
		return workerId;
	}

	/**
	 * 
	 * @param workerId
	 */
	public void setWorkerId(String workerId) {
		this.workerId = workerId;
	}
}
