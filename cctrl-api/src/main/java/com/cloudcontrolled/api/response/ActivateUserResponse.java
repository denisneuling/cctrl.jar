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
import com.cloudcontrolled.api.model.User;
import com.cloudcontrolled.api.response.normalize.UserNormalizer;

/**
 * <p>ActivateUserResponse class.</p>
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 *
 */
@Normalized(UserNormalizer.class)
public class ActivateUserResponse extends Response<ActivateUserResponse> {
	private static final long serialVersionUID = 1931460727071524898L;

	private User user;

	/**
	 * <p>Constructor for ActivateUserResponse.</p>
	 */
	public ActivateUserResponse() {
	}

	/**
	 * <p>Getter for the field <code>user</code>.</p>
	 *
	 * @return a {@link com.cloudcontrolled.api.model.User} object.
	 */
	public User getUser() {
		return user;
	}

	/**
	 * <p>Setter for the field <code>user</code>.</p>
	 *
	 * @param user a {@link com.cloudcontrolled.api.model.User} object.
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return (user != null ? "ActivateUserResponse [user=" + user + "]" : super.toString());
	}
}
