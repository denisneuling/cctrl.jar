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
package com.cloudcontrolled.cctrl.maven.plugin.help;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import com.cloudcontrolled.cctrl.maven.plugin.CloudControlSupport;
import com.cloudcontrolled.cctrl.maven.plugin.CloudControlledMojo;

/**
 * <p>CloudControlledHelp class.</p>
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 * @phase cctrl
 * @goal help
 *
 */
public class CloudControlledHelp extends CloudControlledMojo<CloudControlledHelp> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.maven.plugin.AbstractMojo#execute()
	 */
	/** {@inheritDoc} */
	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		String content = "\n" + "Please add the following plugin configuration to your build section of your pom.xml\n" + "\n" + "\t" + "<project>\n" + "\t\t" + "[...]\n" + "\t\t\t" + "<build>\n" + "\t\t\t\t" + "<plugins>\n" + "\t\t\t\t" + "[...]\n" + "\t\t\t\t\t" + "<plugin>\n" + "\t\t\t\t\t\t"
				+ "<groupId>com.cloudcontrolled</groupId>\n" + "\t\t\t\t\t\t" + "<artifactId>cctrl-maven-plugin</artifactId>\n" + "\t\t\t\t\t\t" + "<version>0.0.1-SNAPSHOT</version>\n" + "\t\t\t\t\t\t" + "<configuration>\n" + "\t\t\t\t\t\t\t"
				+ "<application><!--your ${cloudcontrol.application}, required--></application>\n" + "\t\t\t\t\t\t\t" + "<deployment><!--optional ${deployment}, default is \"default\"--></deployment>\n" + "\t\t\t\t\t\t\t" + "<version><!--optional ${commitId}, default is \"-1\"--></version>\n"
				+ "\t\t\t\t\t\t" + "</configuration>\n" + "\t\t\t\t\t" + "</plugin>\n" + "\t\t\t\t" + "[...]\n" + "\t\t\t\t" + "</plugins>\n" + "\t\t\t" + "</build>\n" + "\t\t" + "[...]\n" + "\t" + "</project>\n";

		log.info(CloudControlSupport.LLINE);
		System.out.println(content);
		log.info(CloudControlSupport.LLINE);
	}
}
