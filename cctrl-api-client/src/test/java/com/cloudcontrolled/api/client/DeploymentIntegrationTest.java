package com.cloudcontrolled.api.client;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.cloudcontrolled.api.client.auth.Credentials;
import com.cloudcontrolled.api.request.DeploymentRequest;
import com.cloudcontrolled.api.response.DeploymentResponse;

@Ignore
public class DeploymentIntegrationTest {

	private String application = "zj";
	private String deployment = "default";

	private Credentials credentials;
	private CloudControlClient client;

	private String cctrl_email = System.getenv("CCTRL_EMAIL");
	private String cctrl_password = System.getenv("CCTRL_PASSWORD");

	@Before
	public void setUp() {
		credentials = new Credentials(cctrl_email, cctrl_password);
		client = new CloudControlClient(credentials);
	}

	@Test
	public void testDeployment() {
		DeploymentRequest request = new DeploymentRequest();
		request.setApplicationName(application);
		request.setDeploymentName(deployment);

		DeploymentResponse response = client.send(request);
		System.out.println(response);
	}
}
