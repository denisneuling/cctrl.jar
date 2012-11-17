package com.cloudcontrolled.api.response;

import com.cloudcontrolled.api.annotation.Normalized;
import com.cloudcontrolled.api.response.normalize.DeleteNormalizer;

@Normalized(DeleteNormalizer.class)
public class DeleteWorkerResponse extends Response<DeleteWorkerResponse> {
	private static final long serialVersionUID = -1861406199671269737L;

	private String message;

	public DeleteWorkerResponse() {
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return (message != null ? "DeleteWorkerResponse [message=" + message + "]" : super.toString());
	}
}
