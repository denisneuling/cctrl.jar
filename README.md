# cctrl.jar

Maven parent project, which contains the Java [cloudcontrol PaaS](https://www.cloudcontrol.com/) API adapter modules and tools.

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

1. Clone the [cctrl.jar](https://github.com/denisneuling/cctrl.jar.git) project

        $ git clone https://github.com/denisneuling/cctrl.jar.git

2. Change into the directory:

        $ cd cctrl.jar

3. Run maven:

        $ mvn install # fetch all dependencies and build the project

### Which modules does this project contain?
---

* [cctrl-api](https://github.com/denisneuling/cctrl.jar/tree/master/cctrl-api/README.md)
* [cctrl-api-client](https://github.com/denisneuling/cctrl.jar/tree/master/cctrl-api-client/README.md)
* [cctrl-maven-plugin](https://github.com/denisneuling/cctrl.jar/tree/master/cctrl-maven-plugin/README.md)