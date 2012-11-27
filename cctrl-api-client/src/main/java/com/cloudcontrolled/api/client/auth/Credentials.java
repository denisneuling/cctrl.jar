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
package com.cloudcontrolled.api.client.auth;

/**
 * <p>
 * Credentials class.
 * </p>
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 *
 */
public class Credentials {

	private String userName;
	private String password;

	/**
	 * <p>
	 * Constructor for Credentials.
	 * </p>
	 */
	public Credentials() {
	}

	/**
	 * <p>
	 * Constructor for Credentials.
	 * </p>
	 *
	 * @param userName
	 *            a {@link java.lang.String} object.
	 * @param password
	 *            a {@link java.lang.String} object.
	 */
	public Credentials(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	/**
	 * <p>
	 * Getter for the field <code>userName</code>.
	 * </p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * <p>
	 * Setter for the field <code>userName</code>.
	 * </p>
	 *
	 * @param userName
	 *            a {@link java.lang.String} object.
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * <p>
	 * Getter for the field <code>password</code>.
	 * </p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <p>
	 * Setter for the field <code>password</code>.
	 * </p>
	 *
	 * @param password
	 *            a {@link java.lang.String} object.
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
