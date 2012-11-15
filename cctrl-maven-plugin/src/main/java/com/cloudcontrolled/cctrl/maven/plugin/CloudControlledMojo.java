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

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public String getDeployment() {
		return deployment;
	}

	public void setDeployment(String deployment) {
		this.deployment = deployment;
	}

	public String getCommitId() {
		return commitId;
	}

	public void setCommitId(String commitId) {
		this.commitId = commitId;
	}

	@Override
	public void setLog(Log log) {
		this.log = log;
	}

	@SuppressWarnings("rawtypes")
	public void setPluginContext(Map pluginContext) {
		this.pluginContext = pluginContext;
	}

	public String getBaseDir() {
		return baseDir;
	}

	public void setBaseDir(String baseDir) {
		this.baseDir = baseDir;
	}

	public void copyPropertiesfromAnother(CloudControlledMojo<?> ccmojo) {
		this.setApplication(ccmojo.getApplication());
		this.setDeployment(ccmojo.getDeployment());
		this.setCommitId(ccmojo.getCommitId());
		this.setLog(ccmojo.getLog());
		this.setPluginContext(ccmojo.getPluginContext());
		this.setBaseDir(ccmojo.getBaseDir());
	}

	public FileRepository getRepository() throws IOException {
		FileRepository repository = new FileRepository(baseDir + "/.git");
		return repository;
	}
	
	public String retrieveBranch() throws MojoExecutionException{
		try {
			return getRepository().getBranch();
		} catch (IOException e) {
			throw new MojoExecutionException(e.getClass().getSimpleName(), e);
		}
	}
}