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
 */
public class BilledAddon extends AbstractModel {

	private double costs = 0.0;
	private double hours = 0.0;
	private String until; // unix timestamp
	private String addon; // addon name

	public BilledAddon() {
	}

	public double getCosts() {
		return costs;
	}

	public void setCosts(double costs) {
		this.costs = costs;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public String getUntil() {
		return until;
	}

	public void setUntil(String until) {
		this.until = until;
	}

	public String getAddon() {
		return addon;
	}

	public void setAddon(String addon) {
		this.addon = addon;
	}

	@Override
	public String toString() {
		return "BilledAddon [costs=" + costs + ", hours=" + hours + ", until=" + until + ", addon=" + addon + "]";
	}

}
