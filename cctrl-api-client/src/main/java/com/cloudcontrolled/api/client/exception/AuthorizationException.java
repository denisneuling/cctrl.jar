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
package com.cloudcontrolled.api.client.exception;

/**
 * <p>
 * AuthorizationException class.
 * </p>
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
public class AuthorizationException extends CloudControlClientException {
	private static final long serialVersionUID = -2005842973892589494L;

	/**
	 * <p>
	 * Constructor for AuthorizationException.
	 * </p>
	 * 
	 * @param message
	 *            a {@link java.lang.String} object.
	 */
	public AuthorizationException(String message) {
		super(message);
	}

	/**
	 * <p>
	 * Constructor for AuthorizationException.
	 * </p>
	 * 
	 * @param th
	 *            a {@link java.lang.Throwable} object.
	 */
	public AuthorizationException(Throwable th) {
		super(th);
	}
}
