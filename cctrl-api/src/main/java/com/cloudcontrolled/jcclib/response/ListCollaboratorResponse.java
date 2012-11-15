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

import java.util.Arrays;

import com.cloudcontrolled.jcclib.annotation.Normalized;
import com.cloudcontrolled.jcclib.model.User;
import com.cloudcontrolled.jcclib.response.normalize.ListCollaboratorNormalizer;

/**
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
@Normalized(ListCollaboratorNormalizer.class)
public class ListCollaboratorResponse extends Response<ListCollaboratorResponse> {
	private static final long serialVersionUID = 814074686921683563L;

	private User[] users;

	public ListCollaboratorResponse() {
	}

	public User[] getUsers() {
		return users;
	}

	public void setUsers(User[] users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return (users != null ? "ListCollaboratorResponse [users=" + Arrays.toString(users) + "]" : super.toString());
	}
}
