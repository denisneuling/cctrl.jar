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
package com.cloudcontrolled.jcclib.request;

import com.cloudcontrolled.jcclib.annotation.Method;
import com.cloudcontrolled.jcclib.annotation.Path;
import com.cloudcontrolled.jcclib.common.HttpMethod;
import com.cloudcontrolled.jcclib.response.ListUserResponse;

/**
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
@Method(HttpMethod.GET)
@Path("/user/")
public class ListUserRequest extends Request<ListUserResponse> {
	private static final long serialVersionUID = -5668729275505216560L;

}
