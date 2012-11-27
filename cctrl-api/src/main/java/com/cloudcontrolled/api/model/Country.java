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
 *
 */
public class Country extends AbstractModel {

	private String name;
	private String code;
	private boolean is_eu;

	/**
	 * <p>
	 * Constructor for Country.
	 * </p>
	 */
	public Country() {
	}

	/**
	 * <p>
	 * Getter for the field <code>name</code>.
	 * </p>
	 *
	 * @return name the name of the country
	 */
	public String getName() {
		return name;
	}

	/**
	 * <p>
	 * Setter for the field <code>name</code>.
	 * </p>
	 *
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>
	 * Getter for the field <code>code</code>.
	 * </p>
	 *
	 * @return code the country code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <p>
	 * Setter for the field <code>code</code>.
	 * </p>
	 *
	 * @param code
	 *            the country code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * <p>
	 * isIs_eu.
	 * </p>
	 *
	 * @return isEU the boolean value which specifies if the country is whithin
	 *         the EU
	 */
	public boolean isIs_eu() {
		return is_eu;
	}

	/**
	 * <p>
	 * Setter for the field <code>is_eu</code>.
	 * </p>
	 *
	 * @param is_eu
	 *            the boolean value which specifies whether the country is
	 *            whithin the EU to set
	 */
	public void setIs_eu(boolean is_eu) {
		this.is_eu = is_eu;
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return "Country [name=" + name + ", code=" + code + ", is_eu=" + is_eu + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
