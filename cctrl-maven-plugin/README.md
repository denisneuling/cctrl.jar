# cctrl-maven-plugin

Maven plugin, which provides direct maven like management of your apps by using the awesome API of [cloudcontrol PaaS](https://www.cloudcontrol.com/).


### Requirements
---

You will need following:

- [Java JRE 1.6+](http://www.oracle.com/technetwork/java/javase/downloads) ([Download page](http://www.oracle.com/technetwork/java/javase/downloads/jre6-downloads-1637595.html))
- [Java JDK 1.6+](http://www.oracle.com/technetwork/java/javase/downloads) ([Download page](http://www.oracle.com/technetwork/java/javase/downloads/jdk6-downloads-1637591.html))
- [Apache Maven 2.0+](http://maven.apache.org/)

Install via your package manager, otherwise get the libraries.

Descriptions can be found here:

For Maven: [Building a Project with Maven](http://maven.apache.org/run-maven/index.html)


### How to setup this project?
---

1. Clone [jcclib](https://github.com/denisneuling/jcclib.git) and [jcctrlclient](https://github.com/denisneuling/jcctrlclient.git) and invoke the maven build

   Or [download](https://github.com/denisneuling/cctrl-maven-plugin/downloads) the [latest](https://github.com/downloads/denisneuling/cctrl-maven-plugin/cctrl-maven-plugin-0.0.1-SNAPSHOT-jar-with-dependencies.jar) JAR containing all dependencies and install it to your local maven repository. [HOWTO](http://maven.apache.org/plugins/maven-install-plugin/usage.html)

2. Clone this project

        $ git clone https://github.com/denisneuling/cctrl-maven-plugin.git com.cloudcontrolled.cctrl.maven.plugin

3. Change into the directory:

        $ cd com.cloudcontrolled.cctrl.maven.plugin

4. Run maven:

        $ mvn install # fetch all dependencies and build the project

### How to use cctrl-maven-plugin?
---

1. Modify the following XML snipped and add it to your application's pom.xml
``` xml
	<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
		<!-- ... -->
		<build>
			<!-- ... -->
			<plugins>
				<!-- ... -->
				<plugin>
					<groupId>com.cloudcontrolled</groupId>
					<artifactId>cctrl-maven-plugin</artifactId>
					<version>0.0.1-SNAPSHOT</version>
					<configuration>
						<application>awesomeapp</application>
						<!-- optional <deployment>deployment</deployment> -->
						<!-- optional <version>commit id</version> -->
					</configuration>
				</plugin>
				<!-- ... -->
			</plugins>
			<!-- ... -->
		</build>
	</project>
```

2. Export your [cloudcontrol PaaS](https://www.cloudcontrol.com/) customer credentials to your environment:

        $ export CCTRL_EMAIL=me@mycompany.org
        $ export CCTRL_PASSWORD=secr3t;

   Otherwise you need to invoke the required cctrl goal in usage with the same JVM arguments: 
	
        $ mvn -DCCTRL_EMAIL=me@mycompany.org -DCCTRL_PASSWORD=secr3t cctrl:<goal>

3. Invoke the cctrl-maven-plugin
	
  * Either:

        $ mvn cctrl:push

    to push the current version and branch to the remote repository.

  * Or:

        $ mvn cctrl:deploy

    to deploy the chosen version of your application.

  * Or:

        $ mvn cctrl:release

    to do both.


### Maven cctrl lifecycle
---

* cctrl:push

  Pushes the scm state of current branch to the concerning deployment.
  If the deployment is defined whithin the configuration section of the plugin this might cause unintentioned side effects.
  E.g. push branch A to remote branch B.


* cctrl:deploy

  In case the version was defined whithin the plugin configuration section, the plugin will deploy the chosen version on cloudControl PaaS.
  If not defined it will instruct the cloudControl API to deploy version -1 (latest sc version).


* cctrl:release

  Chained invocation of cctrl:push and cctrl:deploy.


* cctrl:help

  Simple help how to define the plugin configuration at the project object model.
