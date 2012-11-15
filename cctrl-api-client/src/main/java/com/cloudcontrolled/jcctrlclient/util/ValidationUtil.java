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
package com.cloudcontrolled.jcctrlclient.util;

import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;

import com.cloudcontrolled.jcclib.annotation.Required;
import com.cloudcontrolled.jcclib.request.Request;
import com.cloudcontrolled.jcctrlclient.exception.ValidationConstraintViolationException;
import com.cloudcontrolled.jcctrlclient.exception.ValidationConstraintViolationException.ConstraintViolation;

public class ValidationUtil {

	private static final String preMessage = "Request breaks constraints.";

	public static <T> void validate(Request<T> request) throws ValidationConstraintViolationException {
		if (request != null) {
			Class<?> clazz = request.getClass();
			List<ConstraintViolation> leafs = new LinkedList<ConstraintViolation>();

			Field[] fields = clazz.getDeclaredFields();
			for (Field field : fields) {
				if (null != field.getAnnotation(Required.class)) {

					field.setAccessible(true);
					Object value = null;
					try {
						value = field.get(request);
					} catch (Exception e) {
						// not cool...
						throw new ValidationConstraintViolationException(e);
					}

					if (value == null || value instanceof String && ((String) value).isEmpty()) {
						ConstraintViolation violation = ConstraintViolation.newConstraintViolation("@" + Required.class.getSimpleName(), field);
						leafs.add(violation);
					}
				}
			}

			if (!leafs.isEmpty()) {
				throw new ValidationConstraintViolationException(preMessage, leafs);
			}
		}
	}
}
