FROM openjdk:8u191-jre-alpine3.9

#For health check script
RUN apk add curl jq 

#Work Space
WORKDIR vinoth

#Adding JARS files from target folder of host
#To the docker image
ADD target/selenium-docker.jar 			selenium-docker.jar
ADD target/selenium-docker-tests.jar 	selenium-docker-tests.jar
ADD target/libs 						libs

#Adding Suite file (testng.xml files)
ADD testng.xml 								testng.xml

# ADD health check script
RUN wget https://s3.amazonaws.com/selenium-docker/healthcheck/healthcheck.sh

ENTRYPOINT sh healthcheck.sh