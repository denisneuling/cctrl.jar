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
import com.cloudcontrolled.api.model.AddonAnonymous;
import com.cloudcontrolled.api.request.AddAddonRequest;
import com.cloudcontrolled.api.request.AddonRequest;
import com.cloudcontrolled.api.request.AmendAddonRequest;
import com.cloudcontrolled.api.request.ListAddonAnonymousRequest;
import com.cloudcontrolled.api.request.ListAddonRequest;
import com.cloudcontrolled.api.request.RemoveAddonRequest;
import com.cloudcontrolled.api.response.AddAddonResponse;
import com.cloudcontrolled.api.response.AddonResponse;
import com.cloudcontrolled.api.response.AmendAddonResponse;
import com.cloudcontrolled.api.response.ListAddonAnonymousResponse;
import com.cloudcontrolled.api.response.ListAddonResponse;
import com.cloudcontrolled.api.response.RemoveAddonResponse;

/**
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 */
@Ignore
public class AddonIntegrationTest {

	private String application = "zj";
	private String deployment = "default";
	private String addonName = "mysqlsdev.free";
	private String addonAmendTo = "mysqlsdev.512mb";

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
	public void testListAddonsAnonymous() {
		ListAddonAnonymousRequest request = new ListAddonAnonymousRequest();

		ListAddonAnonymousResponse response = client.send(request);
		for (AddonAnonymous anon : response.getAddons()) {
			System.out.println(anon);
		}
	}

	@Test
	public void testAddAddon() {
		AddAddonRequest request = new AddAddonRequest();
		request.setApplicationName(application);
		request.setDeploymentName(deployment);
		request.setAddonName(addonName);

		AddAddonResponse response = client.send(request);
		System.out.println(response);
	}

	@Test
	public void testAmendAddon() {
		AmendAddonRequest request = new AmendAddonRequest();
		request.setApplicationName(application);
		request.setDeploymentName(deployment);

		request.setAddonAmendFrom(addonName);
		request.setAddonAmendTo(addonAmendTo);

		AmendAddonResponse response = client.send(request);
		System.out.println(response);

		request.setAddonAmendFrom(addonAmendTo);
		request.setAddonAmendTo(addonName);
		response = client.send(request);

		System.out.println(response);
	}

	@Test
	public void testListAddons() {
		ListAddonRequest request = new ListAddonRequest();
		request.setApplicationName(application);
		request.setDeploymentName(deployment);

		ListAddonResponse response = client.send(request);
		System.out.println(response);
	}

	@Test
	public void testAddon() {
		AddonRequest request = new AddonRequest();
		request.setApplicationName(application);
		request.setDeploymentName(deployment);
		request.setAddonName(addonName);

		AddonResponse response = client.send(request);
		System.out.println(response);
	}

	@Test
	public void testRemoveAddon() {
		RemoveAddonRequest request = new RemoveAddonRequest();
		request.setApplicationName(application);
		request.setDeploymentName(deployment);
		request.setAddonName(addonName);

		RemoveAddonResponse response = client.send(request);
		System.out.println(response);
	}
}
