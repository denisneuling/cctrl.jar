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
import com.cloudcontrolled.api.annotation.Method;
import com.cloudcontrolled.api.annotation.Path;
import com.cloudcontrolled.api.annotation.PathVariable;
import com.cloudcontrolled.api.annotation.Required;
import com.cloudcontrolled.api.common.HttpMethod;
import com.cloudcontrolled.api.response.ActivateUserResponse;

/**
 * 
 * Or for reference have a look here: <a
 * href="https://api.cloudcontrol.com/doc/#AnonymousUserUPDATE"
 * >https://api.cloudcontrol.com/doc/#AnonymousUserUPDATE</a>
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
@Method(HttpMethod.PUT)
@Path("/user/${user}")
public class ActivateUserRequest extends Request<ActivateUserResponse> {
	private static final long serialVersionUID = -6582517873225566694L;

	@Required
	@PathVariable("${user}")
	private String userName;

	@Required
	@Body("activation_code")
	private String activationCode;

	/**
	 * <p>
	 * Constructor for ActivateUserRequest.
	 * </p>
	 */
	public ActivateUserRequest() {
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

	/**
	 * <p>
	 * Getter for the field <code>activationCode</code>.
	 * </p>
	 * 
	 * @return activationCode
	 */
	public String getActivationCode() {
		return activationCode;
	}

	/**
	 * <p>
	 * Setter for the field <code>activationCode</code>.
	 * </p>
	 * 
	 * @param activationCode
	 *            a {@link java.lang.String} object.
	 */
	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}
}
