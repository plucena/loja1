This is a Java REST Webservice example using JPA MySQL persitence

Persistence occurs on a Cloud based mysql Docker instance

This project is associated to CI server: https://hub.jazz.net/pipeline/plucena/ECMApp

Commits triggers builds and automatic deploys to http://ecmapp.mybluemix.net


Local Install 
========


* Maven

Ubuntu: sudo apt-get install maven

Mac OS X: brew install maven 

* Tomcat 7

Ubuntu: sudo apt-get install tomcat7

Mac Os X: download and install tomcat 7 or latter https://tomcat.apache.org/download-70.cgi


Configure Local Tomcat
=================

Follow these instrunctions: http://www.mkyong.com/maven/how-to-deploy-maven-based-war-file-to-tomcat/

Run 
====
mvn tomcat7:deploy 

mvn tomcat7:undeploy 

mvn tomcat7:redeploy 

