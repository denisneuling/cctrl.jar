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
import com.cloudcontrolled.api.response.AmendAddonResponse;

/**
 * 
 * 
 * Or for reference have a look here: <a
 * href="https://api.cloudcontrol.com/doc/#DeploymentAddonUPDATE"
 * >https://api.cloudcontrol.com/doc/#DeploymentAddonUPDATE</a>
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 */
@Method(HttpMethod.PUT)
@Path("/app/${app}/deployment/${dep}/addon/${amendFrom}/")
public class AmendAddonRequest extends Request<AmendAddonResponse> {
	private static final long serialVersionUID = 5207560465418872029L;

	@Required
	@PathVariable("${app}")
	private String applicationName;

	@Required
	@Default("default")
	@PathVariable("${dep}")
	private String deploymentName;

	@Required
	@PathVariable("${amendFrom}")
	private String addonAmendFrom;

	@Required
	@Body("addon")
	private String addonAmendTo;

	public AmendAddonRequest() {
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

	public String getAddonAmendFrom() {
		return addonAmendFrom;
	}

	public void setAddonAmendFrom(String addonAmendFrom) {
		this.addonAmendFrom = addonAmendFrom;
	}

	public String getAddonAmendTo() {
		return addonAmendTo;
	}

	public void setAddonAmendTo(String addonAmendTo) {
		this.addonAmendTo = addonAmendTo;
	}
}
