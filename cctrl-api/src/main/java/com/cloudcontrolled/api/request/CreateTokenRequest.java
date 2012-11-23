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
import com.cloudcontrolled.api.annotation.Required;
import com.cloudcontrolled.api.common.HttpMethod;
import com.cloudcontrolled.api.response.CreateTokenResponse;

/**
 * 
 * Or for reference have a look here: <a
 * href="https://api.cloudcontrol.com/doc/#TokenCREATE"
 * >https://api.cloudcontrol.com/doc/#TokenCREATE</a>
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
@Method(HttpMethod.POST)
@Path("/token/")
public class CreateTokenRequest extends Request<CreateTokenResponse> {
	private static final long serialVersionUID = 1339629885239592904L;

	@Required
	private String user;

	@Required
	private String password;

	/**
	 * <p>
	 * Constructor for CreateTokenRequest.
	 * </p>
	 */
	public CreateTokenRequest() {
	}

	/**
	 * <p>
	 * Constructor for CreateTokenRequest.
	 * </p>
	 * 
	 * @param user
	 *            a {@link java.lang.String} object.
	 * @param password
	 *            a {@link java.lang.String} object.
	 */
	public CreateTokenRequest(String user, String password) {
		this.user = user;
		this.password = password;
	}

	/**
	 * <p>
	 * Getter for the field <code>user</code>.
	 * </p>
	 * 
	 * @return user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * <p>
	 * Setter for the field <code>user</code>.
	 * </p>
	 * 
	 * @param user
	 *            a {@link java.lang.String} object.
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * <p>
	 * Getter for the field <code>password</code>.
	 * </p>
	 * 
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <p>
	 * Setter for the field <code>password</code>.
	 * </p>
	 * 
	 * @param password
	 *            a {@link java.lang.String} object.
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
