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
 * The billed add-on model contains informations about the usage of the
 * concerning addon and which price you have to offer since the addon was added
 * to your deployment.
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

	/**
	 * 
	 * @return
	 */
	public double getCosts() {
		return costs;
	}

	/**
	 * 
	 * @param costs
	 */
	public void setCosts(double costs) {
		this.costs = costs;
	}

	/**
	 * 
	 * @return
	 */
	public double getHours() {
		return hours;
	}

	/**
	 * 
	 * @param hours
	 */
	public void setHours(double hours) {
		this.hours = hours;
	}

	/**
	 * 
	 * @return
	 */
	public String getUntil() {
		return until;
	}

	/**
	 * 
	 * @param until
	 */
	public void setUntil(String until) {
		this.until = until;
	}

	/**
	 * 
	 * @return
	 */
	public String getAddon() {
		return addon;
	}

	/**
	 * 
	 * @param addon
	 */
	public void setAddon(String addon) {
		this.addon = addon;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BilledAddon [costs=" + costs + ", hours=" + hours + ", until=" + until + ", addon=" + addon + "]";
	}

}
