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

import org.junit.Ignore;
import org.junit.Test;

import com.cloudcontrolled.api.request.ActivateUserRequest;
import com.cloudcontrolled.api.request.CreateUserRequest;
import com.cloudcontrolled.api.response.ActivateUserResponse;
import com.cloudcontrolled.api.response.CreateUserResponse;

/**
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 */
@Ignore
public class UserIntegrationTest extends AbstractIntegrationTest {

	@Test
	@Ignore
	public void testRegisterUser() {
		CreateUserRequest request = new CreateUserRequest();

		CreateUserResponse response = client.send(request);
		System.out.println(response);
	}

	@Test
	public void testActivateUser() {
		ActivateUserRequest request = new ActivateUserRequest();
		request.setUserName("fakeuser");
		request.setActivationCode("123");

		ActivateUserResponse response = client.send(request);
		System.out.println(response);
	}
}
