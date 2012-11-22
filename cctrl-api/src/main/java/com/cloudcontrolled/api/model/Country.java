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
 * The country object contains the country code and the name of the concerning
 * country.
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 */
public class Country extends AbstractModel {

	private String name;
	private String code;
	private boolean is_eu;

	public Country() {
	}

	/**
	 * 
	 * @return name the name of the country
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return code the country code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the country code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return isEU the boolean value which specifies if the country is whithin the EU
	 */
	public boolean isIs_eu() {
		return is_eu;
	}

	/**
	 * @param is_eu the boolean value which specifies whether the country is whithin the EU to set 
	 */
	public void setIs_eu(boolean is_eu) {
		this.is_eu = is_eu;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Country [name=" + name + ", code=" + code + ", is_eu=" + is_eu + "]";
	}
}
