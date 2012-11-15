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
public class SupportPlan {

	private String name;
	private double thirty_days_price = 0.0;

	public SupportPlan() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getThirtyDaysPrice() {
		return thirty_days_price;
	}

	public void setThirtyDaysPrice(double thirty_days_price) {
		this.thirty_days_price = thirty_days_price;
	}

	@Override
	public String toString() {
		return "SupportPlan [name=" + name + ", thirtyDaysPrice=" + thirty_days_price + "]";
	}
}
