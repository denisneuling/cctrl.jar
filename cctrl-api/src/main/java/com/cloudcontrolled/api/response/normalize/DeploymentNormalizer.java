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

import org.json.JSONObject;

/**
 * <p>DeploymentNormalizer class.</p>
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 * @version $Id: $Id
 */
public class DeploymentNormalizer extends JSONNormalizer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cloudcontrolled.api.response.normalize.JSONNormalizer#normalize(java
	 * .lang.String)
	 */
	/** {@inheritDoc} */
	@Override
	public String normalize(String jsonResponse) throws Exception {
		JSONObject body = new JSONObject(jsonResponse);
		Map<String, JSONObject> layout = new HashMap<String, JSONObject>();
		layout.put("deployment", body);
		JSONObject deployment = new JSONObject(layout);
		return deployment.toString();
	}
}
