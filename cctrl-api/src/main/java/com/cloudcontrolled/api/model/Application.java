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
 * The application model contains informations about your application. For
 * example you get an overview over the collaborators which are allowed to
 * manage the application or a list of the currently installed deployments.
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 * @version $Id: $Id
 */
public class Application extends AbstractModel {

	private String name;
	private String repository;
	private User[] invitations;
	private User owner;
	private String date_created;
	private Type type;
	private String date_modified;
	private User[] users;
	private Deployment[] deployments;

	/**
	 * <p>Constructor for Application.</p>
	 */
	public Application() {
	}

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return name the name of the application
	 */
	public String getName() {
		return name;
	}

	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name the name of the application to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>Getter for the field <code>type</code>.</p>
	 *
	 * @return type the type of the application
	 */
	public Type getType() {
		return type;
	}

	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type the type of the application to set
	 */
	public void setType(Type type) {
		this.type = type;
	}

	/**
	 * <p>Getter for the field <code>repository</code>.</p>
	 *
	 * @return repository the repository which contains the applications code
	 */
	public String getRepository() {
		return repository;
	}

	/**
	 * <p>setResository.</p>
	 *
	 * @param repository the repository to set
	 */
	public void setResository(String repository) {
		this.repository = repository;
	}

	/**
	 * <p>Getter for the field <code>invitations</code>.</p>
	 *
	 * @return users the users which are invited to this application
	 */
	public User[] getInvitations() {
		return invitations;
	}

	/**
	 * <p>Setter for the field <code>invitations</code>.</p>
	 *
	 * @param invitations the invotations to set
	 */
	public void setInvitations(User[] invitations) {
		this.invitations = invitations;
	}

	/**
	 * <p>Getter for the field <code>owner</code>.</p>
	 *
	 * @return user the owner of the application
	 */
	public User getOwner() {
		return owner;
	}

	/**
	 * <p>Setter for the field <code>owner</code>.</p>
	 *
	 * @param owner the user to set
	 */
	public void setOwner(User owner) {
		this.owner = owner;
	}

	/**
	 * <p>getDateCreated.</p>
	 *
	 * @return date the date of creation
	 */
	public String getDateCreated() {
		return date_created;
	}

	/**
	 * <p>setDateCreated.</p>
	 *
	 * @param date_created the date_created to set
	 */
	public void setDateCreated(String date_created) {
		this.date_created = date_created;
	}

	/**
	 * <p>getDateModified.</p>
	 *
	 * @return modified the date when the application was modified at least
	 */
	public String getDateModified() {
		return date_modified;
	}

	/**
	 * <p>setDateModified.</p>
	 *
	 * @param date_modified the date_modified to set
	 */
	public void setDateModified(String date_modified) {
		this.date_modified = date_modified;
	}

	/**
	 * <p>Getter for the field <code>users</code>.</p>
	 *
	 * @return users the users which are currently involved to that application
	 */
	public User[] getUsers() {
		return users;
	}

	/**
	 * <p>Setter for the field <code>users</code>.</p>
	 *
	 * @param users the users to set
	 */
	public void setUsers(User[] users) {
		this.users = users;
	}

	/**
	 * <p>Getter for the field <code>deployments</code>.</p>
	 *
	 * @return deployments the deployments of the application
	 */
	public Deployment[] getDeployments() {
		return deployments;
	}

	/**
	 * <p>Setter for the field <code>deployments</code>.</p>
	 *
	 * @param deployments the deployments to set
	 */
	public void setDeployments(Deployment[] deployments) {
		this.deployments = deployments;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	/** {@inheritDoc} */
	@Override
	public String toString() {
		return "Application [name=" + name + ", repository=" + repository + ", invitations=" + Arrays.toString(invitations) + ", owner=" + owner + ", dateCreated=" + date_created + ", type=" + type + ", dateModified=" + date_modified + ", users=" + Arrays.toString(users) + ", deployments="
				+ Arrays.toString(deployments) + "]";
	}
}
