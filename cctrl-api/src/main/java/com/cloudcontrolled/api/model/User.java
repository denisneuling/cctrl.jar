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
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 */
public class User extends AbstractModel {

	private String first_name;
	private String username;
	private boolean is_active = false;
	private String email;
	private String last_name;

	public User() {
	}

	/**
	 * 
	 * @return
	 */
	public String getFirstName() {
		return first_name;
	}

	/**
	 * 
	 * @param first_name
	 */
	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}

	/**
	 * 
	 * @return
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * 
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isIsActive() {
		return is_active;
	}

	/**
	 * 
	 * @param is_active
	 */
	public void setIsActive(boolean is_active) {
		this.is_active = is_active;
	}

	/**
	 * 
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 
	 * @return
	 */
	public String getLastName() {
		return last_name;
	}

	/**
	 * 
	 * @param last_name
	 */
	public void setLastName(String last_name) {
		this.last_name = last_name;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [firstName=" + first_name + ", username=" + username + ", isActive=" + is_active + ", email=" + email + ", lastName=" + last_name + "]";
	}

}
