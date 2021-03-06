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

import java.util.Arrays;

/**
 * The anonymous add-on object contains the name and the staging phase in which
 * the available add-on currently is. It also contains some options you might
 * use for your application.
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 *
 */
public class AddonAnonymous extends AbstractModel {

	private String name;
	private String stage;
	private AddonOption[] options;

	/**
	 * <p>
	 * Constructor for AddonAnonymous.
	 * </p>
	 */
	public AddonAnonymous() {
	}

	/**
	 * <p>
	 * Getter for the field <code>name</code>.
	 * </p>
	 *
	 * @return name the name of the concerning addon
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
	 * Getter for the field <code>stage</code>.
	 * </p>
	 *
	 * @return stage the staging phase in which the concerning add-on currently
	 *         is
	 */
	public String getStage() {
		return stage;
	}

	/**
	 * <p>
	 * Setter for the field <code>stage</code>.
	 * </p>
	 *
	 * @param stage
	 *            set the staging phase of the concerning add-on
	 */
	public void setStage(String stage) {
		this.stage = stage;
	}

	/**
	 * <p>
	 * getAddonOptions.
	 * </p>
	 *
	 * @return addonOption the add-on options of the concerning add-on
	 */
	public AddonOption[] getAddonOptions() {
		return options;
	}

	/**
	 * <p>
	 * setAddonOptions.
	 * </p>
	 *
	 * @param options
	 *            the add-on options to set
	 */
	public void setAddonOptions(AddonOption[] options) {
		this.options = options;
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return "AddonAnonymous [name=" + name + ", stage=" + stage + ", options=" + (options != null ? Arrays.toString(options) : "[]") + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((stage == null) ? 0 : stage.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddonAnonymous other = (AddonAnonymous) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (stage == null) {
			if (other.stage != null)
				return false;
		} else if (!stage.equals(other.stage))
			return false;
		return true;
	}
}
