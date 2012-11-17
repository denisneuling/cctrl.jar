package com.cloudcontrolled.api.response;

import com.cloudcontrolled.api.annotation.Normalized;
import com.cloudcontrolled.api.model.Worker;
import com.cloudcontrolled.api.response.normalize.WorkerNormalizer;

@Normalized(WorkerNormalizer.class)
public class UpdateWorkerResponse extends Response<UpdateWorkerResponse> {
	private static final long serialVersionUID = -3207688814937244228L;

	private Worker worker;

	public UpdateWorkerResponse() {
	}

	public Worker getWorker() {
		return worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
	}

	@Override
	public String toString() {
		return (worker != null ? "UpdateWorkerResponse [worker=" + worker + "]" : super.toString());
	}

}
