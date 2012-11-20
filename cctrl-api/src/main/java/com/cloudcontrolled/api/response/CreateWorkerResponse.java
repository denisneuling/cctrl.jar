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
import com.cloudcontrolled.api.model.Worker;
import com.cloudcontrolled.api.response.normalize.WorkerNormalizer;

/**
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
@Normalized(WorkerNormalizer.class)
public class CreateWorkerResponse extends Response<CreateWorkerResponse> {
	private static final long serialVersionUID = 2165820029548960756L;

	private Worker worker;

	public CreateWorkerResponse() {
	}

	public Worker getWorker() {
		return worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
	}

	@Override
	public String toString() {
		return (worker != null ? "CreateWorkerResponse [worker=" + worker + "]" : super.toString());
	}

}
