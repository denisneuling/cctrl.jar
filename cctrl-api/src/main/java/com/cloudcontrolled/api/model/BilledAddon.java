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
 *
 */
public class BilledAddon extends AbstractModel {

	private double costs = 0.0;
	private double hours = 0.0;
	private String until; // unix timestamp
	private String addon; // addon name

	/**
	 * <p>
	 * Constructor for BilledAddon.
	 * </p>
	 */
	public BilledAddon() {
	}

	/**
	 * <p>
	 * Getter for the field <code>costs</code>.
	 * </p>
	 *
	 * @return costs the costs of the billed addon
	 */
	public double getCosts() {
		return costs;
	}

	/**
	 * <p>
	 * Setter for the field <code>costs</code>.
	 * </p>
	 *
	 * @param costs
	 *            the costs to set
	 */
	public void setCosts(double costs) {
		this.costs = costs;
	}

	/**
	 * <p>
	 * Getter for the field <code>hours</code>.
	 * </p>
	 *
	 * @return hours the hours which were billed
	 */
	public double getHours() {
		return hours;
	}

	/**
	 * <p>
	 * Setter for the field <code>hours</code>.
	 * </p>
	 *
	 * @param hours
	 *            the hours to set
	 */
	public void setHours(double hours) {
		this.hours = hours;
	}

	/**
	 * <p>
	 * Getter for the field <code>until</code>.
	 * </p>
	 *
	 * @return until the datetime when the addon was started to be billed
	 */
	public String getUntil() {
		return until;
	}

	/**
	 * <p>
	 * Setter for the field <code>until</code>.
	 * </p>
	 *
	 * @param until
	 *            the date to set
	 */
	public void setUntil(String until) {
		this.until = until;
	}

	/**
	 * <p>
	 * Getter for the field <code>addon</code>.
	 * </p>
	 *
	 * @return the addon to be billed
	 */
	public String getAddon() {
		return addon;
	}

	/**
	 * <p>
	 * Setter for the field <code>addon</code>.
	 * </p>
	 *
	 * @param addon
	 *            the addon to set
	 */
	public void setAddon(String addon) {
		this.addon = addon;
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return "BilledAddon [costs=" + costs + ", hours=" + hours + ", until=" + until + ", addon=" + addon + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addon == null) ? 0 : addon.hashCode());
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
		BilledAddon other = (BilledAddon) obj;
		if (addon == null) {
			if (other.addon != null)
				return false;
		} else if (!addon.equals(other.addon))
			return false;
		return true;
	}
}
