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
import com.cloudcontrolled.api.model.Log;
import com.cloudcontrolled.api.response.normalize.LogNormalizer;

/**
 * <p>LogResponse class.</p>
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 * @version $Id: $Id
 */
@Normalized(LogNormalizer.class)
public class LogResponse extends Response<LogResponse> {
	private static final long serialVersionUID = 8425318770753218952L;

	private Log[] logs;

	/**
	 * <p>Constructor for LogResponse.</p>
	 */
	public LogResponse() {
	}

	/**
	 * <p>Getter for the field <code>logs</code>.</p>
	 *
	 * @return an array of {@link com.cloudcontrolled.api.model.Log} objects.
	 */
	public Log[] getLogs() {
		return logs;
	}

	/**
	 * <p>Setter for the field <code>logs</code>.</p>
	 *
	 * @param logs an array of {@link com.cloudcontrolled.api.model.Log} objects.
	 */
	public void setLogs(Log[] logs) {
		this.logs = logs;
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return (logs != null ? "LogResponse [logs=" + Arrays.toString(logs) + "]" : super.toString());
	}
}
