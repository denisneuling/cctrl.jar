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

import com.cloudcontrolled.api.annotation.Normalized;
import com.cloudcontrolled.api.response.Response;
import com.cloudcontrolled.api.response.normalize.JSONNormalizer;

/**
 * <p>
 * StandardizationUtil class.
 * </p>
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
public class StandardizationUtil {

	/**
	 * <p>
	 * getJSONStandardizer.
	 * </p>
	 * 
	 * @param response
	 *            a {@link com.cloudcontrolled.api.response.Response} object.
	 * @param <T>
	 *            a T object.
	 * @return a
	 *         {@link com.cloudcontrolled.api.response.normalize.JSONNormalizer}
	 *         object.
	 */
	@SuppressWarnings("unchecked")
	public static <T> JSONNormalizer getJSONStandardizer(Response<T> response) {
		JSONNormalizer standardizer = new JSONNormalizer();
		Class<JSONNormalizer> standardizerClazz = ClassUtil.getClassAnnotationValue(response.getClass(), Normalized.class, "value", Class.class);
		if (standardizerClazz != null) {
			try {
				standardizer = standardizerClazz.newInstance();
			} catch (InstantiationException e) {
			} catch (IllegalAccessException e) {
			}
		}
		return standardizer;
	}
}
