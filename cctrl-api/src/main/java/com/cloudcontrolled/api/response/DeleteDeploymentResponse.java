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
import com.cloudcontrolled.api.response.normalize.DeleteNormalizer;

/**
 * <p>
 * DeleteDeploymentResponse class.
 * </p>
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 *
 */
@Normalized(DeleteNormalizer.class)
public class DeleteDeploymentResponse extends Response<DeleteDeploymentResponse> {
	private static final long serialVersionUID = -6155524889878735055L;

	private String message;

	/**
	 * <p>
	 * Constructor for DeleteDeploymentResponse.
	 * </p>
	 */
	public DeleteDeploymentResponse() {
	}

	/**
	 * <p>
	 * Getter for the field <code>message</code>.
	 * </p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * <p>
	 * Setter for the field <code>message</code>.
	 * </p>
	 *
	 * @param message
	 *            a {@link java.lang.String} object.
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return (message != null && !message.isEmpty() ? "DeleteDeploymentResponse [message=" + message + "]" : super.toString());
	}
}
