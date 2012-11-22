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
	 * @return name the name of the application
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name the name of the application to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return type the type of the application
	 */
	public Type getType() {
		return type;
	}

	/**
	 * 
	 * @param type the type of the application to set
	 */
	public void setType(Type type) {
		this.type = type;
	}

	/**
	 * 
	 * @return repository the repository which contains the applications code
	 */
	public String getRepository() {
		return repository;
	}

	/**
	 * 
	 * @param repository the repository to set
	 */
	public void setResository(String repository) {
		this.repository = repository;
	}

	/**
	 * @return users the users which are invited to this application
	 */
	public User[] getInvitations() {
		return invitations;
	}

	/**
	 * @param invitations the invotations to set 
	 */
	public void setInvitations(User[] invitations) {
		this.invitations = invitations;
	}

	/**
	 * 
	 * @return user the owner of the application
	 */
	public User getOwner() {
		return owner;
	}

	/**
	 * 
	 * @param owner the user to set
	 */
	public void setOwner(User owner) {
		this.owner = owner;
	}

	/**
	 * 
	 * @return date the date of creation
	 */
	public String getDateCreated() {
		return date_created;
	}

	/**
	 * 
	 * @param date_created the date_created to set
	 */
	public void setDateCreated(String date_created) {
		this.date_created = date_created;
	}

	/**
	 * 
	 * @return modified the date when the application was modified at least
	 */
	public String getDateModified() {
		return date_modified;
	}

	/**
	 * @param date_modified the date_modified to set
	 */
	public void setDateModified(String date_modified) {
		this.date_modified = date_modified;
	}

	/**
	 * @return users the users which are currently involved to that application
	 */
	public User[] getUsers() {
		return users;
	}

	/**
	 * @param users the users to set
	 */
	public void setUsers(User[] users) {
		this.users = users;
	}

	/**
	 * @return deployments the deployments of the application
	 */
	public Deployment[] getDeployments() {
		return deployments;
	}

	/**
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
	@Override
	public String toString() {
		return "Application [name=" + name + ", repository=" + repository + ", invitations=" + Arrays.toString(invitations) + ", owner=" + owner + ", dateCreated=" + date_created + ", type=" + type + ", dateModified=" + date_modified + ", users=" + Arrays.toString(users) + ", deployments="
				+ Arrays.toString(deployments) + "]";
	}
}
