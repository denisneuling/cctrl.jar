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

import java.util.HashMap;

/**
 * The addon object contains the settings how to access the concerning addon and
 * its configurable options.
 * <p>Example</p>
 * If you add a <strong>datasource</strong> the settings map contains at least your
 * <strong>credentials</strong> and the unified resource locator of the concerning addon.
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 */
public class Addon extends AbstractModel {

	private AddonOption addon_option;
	private HashMap<String, String> settings;

	public Addon() {
	}

	/**
	 * @return settings the settings map which contains all you need to use the addon.
	 */
	public HashMap<String, String> getSettings() {
		return settings;
	}

	/**
	 * 
	 * @param settings 
	 */
	public void setSettings(HashMap<String, String> settings) {
		this.settings = settings;
	}

	/**
	 * 
	 * @return
	 */
	public AddonOption getAddon_option() {
		return addon_option;
	}

	/**
	 * 
	 * @param addon_option
	 */
	public void setAddon_option(AddonOption addon_option) {
		this.addon_option = addon_option;
	}

	/**
	 * 
	 * @return
	 */
	public AddonOption getAddonOption() {
		return addon_option;
	}

	/**
	 * 
	 * @param addon_option
	 */
	public void setAddonOption(AddonOption addon_option) {
		this.addon_option = addon_option;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Addon [settings=" + settings + ", addonOption=" + addon_option + "]";
	}
}
