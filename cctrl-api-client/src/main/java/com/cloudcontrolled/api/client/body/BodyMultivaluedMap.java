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
package com.cloudcontrolled.api.client.body;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.core.MultivaluedMap;

/**
 * <p>
 * BodyMultivaluedMap class.
 * </p>
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
public class BodyMultivaluedMap extends HashMap<String, List<String>> implements MultivaluedMap<String, String> {
	private static final long serialVersionUID = -4545725304226984837L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.ws.rs.core.MultivaluedMap#putSingle(java.lang.Object,
	 * java.lang.Object)
	 */
	/** {@inheritDoc} */
	@Override
	public void putSingle(String key, String value) {
		this.add(key, value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.ws.rs.core.MultivaluedMap#add(java.lang.Object,
	 * java.lang.Object)
	 */
	/** {@inheritDoc} */
	@Override
	public void add(String key, String value) {
		List<String> values = this.get(key);
		if (values == null) {
			this.put(key, new LinkedList<String>());
		}
		this.get(key).add(value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.ws.rs.core.MultivaluedMap#getFirst(java.lang.Object)
	 */
	/** {@inheritDoc} */
	@Override
	public String getFirst(String key) {
		return this.get(key).iterator().next();
	}

}
