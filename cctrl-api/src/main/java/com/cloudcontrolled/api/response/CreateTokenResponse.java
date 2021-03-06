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

/**
 * <p>
 * CreateTokenResponse class.
 * </p>
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 *
 */
@Normalized
public class CreateTokenResponse extends Response<CreateTokenResponse> {
	private static final long serialVersionUID = -2507836690940500665L;

	private String token;

	/**
	 * <p>
	 * Constructor for CreateTokenResponse.
	 * </p>
	 */
	public CreateTokenResponse() {
	}

	/**
	 * <p>
	 * Getter for the field <code>token</code>.
	 * </p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getToken() {
		return token;
	}

	/**
	 * <p>
	 * Setter for the field <code>token</code>.
	 * </p>
	 *
	 * @param token
	 *            a {@link java.lang.String} object.
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return (token != null ? "CreateTokenResponse [token=" + token + "]" : super.toString());
	}
}
