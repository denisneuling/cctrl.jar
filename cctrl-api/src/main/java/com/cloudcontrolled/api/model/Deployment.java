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
 * The deployment object contains information of your currently installed branch
 * of your application. It also provides a raw overview of used resources
 * concerning to that deployment.
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 *
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

	/**
	 * <p>
	 * Constructor for Deployment.
	 * </p>
	 */
	public Deployment() {
	}

	/**
	 * <p>
	 * Getter for the field <code>name</code>.
	 * </p>
	 *
	 * @return name the name of the deployment
	 */
	public String getName() {
		return name;
	}

	/**
	 * <p>
	 * Setter for the field <code>name</code>.
	 * </p>
	 *
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>
	 * getDepId.
	 * </p>
	 *
	 * @return deploymentId the deployment id
	 */
	public String getDepId() {
		return dep_id;
	}

	/**
	 * <p>
	 * setDepId.
	 * </p>
	 *
	 * @param dep_id
	 *            the deployment id to set
	 */
	public void setDepId(String dep_id) {
		this.dep_id = dep_id;
	}

	/**
	 * <p>
	 * getMaxBoxes.
	 * </p>
	 *
	 * @return maxBoxes the maximum boxes of the deployment
	 */
	public int getMaxBoxes() {
		return max_boxes;
	}

	/**
	 * <p>
	 * setMaxBoxes.
	 * </p>
	 *
	 * @param max_boxes
	 *            the max boxes to set
	 */
	public void setMaxBoxes(int max_boxes) {
		this.max_boxes = max_boxes;
	}

	/**
	 * <p>
	 * getMinBoxes.
	 * </p>
	 *
	 * @return minBoxes the min boxes of the concerning deployment
	 */
	public int getMinBoxes() {
		return min_boxes;
	}

	/**
	 * <p>
	 * setMinBoxes.
	 * </p>
	 *
	 * @param min_boxes
	 *            the min boxes to set
	 */
	public void setMinBoxes(int min_boxes) {
		this.min_boxes = min_boxes;
	}

	/**
	 * <p>
	 * getDateCreated.
	 * </p>
	 *
	 * @return created the datetime when the deployment was created
	 */
	public String getDateCreated() {
		return date_created;
	}

	/**
	 * <p>
	 * setDateCreated.
	 * </p>
	 *
	 * @param date_created
	 *            the date_created to set
	 */
	public void setDateCreated(String date_created) {
		this.date_created = date_created;
	}

	/**
	 * <p>
	 * getStaticFiles.
	 * </p>
	 *
	 * @return path the path of static files
	 */
	public String getStaticFiles() {
		return static_files;
	}

	/**
	 * <p>
	 * setStaticFiles.
	 * </p>
	 *
	 * @param static_files
	 *            the path of static files to set
	 */
	public void setStaticFiles(String static_files) {
		this.static_files = static_files;
	}

	/**
	 * <p>
	 * Getter for the field <code>stack</code>.
	 * </p>
	 *
	 * @return stack the stack which belongs to the deployment
	 */
	public Stack getStack() {
		return stack;
	}

	/**
	 * <p>
	 * Setter for the field <code>stack</code>.
	 * </p>
	 *
	 * @param stack
	 *            the stack to set
	 */
	public void setStack(Stack stack) {
		this.stack = stack;
	}

	/**
	 * <p>
	 * getBilledAddons.
	 * </p>
	 *
	 * @return billedAddons the billed add-ons of the concerning deployment
	 */
	public BilledAddon[] getBilledAddons() {
		return billed_addons;
	}

	/**
	 * <p>
	 * setBilledAddons.
	 * </p>
	 *
	 * @param billed_addons
	 *            the billed add-ons to set
	 */
	public void setBilledAddons(BilledAddon[] billed_addons) {
		this.billed_addons = billed_addons;
	}

	/**
	 * <p>
	 * getBilledBoxes.
	 * </p>
	 *
	 * @return billedBoxes the billedBoxes of the deployment
	 */
	public BilledBoxes getBilledBoxes() {
		return billed_boxes;
	}

	/**
	 * <p>
	 * setBilledBoxes.
	 * </p>
	 *
	 * @param billed_boxes
	 *            the billed boxes to set
	 */
	public void setBilledBoxes(BilledBoxes billed_boxes) {
		this.billed_boxes = billed_boxes;
	}

	/**
	 * <p>
	 * Getter for the field <code>state</code>.
	 * </p>
	 *
	 * @return state the state of the deployment
	 */
	public String getState() {
		return state;
	}

	/**
	 * <p>
	 * Setter for the field <code>state</code>.
	 * </p>
	 *
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * <p>
	 * getDefaultSubdomain.
	 * </p>
	 *
	 * @return domain the default subdomain on which the deployment is reachable
	 *         by default
	 */
	public String getDefaultSubdomain() {
		return default_subdomain;
	}

	/**
	 * <p>
	 * setDefaultSubdomain.
	 * </p>
	 *
	 * @param default_subdomain
	 *            the default subdoman to set
	 */
	public void setDefaultSubdomain(String default_subdomain) {
		this.default_subdomain = default_subdomain;
	}

	/**
	 * <p>
	 * isDefault.
	 * </p>
	 *
	 * @return isDefault the boolean value which specifies whether the
	 *         deployment is the default one
	 */
	public boolean isDefault() {
		return is_default;
	}

	/**
	 * <p>
	 * setDefault.
	 * </p>
	 *
	 * @param is_default
	 *            the boolean value to set
	 */
	public void setDefault(boolean is_default) {
		this.is_default = is_default;
	}

	/**
	 * <p>
	 * Getter for the field <code>branch</code>.
	 * </p>
	 *
	 * @return branch the scm branch of the deployment
	 */
	public String getBranch() {
		return branch;
	}

	/**
	 * <p>
	 * Setter for the field <code>branch</code>.
	 * </p>
	 *
	 * @param branch
	 *            the branch to set
	 */
	public void setBranch(String branch) {
		this.branch = branch;
	}

	/**
	 * <p>
	 * Getter for the field <code>version</code>.
	 * </p>
	 *
	 * @return version the version or commit id of the deployment
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <p>
	 * Setter for the field <code>version</code>.
	 * </p>
	 *
	 * @param version
	 *            the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * <p>
	 * getDateModified.
	 * </p>
	 *
	 * @return modified the datetime when the deployment was modified at least
	 */
	public String getDateModified() {
		return date_modified;
	}

	/**
	 * <p>
	 * setDateModified.
	 * </p>
	 *
	 * @param date_modified
	 *            the date modified to set
	 */
	public void setDateModified(String date_modified) {
		this.date_modified = date_modified;
	}

	/**
	 * <p>
	 * getBillingAccount.
	 * </p>
	 *
	 * @return billingAccount the concerning billing accoun of that deployment
	 */
	public BillingAccount getBillingAccount() {
		return billing_account;
	}

	/**
	 * <p>
	 * setBillingAccount.
	 * </p>
	 *
	 * @param billing_account
	 *            the billing account to set
	 */
	public void setBillingAccount(BillingAccount billing_account) {
		this.billing_account = billing_account;
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return "Deployment [name=" + name + ", depId=" + dep_id + ", maxBoxes=" + max_boxes + ", minBoxes=" + min_boxes + ", dateCreated=" + date_created + ", staticFiles=" + static_files + ", stack=" + stack + ", billedAddons=" + Arrays.toString(billed_addons) + ", billedBoxes=" + billed_boxes
				+ ", state=" + state + ", defaultSubdomain=" + default_subdomain + ", default=" + is_default + ", branch=" + branch + ", version=" + version + ", dateModified=" + date_modified + ", billingAccount=" + billing_account + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date_created == null) ? 0 : date_created.hashCode());
		result = prime * result + ((dep_id == null) ? 0 : dep_id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((stack == null) ? 0 : stack.hashCode());
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
		Deployment other = (Deployment) obj;
		if (date_created == null) {
			if (other.date_created != null)
				return false;
		} else if (!date_created.equals(other.date_created))
			return false;
		if (dep_id == null) {
			if (other.dep_id != null)
				return false;
		} else if (!dep_id.equals(other.dep_id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (stack == null) {
			if (other.stack != null)
				return false;
		} else if (!stack.equals(other.stack))
			return false;
		return true;
	}
}
