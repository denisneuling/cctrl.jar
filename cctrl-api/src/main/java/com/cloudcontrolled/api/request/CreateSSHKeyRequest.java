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
import com.cloudcontrolled.api.response.CreateSSHKeyResponse;

/**
 * Or for reference have a look here: <a
 * href="https://api.cloudcontrol.com/doc/#KeyCREATE"
 * >https://api.cloudcontrol.com/doc/#KeyCREATE</a>
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 */
@Method(HttpMethod.POST)
@Path("/user/${user}/key/")
public class CreateSSHKeyRequest extends Request<CreateSSHKeyResponse> {
	private static final long serialVersionUID = 7842402881332163683L;

	@Required
	@PathVariable("${user}")
	private String userName;

	@Required
	@Body("key")
	private String sshKey;

	public CreateSSHKeyRequest() {
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSshKey() {
		return sshKey;
	}

	public void setSshKey(String sshKey) {
		this.sshKey = sshKey;
	}
}
