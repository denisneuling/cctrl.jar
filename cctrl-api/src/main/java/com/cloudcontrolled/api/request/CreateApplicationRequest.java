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
import com.cloudcontrolled.api.annotation.Required;
import com.cloudcontrolled.api.common.HttpMethod;
import com.cloudcontrolled.api.response.CreateApplicationResponse;

/**
 * 
 * Or for reference have a look here: <a
 * href="https://api.cloudcontrol.com/doc/#AppCREATE"
 * >https://api.cloudcontrol.com/doc/#AppCREATE</a>
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
@Method(HttpMethod.POST)
@Path("/app/")
public class CreateApplicationRequest extends Request<CreateApplicationResponse> {
	private static final long serialVersionUID = 4901904030674312866L;

	@Required
	@Body("name")
	private String applicationName;

	@Required
	@Body("type")
	private String type;

	@Required
	@Body("repository_type")
	@Default("git")
	private String repositoryType;

	/**
	 * <p>
	 * Constructor for CreateApplicationRequest.
	 * </p>
	 */
	public CreateApplicationRequest() {
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
	 * Getter for the field <code>type</code>.
	 * </p>
	 * 
	 * @return type
	 */
	public String getType() {
		return type;
	}

	/**
	 * <p>
	 * Setter for the field <code>type</code>.
	 * </p>
	 * 
	 * @param type
	 *            a {@link java.lang.String} object.
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * <p>
	 * Getter for the field <code>repositoryType</code>.
	 * </p>
	 * 
	 * @return repositoryType
	 */
	public String getRepositoryType() {
		return repositoryType;
	}

	/**
	 * <p>
	 * Setter for the field <code>repositoryType</code>.
	 * </p>
	 * 
	 * @param repositoryType
	 *            a {@link java.lang.String} object.
	 */
	public void setRepositoryType(String repositoryType) {
		this.repositoryType = repositoryType;
	}
}
