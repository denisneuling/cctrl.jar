/**
 * 
 */
package com.cloudcontrolled.api.client;

import org.junit.Before;
import org.junit.Ignore;

import com.cloudcontrolled.api.client.auth.Credentials;

@Ignore
public class AbstractIntegrationTest {

	protected Credentials credentials;
	protected CloudControlClient client;

	protected String cctrl_email = System.getenv("CCTRL_EMAIL");
	protected String cctrl_password = System.getenv("CCTRL_PASSWORD");
	
	@Before
	public void setUp() {
		credentials = new Credentials(cctrl_email, cctrl_password);
		client = new CloudControlClient(credentials);
	}
}
