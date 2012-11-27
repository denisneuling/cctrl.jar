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

import com.cloudcontrolled.api.annotation.Method;
import com.cloudcontrolled.api.annotation.Path;
import com.cloudcontrolled.api.annotation.PathVariable;
import com.cloudcontrolled.api.annotation.Required;
import com.cloudcontrolled.api.common.HttpMethod;
import com.cloudcontrolled.api.response.DeleteCollaboratorResponse;

/**
 *
 * Or for reference have a look here: <a
 * href="https://api.cloudcontrol.com/doc/#AppUserDELETE"
 * >https://api.cloudcontrol.com/doc/#AppUserDELETE</a>
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 *
 */
@Method(HttpMethod.DELETE)
@Path("/app/${app}/user/${user}/")
public class DeleteCollaboratorRequest extends Request<DeleteCollaboratorResponse> {
	private static final long serialVersionUID = 3602321896465773157L;

	@Required
	@PathVariable("${app}")
	private String applicationName;

	@Required
	@PathVariable("${user}")
	private String userName;

	/**
	 * <p>
	 * Constructor for DeleteCollaboratorRequest.
	 * </p>
	 */
	public DeleteCollaboratorRequest() {
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
	 * Getter for the field <code>userName</code>.
	 * </p>
	 *
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * <p>
	 * Setter for the field <code>userName</code>.
	 * </p>
	 *
	 * @param userName
	 *            a {@link java.lang.String} object.
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
