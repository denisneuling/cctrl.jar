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
 * There are several log types in which the deployments log is separated. You
 * might chose between:
 * <ul>
 * <li><strong>access</strong> <small>for an overview about the activity of your
 * deployment</small></li>
 * <li><strong>error</strong> <small>for an overview about everything else what
 * goes through STDOUT or STDERR</small></li>
 * <li><strong>worker</strong> <small>for an overview about the activity of your
 * workers belonging to your deployment</small></li>
 * <li><strong>deploy</strong> <small>for an overview about the activity while
 * the deployment is installing</small></li>
 * </ul>
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
public enum LogType {

	/**
	 * Everything which goes over STDOUT or STDERR.
	 */
	ERROR("error"),

	/**
	 * Logs, which were produced by your deployments worker.
	 */
	WORKER("worker"),

	/**
	 * Access logs, which were produces by accessing the concerning deployment.
	 */
	ACCESS("access"),

	/**
	 * Deploy logs, which were produces by installing a new version of the
	 * concerning deployment.
	 */
	DEPLOY("deploy");

	private String name;

	private LogType(String type) {
		this.name = type;
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return name;
	}
}
