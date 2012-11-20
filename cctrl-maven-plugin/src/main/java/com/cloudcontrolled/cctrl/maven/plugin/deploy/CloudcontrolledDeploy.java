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
package com.cloudcontrolled.cctrl.maven.plugin.deploy;

import java.io.IOException;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.eclipse.jgit.lib.Repository;

import com.cloudcontrolled.api.client.CloudControlClient;
import com.cloudcontrolled.api.client.exception.CloudControlClientException;
import com.cloudcontrolled.api.request.UpdateDeploymentRequest;
import com.cloudcontrolled.api.response.UpdateDeploymentResponse;
import com.cloudcontrolled.cctrl.maven.plugin.CloudControlSupport;
import com.cloudcontrolled.cctrl.maven.plugin.CloudControlledMojo;

/**
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 * @phase cctrl
 * @goal deploy
 */
public class CloudcontrolledDeploy extends CloudControlledMojo<CloudcontrolledDeploy> {

	/*
	 * (non-Javadoc)
	 * @see org.apache.maven.plugin.AbstractMojo#execute()
	 */
	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {

		if (deployment == null || deployment.isEmpty()) {
			deployment = retrieveBranch();
			if (CloudControlSupport.MASTER_BRANCH.equals(deployment)) {
				deployment = "default";
			}
		}

		if (deployment == null) {
			Repository repository = null;
			try {
				repository = getRepository();
				String branch = repository.getBranch();
				if (!CloudControlSupport.MASTER_BRANCH.equals(branch)) {
					deployment = branch;
				}
			} catch (IOException e) {
				throw new MojoExecutionException(e.getClass().getSimpleName(), e);
			} finally {
				if (repository != null) {
					repository.close();
				}
			}
		}

		String deploymentQualifier = application + (deployment != null ? ":" + deployment + (commitId != null ? ":" + commitId : "") : "");
		log.info("Deploying " + deploymentQualifier + " to CloudControl PaaS.");

		CloudControlClient client = CloudControlSupport.createCloudControlClient();
		UpdateDeploymentRequest request = CloudControlSupport.createUpdateDeploymentRequest(application, deployment, commitId);

		UpdateDeploymentResponse response = null;
		try {
			response = client.send(request);

			if (response.isError()) {
				throw new MojoFailureException(response.getContent());
			}
		} catch (CloudControlClientException ccce) {
			throw new MojoExecutionException("CloudControlClientException", ccce);
		}

		log.info("Successfully deployed " + deploymentQualifier);
		log.info("Please, visit to following domain: http://" + response.getDeployment().getDefaultSubdomain());
	}
}
