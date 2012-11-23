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
import com.cloudcontrolled.api.model.User;
import com.cloudcontrolled.api.response.normalize.ListCollaboratorNormalizer;

/**
 * <p>ListCollaboratorResponse class.</p>
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 * @version $Id: $Id
 */
@Normalized(ListCollaboratorNormalizer.class)
public class ListCollaboratorResponse extends Response<ListCollaboratorResponse> {
	private static final long serialVersionUID = 814074686921683563L;

	private User[] users;

	/**
	 * <p>Constructor for ListCollaboratorResponse.</p>
	 */
	public ListCollaboratorResponse() {
	}

	/**
	 * <p>Getter for the field <code>users</code>.</p>
	 *
	 * @return an array of {@link com.cloudcontrolled.api.model.User} objects.
	 */
	public User[] getUsers() {
		return users;
	}

	/**
	 * <p>Setter for the field <code>users</code>.</p>
	 *
	 * @param users an array of {@link com.cloudcontrolled.api.model.User} objects.
	 */
	public void setUsers(User[] users) {
		this.users = users;
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return (users != null ? "ListCollaboratorResponse [users=" + Arrays.toString(users) + "]" : super.toString());
	}
}
