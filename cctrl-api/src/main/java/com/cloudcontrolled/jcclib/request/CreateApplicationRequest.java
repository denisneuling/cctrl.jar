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
package com.cloudcontrolled.jcclib.request;

import com.cloudcontrolled.jcclib.annotation.Body;
import com.cloudcontrolled.jcclib.annotation.Default;
import com.cloudcontrolled.jcclib.annotation.Method;
import com.cloudcontrolled.jcclib.annotation.Path;
import com.cloudcontrolled.jcclib.annotation.Required;
import com.cloudcontrolled.jcclib.common.HttpMethod;
import com.cloudcontrolled.jcclib.response.CreateApplicationResponse;

/**
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
	// @PathVariable("${app}")
	private String applicationName;

	@Required
	@Body("type")
	private String type;

	@Required
	@Body("repository_type")
	@Default("git")
	private String repositoryType;

	public CreateApplicationRequest() {
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRepositoryType() {
		return repositoryType;
	}

	public void setRepositoryType(String repositoryType) {
		this.repositoryType = repositoryType;
	}
}
