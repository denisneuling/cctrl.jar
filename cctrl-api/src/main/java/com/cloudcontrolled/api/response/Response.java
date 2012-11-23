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

import java.io.Serializable;

/**
 * Abstract Response class which represents the http response of the fired http
 * request
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 * @param <T>
 *
 */
public abstract class Response<T> implements Serializable {
	private static final long serialVersionUID = 60689416775607883L;

	private int statusCode = 0;
	private long responseTime = 0;
	private String content;
	private boolean error = false;

	/**
	 * <p>Getter for the field <code>content</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <p>Setter for the field <code>content</code>.</p>
	 *
	 * @param content a {@link java.lang.String} object.
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * <p>Getter for the field <code>statusCode</code>.</p>
	 *
	 * @return a int.
	 */
	public int getStatusCode() {
		return statusCode;
	}

	/**
	 * <p>Setter for the field <code>statusCode</code>.</p>
	 *
	 * @param statusCode a int.
	 */
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * <p>Getter for the field <code>responseTime</code>.</p>
	 *
	 * @return a long.
	 */
	public long getResponseTime() {
		return responseTime;
	}

	/**
	 * <p>Setter for the field <code>responseTime</code>.</p>
	 *
	 * @param responseTime a long.
	 */
	public void setResponseTime(long responseTime) {
		this.responseTime = responseTime;
	}

	/**
	 * <p>isError.</p>
	 *
	 * @return a boolean.
	 */
	public boolean isError() {
		return error;
	}

	/**
	 * <p>Setter for the field <code>error</code>.</p>
	 *
	 * @param error a boolean.
	 */
	public void setError(boolean error) {
		this.error = error;
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return "Response [statusCode=" + statusCode + ", responseTime=" + responseTime + ", error=" + error + ", content=" + content + "]";
	}
}
