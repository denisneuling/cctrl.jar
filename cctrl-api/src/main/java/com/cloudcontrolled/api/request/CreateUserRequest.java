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
import com.cloudcontrolled.api.annotation.Required;
import com.cloudcontrolled.api.common.HttpMethod;
import com.cloudcontrolled.api.response.CreateUserResponse;

/**
 * 
 * Or for reference have a look here: <a
 * href="https://api.cloudcontrol.com/doc/#AnonymousUserCREATE"
 * >https://api.cloudcontrol.com/doc/#AnonymousUserCREATE</a>
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
@Method(HttpMethod.POST)
@Path("/user/")
public class CreateUserRequest extends Request<CreateUserResponse> {
	private static final long serialVersionUID = 140888473373753015L;

	@Required
	@Body("username")
	private String userName;

	@Required
	@Body("email")
	private String email;

	@Required
	@Body("password")
	private String password;

	public CreateUserRequest() {
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
