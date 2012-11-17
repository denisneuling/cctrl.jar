package com.cloudcontrolled.api.response;

import com.cloudcontrolled.api.annotation.Normalized;
import com.cloudcontrolled.api.model.Worker;
import com.cloudcontrolled.api.response.normalize.WorkerNormalizer;

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
