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
import com.cloudcontrolled.api.model.SSHKey;
import com.cloudcontrolled.api.response.normalize.SSHKeyNormalizer;

/**
 * <p>
 * SSHKeyResponse class.
 * </p>
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 *
 */
@Normalized(SSHKeyNormalizer.class)
public class SSHKeyResponse extends Response<SSHKeyResponse> {
	private static final long serialVersionUID = 4313276401170859390L;

	private SSHKey sshKey;

	/**
	 * <p>
	 * Constructor for SSHKeyResponse.
	 * </p>
	 */
	public SSHKeyResponse() {
	}

	/**
	 * <p>
	 * Getter for the field <code>sshKey</code>.
	 * </p>
	 *
	 * @return a {@link com.cloudcontrolled.api.model.SSHKey} object.
	 */
	public SSHKey getSshKey() {
		return sshKey;
	}

	/**
	 * <p>
	 * Setter for the field <code>sshKey</code>.
	 * </p>
	 *
	 * @param sshKey
	 *            a {@link com.cloudcontrolled.api.model.SSHKey} object.
	 */
	public void setSshKey(SSHKey sshKey) {
		this.sshKey = sshKey;
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return (sshKey != null ? "SSHKeyResponse [sshKey=" + sshKey + "]" : super.toString());
	}
}
