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

import java.util.Arrays;

import com.cloudcontrolled.api.annotation.Normalized;
import com.cloudcontrolled.api.model.Application;
import com.cloudcontrolled.api.response.normalize.ListApplicationNormalizer;

/**
 * <p>ListApplicationResponse class.</p>
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 * @version $Id: $Id
 */
@Normalized(ListApplicationNormalizer.class)
public class ListApplicationResponse extends Response<ListApplicationResponse> {
	private static final long serialVersionUID = -6542551047552557842L;

	private Application[] applications;

	/**
	 * <p>Constructor for ListApplicationResponse.</p>
	 */
	public ListApplicationResponse() {
	}

	/**
	 * <p>Getter for the field <code>applications</code>.</p>
	 *
	 * @return an array of {@link com.cloudcontrolled.api.model.Application} objects.
	 */
	public Application[] getApplications() {
		return applications;
	}

	/**
	 * <p>Setter for the field <code>applications</code>.</p>
	 *
	 * @param applications an array of {@link com.cloudcontrolled.api.model.Application} objects.
	 */
	public void setApplications(Application[] applications) {
		this.applications = applications;
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return (applications != null ? "ListApplicationRequest [applications=" + Arrays.toString(applications) + "]" : super.toString());
	}

}
