# cctrl-api-client

Maven module, which contains a client implementation to manage your the awesome [cloudcontrol PaaS](https://www.cloudcontrol.com/) applications by using the good old java way.

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
1. Clone the parent project [cctrl.jar](https://github.com/denisneuling/cctrl.jar.git)

        $ git clone https://github.com/denisneuling/cctrl.jar.git

2. Change into the directory:

        $ cd cctrl.jar

3. Run maven:

        $ mvn install # fetch all dependencies and build the project

### How to extend your awesome implementation by cctrl-api-client?
---

Just add the following xml snippet to your project object model's dependencies

``` xml
	<dependency>
	    <groupId>com.cloudcontrolled</groupId>
	    <artifactId>cctrl-api-client</artifactId>
	    <version>0.1</version>
	</dependency>
```

and fetch it from maven central by using mvn

### How to use the cctrl-api-client whithin your project?
---

``` java

	import com.cloudcontrolled.api.client.CloudControlClient;
	import com.cloudcontrolled.api.client.auth.Credentials;
	import com.cloudcontrolled.api.request.DeploymentRequest;
	import com.cloudcontrolled.api.response.DeploymentResponse;
	import com.cloudcontrolled.api.model.Deployment;


	public class CloudControlDeploymentCapable{
		
		private String cctrlEmail = "contact@company.com";
		private String cctrlPassword = "secr3tP4ssW0rd";

		private Credentials credentials = new Credentials(cctrlEmail, cctrlPassword);

		private String applicatioName = "myapp";
		private String deploymentName = "mydeployment";

		public Deployment deploy(){

			CloudControlClient client = new CloudControlClient(credentials);
			
			DeploymentRequest request = new DeploymentRequest();
			request.setApplicationName(applicationName);
			request.setDeploymentName(deploymentName);

			DeploymentResponse response = client.send(request);
			return response.getDeployment();
		}

	}

```
