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
package com.cloudcontrolled.cctrl.maven.plugin.release;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import com.cloudcontrolled.cctrl.maven.plugin.CloudControlledMojo;
import com.cloudcontrolled.cctrl.maven.plugin.deploy.CloudcontrolledDeploy;
import com.cloudcontrolled.cctrl.maven.plugin.push.CloudcontrolledPush;

/**
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 * @phase cctrl
 * @goal release
 */
public class CloudControlledRelease extends CloudControlledMojo<CloudControlledRelease> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.maven.plugin.AbstractMojo#execute()
	 */
	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		String deploymentQualifier = application + (deployment != null ? ":" + deployment + (commitId != null ? ":" + commitId : "") : "");
		log.info("Releasing " + deploymentQualifier + " to CloudControl PaaS.");

		CloudcontrolledPush push = new CloudcontrolledPush();
		push.copyPropertiesfromAnother(this);

		push.execute();

		CloudcontrolledDeploy deploy = new CloudcontrolledDeploy();
		deploy.copyPropertiesfromAnother(this);

		deploy.execute();
	}
}
