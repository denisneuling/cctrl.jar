package com.cloudcontrolled.api.response;

import java.util.Arrays;

import com.cloudcontrolled.api.annotation.Normalized;
import com.cloudcontrolled.api.model.Worker;
import com.cloudcontrolled.api.response.normalize.ListWorkerNormalizer;

@Normalized(ListWorkerNormalizer.class)
public class ListWorkerResponse extends Response<ListWorkerResponse> {
	private static final long serialVersionUID = 9032991949433371955L;

	private Worker[] workers;

	public ListWorkerResponse() {
	}

	public Worker[] getWorkers() {
		return workers;
	}

	public void setWorkers(Worker[] workers) {
		this.workers = workers;
	}

	@Override
	public String toString() {
		return (workers != null ? "ListWorkerResponse [workers=" + Arrays.toString(workers) + "]" : super.toString());
	}
}
