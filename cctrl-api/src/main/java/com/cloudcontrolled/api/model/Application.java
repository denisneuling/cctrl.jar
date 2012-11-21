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

	public Application() {
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
	public Type getType() {
		return type;
	}

	/**
	 * 
	 * @param type
	 */
	public void setType(Type type) {
		this.type = type;
	}

	/**
	 * 
	 * @return
	 */
	public String getRepository() {
		return repository;
	}

	/**
	 * 
	 * @param repository
	 */
	public void setResository(String repository) {
		this.repository = repository;
	}

	/**
	 * 
	 * @return
	 */
	public User[] getInvitations() {
		return invitations;
	}

	/**
	 * 
	 * @param invitations
	 */
	public void setInvitations(User[] invitations) {
		this.invitations = invitations;
	}

	/**
	 * 
	 * @return
	 */
	public User getOwner() {
		return owner;
	}

	/**
	 * 
	 * @param owner
	 */
	public void setOwner(User owner) {
		this.owner = owner;
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
	public User[] getUsers() {
		return users;
	}

	/**
	 * 
	 * @param users
	 */
	public void setUsers(User[] users) {
		this.users = users;
	}

	/**
	 * 
	 * @return
	 */
	public Deployment[] getDeployments() {
		return deployments;
	}

	/**
	 * 
	 * @param deployments
	 */
	public void setDeployments(Deployment[] deployments) {
		this.deployments = deployments;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Application [name=" + name + ", repository=" + repository + ", invitations=" + Arrays.toString(invitations) + ", owner=" + owner + ", dateCreated=" + date_created + ", type=" + type + ", dateModified=" + date_modified + ", users=" + Arrays.toString(users) + ", deployments="
				+ Arrays.toString(deployments) + "]";
	}
}
