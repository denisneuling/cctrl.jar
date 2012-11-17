package com.cloudcontrolled.api.response;

import com.cloudcontrolled.api.annotation.Normalized;
import com.cloudcontrolled.api.response.normalize.DeleteNormalizer;

@Normalized(DeleteNormalizer.class)
public class RemoveAddonResponse extends Response<RemoveAddonResponse> {
	private static final long serialVersionUID = -4214861050387527622L;

	private String message;

	public RemoveAddonResponse() {
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return (message != null && !message.isEmpty() ? "RemoveAddonResponse [message=" + message + "]" : super.toString());
	}
}
