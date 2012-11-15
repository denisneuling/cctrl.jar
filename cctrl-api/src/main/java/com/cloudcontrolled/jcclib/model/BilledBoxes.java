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
package com.cloudcontrolled.jcclib.model;

/**
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
public class BilledBoxes {

	private double costs = 0.0;
	private double free_boxes = 0.0;
	private String until; // unix timestamp
	private double boxes = 0.0;

	public BilledBoxes() {
	}

	public double getCosts() {
		return costs;
	}

	public void setCosts(double costs) {
		this.costs = costs;
	}

	public double getFreeBoxes() {
		return free_boxes;
	}

	public void setFreeBoxes(double free_boxes) {
		this.free_boxes = free_boxes;
	}

	public String getUntil() {
		return until;
	}

	public void setUntil(String until) {
		this.until = until;
	}

	public double getBoxes() {
		return boxes;
	}

	public void setBoxes(double boxes) {
		this.boxes = boxes;
	}

	@Override
	public String toString() {
		return "BilledBoxes [costs=" + costs + ", freeBoxes=" + free_boxes + ", until=" + until + ", boxes=" + boxes + "]";
	}
}
