# Action Pack Development Kit - Maven project template
This project is supposed to enable Action Pack development in Java. No more need to deal with all the Automic Automation Engine objects. Full focus on developing reusable building blocks for your automated processes! Use this archetype to create a Maven project that contains all required dependencies including the installed version of the Action Pack Development Kit. The created Maven project also contains a sample implementation of an action pack and an action.

## Build and install 
Build in install the archetype in your local Maven repository.

```
mvn install
```

## Usage

This is probably the easiest way to create a new action pack. Download and build the action-pack-sdk and install it in your local Maven repository. As soon as the action-pack-sdk is available you may create a new project with the following command:

```
mvn archetype:generate -B -DarchetypeGroupId=com.broadcom 
                          -DarchetypeArtifactId=action-pack-archetype 
                          -DarchetypeVersion=1.0-SNAPSHOT 
                          -DgroupId=com.broadcom 
                          -DartifactId=my-action-pack 
                          -Dversion=1.0-SNAPSHOT
```
