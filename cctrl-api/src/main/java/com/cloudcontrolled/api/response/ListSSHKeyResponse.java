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
import com.cloudcontrolled.api.model.SSHKey;
import com.cloudcontrolled.api.response.normalize.ListSSHKeyNormalizer;

/**
 * <p>ListSSHKeyResponse class.</p>
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 * @version $Id: $Id
 */
@Normalized(ListSSHKeyNormalizer.class)
public class ListSSHKeyResponse extends Response<ListSSHKeyResponse> {
	private static final long serialVersionUID = -4567966616530856996L;

	private SSHKey[] sshKeys;

	/**
	 * <p>Getter for the field <code>sshKeys</code>.</p>
	 *
	 * @return an array of {@link com.cloudcontrolled.api.model.SSHKey} objects.
	 */
	public SSHKey[] getSshKeys() {
		return sshKeys;
	}

	/**
	 * <p>Setter for the field <code>sshKeys</code>.</p>
	 *
	 * @param sshKeys an array of {@link com.cloudcontrolled.api.model.SSHKey} objects.
	 */
	public void setSshKeys(SSHKey[] sshKeys) {
		this.sshKeys = sshKeys;
	}

	/*
	 * (non-Javadoc)
	 * @see com.cloudcontrolled.api.response.Response#toString()
	 */
	/** {@inheritDoc} */
	@Override
	public String toString() {
		return (sshKeys!=null?"ListSSHKeyResponse [sshKeys=" + Arrays.toString(sshKeys) + "]":super.toString());
	}
}
