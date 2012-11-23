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
 * The add-on options object contains the unique name <small>or as you want the
 * ID</small> of the add-on and some informations about the pricing.
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 *
 */
public class AddonOption extends AbstractModel {

	private String name;
	private double thirty_days_price;
	private boolean price_is_per_box;

	/**
	 * <p>Constructor for AddonOption.</p>
	 */
	public AddonOption() {
	}

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return name the name of the add-on options
	 */
	public String getName() {
		return name;
	}

	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name the name to set of the concerning add-on option
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>getThirtyDaysPrice.</p>
	 *
	 * @return thirtyDaysPrice the thrity days price of the concerning add-on option
	 */
	public double getThirtyDaysPrice() {
		return thirty_days_price;
	}

	/**
	 * <p>setThirtyDaysPrice.</p>
	 *
	 * @param thirty_days_price the thrity days price of the concerning add-on option to set
	 */
	public void setThirtyDaysPrice(double thirty_days_price) {
		this.thirty_days_price = thirty_days_price;
	}

	/**
	 * <p>isPricePerBox.</p>
	 *
	 * @return pricePerBox the boolean value which specifies whether the price is per box
	 */
	public boolean isPricePerBox() {
		return price_is_per_box;
	}

	/**
	 * <p>setPricePerBox.</p>
	 *
	 * @param price_is_per_box set the boolean value whether the price is per box
	 */
	public void setPricePerBox(boolean price_is_per_box) {
		this.price_is_per_box = price_is_per_box;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	/** {@inheritDoc} */
	@Override
	public String toString() {
		return "AddonOption [name=" + name + ", thirtyDaysPrice=" + thirty_days_price + ", priceIsPerBox=" + price_is_per_box + "]";
	}

}
