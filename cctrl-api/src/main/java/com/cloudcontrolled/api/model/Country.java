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
package com.cloudcontrolled.api.model;

/**
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
public class Country {

	private String name;
	private String code;
	private boolean is_eu;

	public Country() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isIs_eu() {
		return is_eu;
	}

	public void setIs_eu(boolean is_eu) {
		this.is_eu = is_eu;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", code=" + code + ", is_eu=" + is_eu + "]";
	}
}
