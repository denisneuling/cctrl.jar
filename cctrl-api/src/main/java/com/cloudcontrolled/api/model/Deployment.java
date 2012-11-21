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
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 */
public class Deployment extends AbstractModel {

	private String name;
	private String dep_id;
	private int max_boxes;
	private int min_boxes;
	private String date_created;
	private String static_files;
	private Stack stack;
	private BilledAddon[] billed_addons;
	private BilledBoxes billed_boxes;
	private String state;
	private String default_subdomain;
	private boolean is_default;
	private String branch;
	private String version;
	private String date_modified;
	private BillingAccount billing_account;

	public Deployment() {
	}

	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return
	 */
	public String getDepId() {
		return dep_id;
	}

	/**
	 * 
	 * @param dep_id
	 */
	public void setDepId(String dep_id) {
		this.dep_id = dep_id;
	}

	/**
	 * 
	 * @return
	 */
	public int getMaxBoxes() {
		return max_boxes;
	}

	/**
	 * 
	 * @param max_boxes
	 */
	public void setMaxBoxes(int max_boxes) {
		this.max_boxes = max_boxes;
	}

	/**
	 * 
	 * @return
	 */
	public int getMinBoxes() {
		return min_boxes;
	}

	/**
	 * 
	 * @param min_boxes
	 */
	public void setMinBoxes(int min_boxes) {
		this.min_boxes = min_boxes;
	}

	/**
	 * 
	 * @return
	 */
	public String getDateCreated() {
		return date_created;
	}

	/**
	 * 
	 * @param date_created
	 */
	public void setDateCreated(String date_created) {
		this.date_created = date_created;
	}

	/**
	 * 
	 * @return
	 */
	public String getStaticFiles() {
		return static_files;
	}

	/**
	 * 
	 * @param static_files
	 */
	public void setStaticFiles(String static_files) {
		this.static_files = static_files;
	}

	/**
	 * 
	 * @return
	 */
	public Stack getStack() {
		return stack;
	}

	/**
	 * 
	 * @param stack
	 */
	public void setStack(Stack stack) {
		this.stack = stack;
	}

	/**
	 * 
	 * @return
	 */
	public BilledAddon[] getBilledAddons() {
		return billed_addons;
	}

	/**
	 * 
	 * @param billed_addons
	 */
	public void setBilledAddons(BilledAddon[] billed_addons) {
		this.billed_addons = billed_addons;
	}

	/**
	 * 
	 * @return
	 */
	public BilledBoxes getBilledBoxes() {
		return billed_boxes;
	}

	/**
	 * 
	 * @param billed_boxes
	 */
	public void setBilledBoxes(BilledBoxes billed_boxes) {
		this.billed_boxes = billed_boxes;
	}

	/**
	 * 
	 * @return
	 */
	public String getState() {
		return state;
	}

	/**
	 * 
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * 
	 * @return
	 */
	public String getDefaultSubdomain() {
		return default_subdomain;
	}

	/**
	 * 
	 * @param default_subdomain
	 */
	public void setDefaultSubdomain(String default_subdomain) {
		this.default_subdomain = default_subdomain;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isDefault() {
		return is_default;
	}

	/**
	 * 
	 * @param is_default
	 */
	public void setDefault(boolean is_default) {
		this.is_default = is_default;
	}

	/**
	 * 
	 * @return
	 */
	public String getBranch() {
		return branch;
	}

	/**
	 * 
	 * @param branch
	 */
	public void setBranch(String branch) {
		this.branch = branch;
	}

	/**
	 * 
	 * @return
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * 
	 * @param version
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * 
	 * @return
	 */
	public String getDateModified() {
		return date_modified;
	}

	/**
	 * 
	 * @param date_modified
	 */
	public void setDateModified(String date_modified) {
		this.date_modified = date_modified;
	}

	/**
	 * 
	 * @return
	 */
	public BillingAccount getBillingAccount() {
		return billing_account;
	}

	/**
	 * 
	 * @param billing_account
	 */
	public void setBillingAccount(BillingAccount billing_account) {
		this.billing_account = billing_account;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Deployment [name=" + name + ", depId=" + dep_id + ", maxBoxes=" + max_boxes + ", minBoxes=" + min_boxes + ", dateCreated=" + date_created + ", staticFiles=" + static_files + ", stack=" + stack + ", billedAddons=" + Arrays.toString(billed_addons) + ", billedBoxes=" + billed_boxes
				+ ", state=" + state + ", defaultSubdomain=" + default_subdomain + ", default=" + is_default + ", branch=" + branch + ", version=" + version + ", dateModified=" + date_modified + ", billingAccount=" + billing_account + "]";
	}
}
