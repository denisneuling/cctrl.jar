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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepId() {
		return dep_id;
	}

	public void setDepId(String dep_id) {
		this.dep_id = dep_id;
	}

	public int getMaxBoxes() {
		return max_boxes;
	}

	public void setMaxBoxes(int max_boxes) {
		this.max_boxes = max_boxes;
	}

	public int getMinBoxes() {
		return min_boxes;
	}

	public void setMinBoxes(int min_boxes) {
		this.min_boxes = min_boxes;
	}

	public String getDateCreated() {
		return date_created;
	}

	public void setDateCreated(String date_created) {
		this.date_created = date_created;
	}

	public String getStaticFiles() {
		return static_files;
	}

	public void setStaticFiles(String static_files) {
		this.static_files = static_files;
	}

	public Stack getStack() {
		return stack;
	}

	public void setStack(Stack stack) {
		this.stack = stack;
	}

	public BilledAddon[] getBilledAddons() {
		return billed_addons;
	}

	public void setBilledAddons(BilledAddon[] billed_addons) {
		this.billed_addons = billed_addons;
	}

	public BilledBoxes getBilledBoxes() {
		return billed_boxes;
	}

	public void setBilledBoxes(BilledBoxes billed_boxes) {
		this.billed_boxes = billed_boxes;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDefaultSubdomain() {
		return default_subdomain;
	}

	public void setDefaultSubdomain(String default_subdomain) {
		this.default_subdomain = default_subdomain;
	}

	public boolean isDefault() {
		return is_default;
	}

	public void setDefault(boolean is_default) {
		this.is_default = is_default;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDateModified() {
		return date_modified;
	}

	public void setDateModified(String date_modified) {
		this.date_modified = date_modified;
	}

	public BillingAccount getBillingAccount() {
		return billing_account;
	}

	public void setBillingAccount(BillingAccount billing_account) {
		this.billing_account = billing_account;
	}

	@Override
	public String toString() {
		return "Deployment [name=" + name + ", depId=" + dep_id + ", maxBoxes=" + max_boxes + ", minBoxes=" + min_boxes + ", dateCreated=" + date_created + ", staticFiles=" + static_files + ", stack=" + stack + ", billedAddons=" + Arrays.toString(billed_addons) + ", billedBoxes=" + billed_boxes
				+ ", state=" + state + ", defaultSubdomain=" + default_subdomain + ", default=" + is_default + ", branch=" + branch + ", version=" + version + ", dateModified=" + date_modified + ", billingAccount=" + billing_account + "]";
	}
}
