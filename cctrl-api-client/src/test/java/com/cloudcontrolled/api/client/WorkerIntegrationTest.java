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
package com.cloudcontrolled.api.client;

import org.junit.Ignore;
import org.junit.Test;

import com.cloudcontrolled.api.model.Worker;
import com.cloudcontrolled.api.request.CreateWorkerRequest;
import com.cloudcontrolled.api.request.DeleteWorkerRequest;
import com.cloudcontrolled.api.request.ListWorkerRequest;
import com.cloudcontrolled.api.response.CreateWorkerResponse;
import com.cloudcontrolled.api.response.DeleteWorkerResponse;
import com.cloudcontrolled.api.response.ListWorkerResponse;

/**
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 */
@Ignore
public class WorkerIntegrationTest  extends AbstractIntegrationTest {

	private String application = "djenkinsn";
	private String deployment = "default";
	private String worker = "worker.long";

	@Test
	public void testCreateWorker() {
		CreateWorkerRequest request = new CreateWorkerRequest();
		request.setApplicationName(application);
		request.setDeploymentName(deployment);
		request.setWorker(worker);

		CreateWorkerResponse response = client.send(request);
		System.out.println(response);
	}

	@Test
	public void testListWorkers() {
		ListWorkerRequest request = new ListWorkerRequest();
		request.setApplicationName(application);
		request.setDeploymentName(deployment);

		ListWorkerResponse response = client.send(request);
		System.out.println(response);

		Worker[] workers = response.getWorkers();
		if (workers != null) {
			for (int i = 0; i < workers.length; i++) {
				System.out.println(i + "\t" + workers[i]);
			}
		}
	}

	@Test
	public void testDeleteWorker() {
		DeleteWorkerRequest request = new DeleteWorkerRequest();
		request.setApplicationName(application);
		request.setDeploymentName(deployment);
		request.setWorkerId(worker);

		DeleteWorkerResponse response = client.send(request);
		System.out.println(response);
	}

	@Test
	public void testRemoveAllWorkers() {
		ListWorkerRequest listRequest = new ListWorkerRequest();
		listRequest.setApplicationName(application);
		listRequest.setDeploymentName(deployment);
		ListWorkerResponse listResponse = client.send(listRequest);
		Worker[] workers = listResponse.getWorkers();
		if (workers != null) {
			for (Worker worker : workers) {
				System.out.println(worker);

				DeleteWorkerRequest request = new DeleteWorkerRequest();
				request.setApplicationName(application);
				request.setDeploymentName(deployment);
				request.setWorkerId(worker.getWrk_id());

				DeleteWorkerResponse response = client.send(request);
				System.out.println(response);
			}
		}
	}
}