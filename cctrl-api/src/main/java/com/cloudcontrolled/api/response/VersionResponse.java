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
import com.cloudcontrolled.api.model.Version;
import com.cloudcontrolled.api.response.normalize.VersionNormalizer;

/**
 * <p>
 * VersionResponse class.
 * </p>
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
@Normalized(VersionNormalizer.class)
public class VersionResponse extends Response<VersionResponse> {
	private static final long serialVersionUID = -6395571710067610037L;

	private Version version;

	/**
	 * <p>
	 * Constructor for VersionResponse.
	 * </p>
	 */
	public VersionResponse() {
	}

	/**
	 * <p>
	 * Getter for the field <code>version</code>.
	 * </p>
	 * 
	 * @return a {@link com.cloudcontrolled.api.model.Version} object.
	 */
	public Version getVersion() {
		return version;
	}

	/**
	 * <p>
	 * Setter for the field <code>version</code>.
	 * </p>
	 * 
	 * @param version
	 *            a {@link com.cloudcontrolled.api.model.Version} object.
	 */
	public void setVersion(Version version) {
		this.version = version;
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return (version != null ? "VersionResponse [version=" + version + "]" : super.toString());
	}
}
