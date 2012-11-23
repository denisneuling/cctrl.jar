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

import java.util.Arrays;

import com.cloudcontrolled.api.annotation.Normalized;
import com.cloudcontrolled.api.model.Deployment;
import com.cloudcontrolled.api.response.normalize.ListDeploymentNormalizer;

/**
 * <p>ListDeploymentResponse class.</p>
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 * @version $Id: $Id
 */
@Normalized(ListDeploymentNormalizer.class)
public class ListDeploymentResponse extends Response<ListDeploymentResponse> {
	private static final long serialVersionUID = 8058269792222102374L;

	private Deployment[] deployments;

	/**
	 * <p>Constructor for ListDeploymentResponse.</p>
	 */
	public ListDeploymentResponse() {
	}

	/**
	 * <p>Getter for the field <code>deployments</code>.</p>
	 *
	 * @return an array of {@link com.cloudcontrolled.api.model.Deployment} objects.
	 */
	public Deployment[] getDeployments() {
		return deployments;
	}

	/**
	 * <p>Setter for the field <code>deployments</code>.</p>
	 *
	 * @param deployments an array of {@link com.cloudcontrolled.api.model.Deployment} objects.
	 */
	public void setDeployments(Deployment[] deployments) {
		this.deployments = deployments;
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return (deployments != null ? "ListDeploymentResponse [deployments=" + Arrays.toString(deployments) + "]" : super.toString());
	}

}
