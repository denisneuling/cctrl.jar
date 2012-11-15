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
package com.cloudcontrolled.jcctrlclient.json;

import com.cloudcontrolled.jcclib.response.Response;
import com.cloudcontrolled.jcctrlclient.exception.SerializationException;
import com.cloudcontrolled.jcctrlclient.util.StandardizationUtil;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

public class JsonDeserializer {

	protected Gson gson;

	public JsonDeserializer() {
		initializeGson();
	}

	private void initializeGson() {
		gson = new GsonBuilder().setExclusionStrategies(new ExclusionStrategy() {
			public boolean shouldSkipField(FieldAttributes fieldAttributes) {
				if (fieldAttributes.getName().equalsIgnoreCase("serialVersionUUID")) {
					return true;
				}
				return false;
			}

			public boolean shouldSkipClass(Class<?> arg0) {
				return false;
			}
		}).create();
	}

	@SuppressWarnings("unchecked")
	public <T> Response<T> fromJSON(String response, Response<T> target) {
		try {
			response = StandardizationUtil.getJSONStandardizer(target).normalize(response);
		} catch (Exception e) {
			throw new SerializationException(e);
		}

		try {
			Response<T> fromJson = gson.fromJson(response, target.getClass());
			if (fromJson == null) {
				fromJson = target;
			}
			return fromJson;
		} catch (JsonSyntaxException jse) {
			throw new SerializationException(jse);
		}
	}
}