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
package com.cloudcontrolled.api.response.normalize;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * <p>
 * ListCollaboratorNormalizer class.
 * </p>
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 *
 */
public class ListCollaboratorNormalizer extends JSONNormalizer {

	/** {@inheritDoc} */
	@Override
	public String normalize(String jsonResponse) throws Exception {
		if (jsonResponse.equals("Not Implemented")) {
			return "{users: []}";
		} else {
			JSONArray array = new JSONArray(jsonResponse);
			Map<String, JSONArray> layout = new HashMap<String, JSONArray>();
			layout.put("users", array);
			JSONObject users = new JSONObject(layout);
			return users.toString();
		}
	}
}
