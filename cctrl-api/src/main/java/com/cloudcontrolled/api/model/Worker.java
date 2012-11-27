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
 * The worker object contains informations about your heavy working scripts and
 * / or programs which are connected to your deployment.
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 *
 */
public class Worker extends AbstractModel {

	private String date_created;
	private String wrk_id;
	private String params;
	private String command;
	private int size;

	/**
	 * <p>
	 * Constructor for Worker.
	 * </p>
	 */
	public Worker() {
	}

	/**
	 * <p>
	 * Getter for the field <code>wrk_id</code>.
	 * </p>
	 *
	 * @return workerId the id of the concerning worker
	 */
	public String getWrk_id() {
		return wrk_id;
	}

	/**
	 * <p>
	 * Setter for the field <code>wrk_id</code>.
	 * </p>
	 *
	 * @param wrk_id
	 *            the worker id to set
	 */
	public void setWrk_id(String wrk_id) {
		this.wrk_id = wrk_id;
	}

	/**
	 * <p>
	 * Getter for the field <code>date_created</code>.
	 * </p>
	 *
	 * @return created the datetime when the worker was created
	 */
	public String getDate_created() {
		return date_created;
	}

	/**
	 * <p>
	 * Setter for the field <code>date_created</code>.
	 * </p>
	 *
	 * @param date_created
	 *            the datetime to set
	 */
	public void setDate_created(String date_created) {
		this.date_created = date_created;
	}

	/**
	 * <p>
	 * Getter for the field <code>params</code>.
	 * </p>
	 *
	 * @return parameters the parameters of the worker start command
	 */
	public String getParams() {
		return params;
	}

	/**
	 * <p>
	 * Setter for the field <code>params</code>.
	 * </p>
	 *
	 * @param params
	 *            the parameters to set
	 */
	public void setParams(String params) {
		this.params = params;
	}

	/**
	 * <p>
	 * Getter for the field <code>command</code>.
	 * </p>
	 *
	 * @return command the command how the worker was started
	 */
	public String getCommand() {
		return command;
	}

	/**
	 * <p>
	 * Setter for the field <code>command</code>.
	 * </p>
	 *
	 * @param command
	 *            the command to set
	 */
	public void setCommand(String command) {
		this.command = command;
	}

	/**
	 * <p>
	 * Getter for the field <code>size</code>.
	 * </p>
	 *
	 * @return size the amount of memory which the worker can use
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <p>
	 * Setter for the field <code>size</code>.
	 * </p>
	 *
	 * @param size
	 *            the amount of memory to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return "Worker [date_created=" + date_created + ", wrk_id=" + wrk_id + ", params=" + params + ", command=" + command + ", size=" + size + "]";
	}
}
