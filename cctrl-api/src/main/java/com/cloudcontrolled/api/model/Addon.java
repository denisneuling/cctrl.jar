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
public class Addon {

	private Settings settings;
	private AddonOption addon_option;

	public Addon() {
	}

	public Settings getSettings() {
		return settings;
	}

	public void setSettings(Settings settings) {
		this.settings = settings;
	}

	public AddonOption getAddonOption() {
		return addon_option;
	}

	public void setAddonOption(AddonOption addon_option) {
		this.addon_option = addon_option;
	}

	@Override
	public String toString() {
		return "Addon [settings=" + settings + ", addonOption=" + addon_option + "]";
	}
}
