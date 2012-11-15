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
package com.cloudcontrolled.api.response;

import com.cloudcontrolled.api.annotation.Normalized;
import com.cloudcontrolled.api.model.Deployment;
import com.cloudcontrolled.api.response.normalize.DeploymentNormalizer;

/**
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
@Normalized(DeploymentNormalizer.class)
public class CreateDeploymentResponse extends Response<CreateDeploymentResponse> {
	private static final long serialVersionUID = -7350070708615401910L;

	private Deployment deployment;

	public CreateDeploymentResponse() {
	}

	public Deployment getDeployment() {
		return deployment;
	}

	public void setDeployment(Deployment deployment) {
		this.deployment = deployment;
	}

	@Override
	public String toString() {
		return (deployment != null ? "CreateDeploymentResponse [deployment=" + deployment + "]" : super.toString());
	}

}