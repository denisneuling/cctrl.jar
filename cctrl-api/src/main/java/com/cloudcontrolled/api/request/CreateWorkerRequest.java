package com.cloudcontrolled.api.request;

import com.cloudcontrolled.api.annotation.Body;
import com.cloudcontrolled.api.annotation.Default;
import com.cloudcontrolled.api.annotation.Method;
import com.cloudcontrolled.api.annotation.Path;
import com.cloudcontrolled.api.annotation.PathVariable;
import com.cloudcontrolled.api.annotation.Required;
import com.cloudcontrolled.api.common.HttpMethod;
import com.cloudcontrolled.api.response.CreateWorkerResponse;

@Method(HttpMethod.POST)
@Path("/app/${app}/deployment/${dep}/worker/")
public class CreateWorkerRequest extends Request<CreateWorkerResponse> {
	private static final long serialVersionUID = 570410464951311432L;

	@Required
	@PathVariable("${app}")
	private String applicationName;

	@Required
	@Default("default")
	@PathVariable("${dep}")
	private String deploymentName;
	
	@Required
	@Body("command")
	private String worker;

	public CreateWorkerRequest(){
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getDeploymentName() {
		return deploymentName;
	}

	public void setDeploymentName(String deploymentName) {
		this.deploymentName = deploymentName;
	}

	public String getWorker() {
		return worker;
	}

	public void setWorker(String worker) {
		this.worker = worker;
	}
}
