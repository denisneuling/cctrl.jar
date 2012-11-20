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
import com.cloudcontrolled.api.response.RemoveAddonResponse;

/**
 * 
 * @see {@link https://api.cloudcontrol.com/doc/#DeploymentAddonDELETE}
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 */
@Method(HttpMethod.DELETE)
@Path("/app/${app}/deployment/${dep}/addon/${name}/")
public class RemoveAddonRequest extends Request<RemoveAddonResponse> {
	private static final long serialVersionUID = -3558767136578119511L;

	@Required
	@PathVariable("${app}")
	private String applicationName;

	@Required
	@Default("default")
	@PathVariable("${dep}")
	private String deploymentName;

	@Required
	@PathVariable("${name}")
	private String addonName;

	public RemoveAddonRequest() {
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getDeploymentName() {
		return deploymentName;
	}

	public void setDeploymentName(String deploymentName) {
		this.deploymentName = deploymentName;
	}

	public String getAddonName() {
		return addonName;
	}

	public void setAddonName(String addonName) {
		this.addonName = addonName;
	}
}
