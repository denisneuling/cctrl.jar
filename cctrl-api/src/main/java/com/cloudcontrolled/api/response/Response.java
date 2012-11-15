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
 * 
 * @param <T>
 */
public abstract class Response<T> implements Serializable {
	private static final long serialVersionUID = 60689416775607883L;

	private int statusCode = 0;
	private long responseTime = 0;
	private String content;
	private boolean error = false;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public long getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(long responseTime) {
		this.responseTime = responseTime;
	}

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "Response [statusCode=" + statusCode + ", responseTime=" + responseTime + ", error=" + error + ", content=" + content + "]";
	}
}
