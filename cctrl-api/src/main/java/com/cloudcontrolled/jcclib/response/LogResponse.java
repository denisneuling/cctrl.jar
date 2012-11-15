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
import com.cloudcontrolled.jcclib.model.Log;
import com.cloudcontrolled.jcclib.response.normalize.LogNormalizer;

/**
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
@Normalized(LogNormalizer.class)
public class LogResponse extends Response<LogResponse> {
	private static final long serialVersionUID = 8425318770753218952L;

	private Log[] logs;

	public LogResponse() {
	}

	public Log[] getLogs() {
		return logs;
	}

	public void setLogs(Log[] logs) {
		this.logs = logs;
	}

	@Override
	public String toString() {
		return (logs != null ? "LogResponse [logs=" + Arrays.toString(logs) + "]" : super.toString());
	}
}