package com.cloudcontrolled.api.request;

import com.cloudcontrolled.api.annotation.Default;
import com.cloudcontrolled.api.annotation.Method;
import com.cloudcontrolled.api.annotation.Path;
import com.cloudcontrolled.api.annotation.PathVariable;
import com.cloudcontrolled.api.annotation.Required;
import com.cloudcontrolled.api.common.HttpMethod;
import com.cloudcontrolled.api.response.ListWorkerResponse;

@Method(HttpMethod.GET)
@Path("/app/${app}/deployment/${dep}/worker/")
public class ListWorkerRequest extends Request<ListWorkerResponse> {
	private static final long serialVersionUID = -767679568310726872L;

	@Required
	@PathVariable("${app}")
	private String applicationName;

	@Required
	@Default("default")
	@PathVariable("${dep}")
	private String deploymentName;
	
	public ListWorkerRequest(){
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
}
