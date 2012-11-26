# cctrl-api

Java library, which contains models mapped onto the awesome API of [cloudcontrol PaaS](https://www.cloudcontrol.com/).

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


### How to extend your awesome implementation by the cctrl-api adapter?
---

Just add the following xml snippet to your project object model's dependencies

``` xml
	<dependency>
	    <groupId>com.cloudcontrolled</groupId>
	    <artifactId>cctrl-api</artifactId>
	    <version>0.1</version>
	</dependency>
```

and fetch it from maven central by using mvn.

Notice: It is really recommended to use this library in liaison with the [cctrl-api-client](https://github.com/denisneuling/cctrl.jar/tree/master/cctrl-api-client). Otherwise you need to find another way to fire requests against the [cloudcontrol API](https://api.cloudcontrol.com/).
