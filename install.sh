#!/bin/bash

VERSION='0.0.2-SNAPSHOT'

mvn package && mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file -Dfile=target/common-auth-spring-boot-starter-${VERSION}.jar -DpomFile=pom.xml
