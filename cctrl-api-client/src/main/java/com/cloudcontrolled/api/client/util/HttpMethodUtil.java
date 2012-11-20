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
package com.cloudcontrolled.api.client.util;

import com.cloudcontrolled.api.annotation.Method;
import com.cloudcontrolled.api.common.HttpMethod;
import com.cloudcontrolled.api.request.Request;

/**
 * 
 * @author Denis Neuling (denisneuling@gmail.com) 
 */
public class HttpMethodUtil {

	/**
	 * 
	 * @param request
	 * @return
	 */
	public static <T> HttpMethod retrieveMethod(Request<T> request) {
		if (request == null) {
			return null;
		}

		Class<?> clazz = request.getClass();

		Method method = clazz.getAnnotation(Method.class);
		HttpMethod httpMethod = method.value();
		return httpMethod;
	}
}
