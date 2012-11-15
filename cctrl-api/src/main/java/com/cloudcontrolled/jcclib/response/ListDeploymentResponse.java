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
package com.cloudcontrolled.jcclib.response;

import java.util.Arrays;

import com.cloudcontrolled.jcclib.annotation.Normalized;
import com.cloudcontrolled.jcclib.model.Deployment;
import com.cloudcontrolled.jcclib.response.normalize.ListDeploymentNormalizer;

/**
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
@Normalized(ListDeploymentNormalizer.class)
public class ListDeploymentResponse extends Response<ListDeploymentResponse> {
	private static final long serialVersionUID = 8058269792222102374L;

	private Deployment[] deployments;

	public ListDeploymentResponse() {
	}

	public Deployment[] getDeployments() {
		return deployments;
	}

	public void setDeployments(Deployment[] deployments) {
		this.deployments = deployments;
	}

	@Override
	public String toString() {
		return (deployments != null ? "ListDeploymentResponse [deployments=" + Arrays.toString(deployments) + "]" : super.toString());
	}

}
