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

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.cloudcontrolled.api.client.auth.Credentials;
import com.cloudcontrolled.api.request.CreateSSHKeyRequest;
import com.cloudcontrolled.api.request.DeleteSSHKeyRequest;
import com.cloudcontrolled.api.request.ListSSHKeyRequest;
import com.cloudcontrolled.api.request.SSHKeyRequest;
import com.cloudcontrolled.api.response.CreateSSHKeyResponse;
import com.cloudcontrolled.api.response.DeleteSSHKeyResponse;
import com.cloudcontrolled.api.response.ListSSHKeyResponse;
import com.cloudcontrolled.api.response.SSHKeyResponse;

/**
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 */
@Ignore
public class SSHKeyIntegrationTest {

	private String user = "fakeuser";

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
	public void testListSSHKeys() {
		ListSSHKeyRequest request = new ListSSHKeyRequest();
		request.setUserName(user);

		ListSSHKeyResponse response = client.send(request);
		System.out.println(response);
	}

	@Test
	public void testCreateSSHKey() {
		CreateSSHKeyRequest request = new CreateSSHKeyRequest();
		request.setUserName(user);
		request.setSshKey("5w8JWmAFVe");

		CreateSSHKeyResponse response = client.send(request);
		System.out.println(response);
	}

	@Test
	public void testSSHKey() {
		SSHKeyRequest request = new SSHKeyRequest();
		request.setUserName(user);
		request.setSshKeyId("JX62HbVjHr");

		SSHKeyResponse response = client.send(request);
		System.out.println(response);
	}

	@Test
	public void testDeleteSSHKey() {
		DeleteSSHKeyRequest request = new DeleteSSHKeyRequest();
		request.setUserName(user);
		request.setSshKeyId("5w8JWmAFVe");

		DeleteSSHKeyResponse response = client.send(request);
		System.out.println(response);
	}
}
