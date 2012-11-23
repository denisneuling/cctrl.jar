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
import com.cloudcontrolled.api.response.ListSSHKeyResponse;

/**
 * Or for reference have a look here: <a
 * href="https://api.cloudcontrol.com/doc/#KeyGET"
 * >https://api.cloudcontrol.com/doc/#KeyGET</a>
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 *
 */
@Method(HttpMethod.GET)
@Path("/user/${user}/key/")
public class ListSSHKeyRequest extends Request<ListSSHKeyResponse> {
	private static final long serialVersionUID = 814735078935654001L;
	
	@Required
	@PathVariable("${user}")
	private String userName;

	/**
	 * <p>Constructor for ListSSHKeyRequest.</p>
	 */
	public ListSSHKeyRequest(){
	}

	/**
	 * <p>Getter for the field <code>userName</code>.</p>
	 *
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * <p>Setter for the field <code>userName</code>.</p>
	 *
	 * @param userName a {@link java.lang.String} object.
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
