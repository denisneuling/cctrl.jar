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
public class Worker extends AbstractModel {

	private String date_created;
	private String wrk_id;
	private String params;
	private String command;
	private int size;

	public Worker() {
	}

	public String getWrk_id() {
		return wrk_id;
	}

	public void setWrk_id(String wrk_id) {
		this.wrk_id = wrk_id;
	}

	public String getDate_created() {
		return date_created;
	}

	public void setDate_created(String date_created) {
		this.date_created = date_created;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Worker [date_created=" + date_created + ", wrk_id=" + wrk_id + ", params=" + params + ", command=" + command + ", size=" + size + "]";
	}
}
