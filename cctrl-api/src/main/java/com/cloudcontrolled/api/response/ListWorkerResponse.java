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
import com.cloudcontrolled.api.model.Worker;
import com.cloudcontrolled.api.response.normalize.ListWorkerNormalizer;

/**
 * <p>
 * ListWorkerResponse class.
 * </p>
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 *
 */
@Normalized(ListWorkerNormalizer.class)
public class ListWorkerResponse extends Response<ListWorkerResponse> {
	private static final long serialVersionUID = 9032991949433371955L;

	private Worker[] workers;

	/**
	 * <p>
	 * Constructor for ListWorkerResponse.
	 * </p>
	 */
	public ListWorkerResponse() {
	}

	/**
	 * <p>
	 * Getter for the field <code>workers</code>.
	 * </p>
	 *
	 * @return an array of {@link com.cloudcontrolled.api.model.Worker} objects.
	 */
	public Worker[] getWorkers() {
		return workers;
	}

	/**
	 * <p>
	 * Setter for the field <code>workers</code>.
	 * </p>
	 *
	 * @param workers
	 *            an array of {@link com.cloudcontrolled.api.model.Worker}
	 *            objects.
	 */
	public void setWorkers(Worker[] workers) {
		this.workers = workers;
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return (workers != null ? "ListWorkerResponse [workers=" + Arrays.toString(workers) + "]" : super.toString());
	}
}
