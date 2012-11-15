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

	public DeleteCollaboratorRequest() {
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
