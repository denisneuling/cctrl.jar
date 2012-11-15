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
package com.cloudcontrolled.api;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.PropertyResourceBundle;

/**
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
public class JCcLib {

	private static List<String> complementaryLibs;
	private static final String KEY = "complements";
	private static final String FILE = "complements";

	public static List<String> complementaryPyCcLib() throws IOException {
		if (complementaryLibs == null) {
			complementaryLibs = new LinkedList<String>();
			InputStream inputStream = JCcLib.class.getClassLoader().getResourceAsStream(FILE);
			PropertyResourceBundle labels = new PropertyResourceBundle(inputStream);
			Enumeration<String> bundleKeys = labels.getKeys();
			while (bundleKeys.hasMoreElements()) {
				String key;
				if (KEY.equals(key = bundleKeys.nextElement())) {
					String value = labels.getString(key);
					if (value != null && !value.isEmpty()) {
						String[] values = value.split(",");
						for (String v : values) {
							complementaryLibs.add(v.trim());
						}
					}
				}
			}
		}
		return complementaryLibs;
	}
}
