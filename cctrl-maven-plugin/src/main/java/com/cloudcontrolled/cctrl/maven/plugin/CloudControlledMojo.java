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
package com.cloudcontrolled.cctrl.maven.plugin;

import java.io.IOException;
import java.util.Map;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.logging.Log;
import org.eclipse.jgit.storage.file.FileRepository;

/**
 * <p>
 * Abstract CloudControlledMojo class.
 * </p>
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
public abstract class CloudControlledMojo<T> extends AbstractMojo {

	@SuppressWarnings("rawtypes")
	protected Map pluginContext;

	protected Log log;

	/**
	 * @parameter expression="${basedir}"
	 * @required
	 */
	protected String baseDir;

	/**
	 * @parameter expression="${cctrl.application}"
	 * @required
	 */
	protected String application;

	/**
	 * @parameter expression="${cctrl.deployment}"
	 */
	protected String deployment;

	/**
	 * @parameter expression="${cctrl.version}"
	 */
	protected String commitId;

	/**
	 * <p>
	 * Getter for the field <code>application</code>.
	 * </p>
	 * 
	 * @return a {@link java.lang.String} object.
	 */
	public String getApplication() {
		return application;
	}

	/**
	 * <p>
	 * Setter for the field <code>application</code>.
	 * </p>
	 * 
	 * @param application
	 *            a {@link java.lang.String} object.
	 */
	public void setApplication(String application) {
		this.application = application;
	}

	/**
	 * <p>
	 * Getter for the field <code>deployment</code>.
	 * </p>
	 * 
	 * @return a {@link java.lang.String} object.
	 */
	public String getDeployment() {
		return deployment;
	}

	/**
	 * <p>
	 * Setter for the field <code>deployment</code>.
	 * </p>
	 * 
	 * @param deployment
	 *            a {@link java.lang.String} object.
	 */
	public void setDeployment(String deployment) {
		this.deployment = deployment;
	}

	/**
	 * <p>
	 * Getter for the field <code>commitId</code>.
	 * </p>
	 * 
	 * @return a {@link java.lang.String} object.
	 */
	public String getCommitId() {
		return commitId;
	}

	/**
	 * <p>
	 * Setter for the field <code>commitId</code>.
	 * </p>
	 * 
	 * @param commitId
	 *            a {@link java.lang.String} object.
	 */
	public void setCommitId(String commitId) {
		this.commitId = commitId;
	}

	/** {@inheritDoc} */
	@Override
	public void setLog(Log log) {
		this.log = log;
	}

	/** {@inheritDoc} */
	@SuppressWarnings("rawtypes")
	public void setPluginContext(Map pluginContext) {
		this.pluginContext = pluginContext;
	}

	/**
	 * <p>
	 * Getter for the field <code>baseDir</code>.
	 * </p>
	 * 
	 * @return a {@link java.lang.String} object.
	 */
	public String getBaseDir() {
		return baseDir;
	}

	/**
	 * <p>
	 * Setter for the field <code>baseDir</code>.
	 * </p>
	 * 
	 * @param baseDir
	 *            a {@link java.lang.String} object.
	 */
	public void setBaseDir(String baseDir) {
		this.baseDir = baseDir;
	}

	/**
	 * <p>
	 * copyPropertiesfromAnother.
	 * </p>
	 * 
	 * @param ccmojo
	 *            a
	 *            {@link com.cloudcontrolled.cctrl.maven.plugin.CloudControlledMojo}
	 *            object.
	 */
	public void copyPropertiesfromAnother(CloudControlledMojo<?> ccmojo) {
		this.setApplication(ccmojo.getApplication());
		this.setDeployment(ccmojo.getDeployment());
		this.setCommitId(ccmojo.getCommitId());
		this.setLog(ccmojo.getLog());
		this.setPluginContext(ccmojo.getPluginContext());
		this.setBaseDir(ccmojo.getBaseDir());
	}

	/**
	 * <p>
	 * getRepository.
	 * </p>
	 * 
	 * @throws java.io.IOException
	 *             if any.
	 * @return a {@link org.eclipse.jgit.storage.file.FileRepository} object.
	 */
	public FileRepository getRepository() throws IOException {
		FileRepository repository = new FileRepository(baseDir + "/.git");
		return repository;
	}

	/**
	 * <p>
	 * retrieveBranch.
	 * </p>
	 * 
	 * @throws org.apache.maven.plugin.MojoExecutionException
	 *             if any.
	 * @return a {@link java.lang.String} object.
	 */
	public String retrieveBranch() throws MojoExecutionException {
		try {
			return getRepository().getBranch();
		} catch (IOException e) {
			throw new MojoExecutionException(e.getClass().getSimpleName(), e);
		}
	}
}
