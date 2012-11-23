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
package com.cloudcontrolled.api.response;

import com.cloudcontrolled.api.annotation.Normalized;
import com.cloudcontrolled.api.model.Application;
import com.cloudcontrolled.api.response.normalize.ApplicationNormalizer;

/**
 * <p>ApplicationResponse class.</p>
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 *
 */
@Normalized(ApplicationNormalizer.class)
public class ApplicationResponse extends Response<ApplicationResponse> {
	private static final long serialVersionUID = -5731452429379769349L;

	private Application application;

	/**
	 * <p>Constructor for ApplicationResponse.</p>
	 */
	public ApplicationResponse() {
	}

	/**
	 * <p>Getter for the field <code>application</code>.</p>
	 *
	 * @return a {@link com.cloudcontrolled.api.model.Application} object.
	 */
	public Application getApplication() {
		return application;
	}

	/**
	 * <p>Setter for the field <code>application</code>.</p>
	 *
	 * @param application a {@link com.cloudcontrolled.api.model.Application} object.
	 */
	public void setApplication(Application application) {
		this.application = application;
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return (application != null ? "ApplicationResponse [application=" + application + "]" : super.toString());
	}
}
