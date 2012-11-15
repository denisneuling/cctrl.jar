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

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.ws.rs.core.MultivaluedMap;

import com.cloudcontrolled.api.annotation.Body;
import com.cloudcontrolled.api.client.body.BodyMultivaluedMap;
import com.cloudcontrolled.api.request.Request;
import com.cloudcontrolled.api.response.Response;

public class RequestUtil {

	@SuppressWarnings("unchecked")
	public static <T> Response<T> getInstanceOfParameterizedType(Request<T> request) {
		Type superclazz = request.getClass().getGenericSuperclass();
		try {
			Type parameterizedTypeClazz = ((ParameterizedType) superclazz).getActualTypeArguments()[0];
			return (Response<T>) ((Class<T>) parameterizedTypeClazz).newInstance();
		} catch (Exception e) {
			return null;
		}
	}

	public static <T> MultivaluedMap<String, String> getBodyAsMultiValuedMap(Request<T> request) {
		MultivaluedMap<String, String> map = new BodyMultivaluedMap();

		Class<?> referenceClazz = request.getClass();
		List<Field> fields = ClassUtil.getAnnotatedFields(referenceClazz, Body.class);
		for (Field field : fields) {
			Body body = field.getAnnotation(Body.class);
			String parameter = body.value();

			// in case the value() is null or empty
			if (parameter == null || (parameter != null && parameter.isEmpty())) {
				parameter = field.getName();
			}
			String value = ClassUtil.getValueOf(field, request, referenceClazz, String.class);

			map.putSingle(parameter, value);
		}

		return map;
	}
}
