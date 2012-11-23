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
 * The type object contains the name of the language in which your software was
 * produced.
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 *
 */
public class Type extends AbstractModel {

	private String name;

	/**
	 * <p>Constructor for Type.</p>
	 */
	public Type() {
	}

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return name the name to get.
	 */
	public String getName() {
		return name;
	}

	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name
	 *            the name to set.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return "Type [name=" + name + "]";
	}
}
