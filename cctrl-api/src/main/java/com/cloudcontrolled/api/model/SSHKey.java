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
package com.cloudcontrolled.api.model;

/**
 * The SSHKey object defines the resource 'public ssh key' which is registered
 * for an user.
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 */
public class SSHKey extends AbstractModel {

	private String key_id;
	private String key;

	public SSHKey() {
	}

	/**
	 * 
	 * @return key the sshKey
	 */
	public String getKey() {
		return key;
	}

	/**
	 * 
	 * @param key the sshKey to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * 
	 * @return keyId the ssh key id
	 */
	public String getKeyId() {
		return key_id;
	}

	/**
	 * 
	 * @param keyId the ssh key id to set
	 */
	public void setKeyId(String keyId) {
		this.key_id = keyId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SSHKey [keyId=" + key_id + ", key=" + key + "]";
	}
}
