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
 * The user object contains informations about requested users. For example
 * users which have access to your application / deployment or user accounts you
 * own.
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
	 * @return preName the prename of the concerning user
	 */
	public String getFirstName() {
		return first_name;
	}

	/**
	 * @param first_name the prename to set
	 */
	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}

	/**
	 * @return username the username of the concerning user
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return active the boolean value which specifies whether the user is active
	 */
	public boolean isActive() {
		return is_active;
	}

	/**
	 * @param is_active the boolean value to set
	 */
	public void setActive(boolean is_active) {
		this.is_active = is_active;
	}

	/**
	 * @return emailAddress the eamil address of the user
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email address to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return surName the surname of the concerning user
	 */
	public String getLastName() {
		return last_name;
	}

	/**
	 * @param last_name the surname to set
	 */
	public void setLastName(String last_name) {
		this.last_name = last_name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [firstName=" + first_name + ", username=" + username + ", isActive=" + is_active + ", email=" + email + ", lastName=" + last_name + "]";
	}

}
