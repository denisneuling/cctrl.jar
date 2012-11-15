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
package com.cloudcontrolled.cctrl.maven.plugin.push;

import java.util.Iterator;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.PushCommand;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.transport.PushResult;
import org.eclipse.jgit.transport.RefSpec;

import com.cloudcontrolled.api.client.CloudControlClient;
import com.cloudcontrolled.api.client.exception.CloudControlClientException;
import com.cloudcontrolled.api.request.ApplicationRequest;
import com.cloudcontrolled.api.response.ApplicationResponse;
import com.cloudcontrolled.cctrl.maven.plugin.CloudControlSupport;
import com.cloudcontrolled.cctrl.maven.plugin.CloudControlledMojo;

/**
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 * @phase cctrl
 * @goal push
 */
public class CloudcontrolledPush extends CloudControlledMojo<CloudcontrolledPush> {

	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		String deploymentQualifier = application + (deployment != null ? ":" + deployment + (commitId != null ? ":" + commitId : "") : "");

		log.info("Retrieving remote repository location of " + deploymentQualifier + " from CloudControl PaaS.");
		String remoteRepository = retrieveRemoteRepositoryLocation();

		log.info("Push of branch " + retrieveBranch() + " to " + remoteRepository + " may take some time...");
		String output = push(remoteRepository);

		System.out.println(output);

		log.info("Successfully pushed refs of " + deploymentQualifier + " with branch " + retrieveBranch() + " to " + remoteRepository + " on CloudControl PaaS.");
	}

	private String retrieveRemoteRepositoryLocation() throws MojoFailureException, MojoExecutionException {
		CloudControlClient client = CloudControlSupport.createCloudControlClient();
		ApplicationRequest applicationRequest = CloudControlSupport.createApplicationRequest(application);

		ApplicationResponse applicationResponse = null;
		try {
			applicationResponse = client.send(applicationRequest);

			if (applicationResponse.isError()) {
				throw new MojoFailureException(applicationResponse.getContent());
			}
		} catch (CloudControlClientException ccce) {
			throw new MojoExecutionException(ccce.getClass().getSimpleName(), ccce);
		}

		String remoteRepository = "git+";
		remoteRepository += applicationResponse.getApplication().getRepository();

		return remoteRepository;
	}

	private String push(String remoteLocation) throws MojoExecutionException {
		Repository repository = null;
		Git git;
		try {
			repository = getRepository();
			git = Git.wrap(repository);

			PushCommand pushCommand = git.push();
			pushCommand.setRemote(remoteLocation);
			pushCommand.setRefSpecs(new RefSpec(repository.getFullBranch()));

			Iterable<PushResult> pushResult = pushCommand.call();
			Iterator<PushResult> result = pushResult.iterator();

			StringBuffer buffer = new StringBuffer();
			if (result.hasNext()) {
				while (result.hasNext()) {
					String line = result.next().getMessages();
					if (!line.isEmpty()) {
						buffer.append(line);
						if (result.hasNext()) {
							buffer.append(System.getProperty("line.separator"));
						}
					}
				}
			}

			return buffer.toString();
		} catch (Exception e) {
			throw new MojoExecutionException(e.getClass().getSimpleName(), e);
		} finally {
			if (repository != null) {
				repository.close();
			}
		}
	}
}
