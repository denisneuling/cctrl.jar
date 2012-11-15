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
package com.cloudcontrolled.jcclib.response;

import com.cloudcontrolled.jcclib.annotation.Normalized;
import com.cloudcontrolled.jcclib.model.Application;
import com.cloudcontrolled.jcclib.response.normalize.ApplicationNormalizer;

/**
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
@Normalized(ApplicationNormalizer.class)
public class CreateApplicationResponse extends Response<CreateApplicationResponse> {
	private static final long serialVersionUID = -1075731840242800656L;

	private Application application;

	public CreateApplicationResponse() {
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	@Override
	public String toString() {
		return (application != null ? "CreateApplicationResponse [application=" + application + "]" : super.toString());
	}
}
