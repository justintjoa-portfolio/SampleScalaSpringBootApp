This is an example of a starter Back-end written in Scala and Springboot (and leveraging Gradle), with configuration via Apache Tomcat and
data config via Spring JPA. This back-end was written around using PostgreSQL, but feel free to change the database
type as you see fit. Do include your own certificate for HTTPS in the resources folder, and make sure to set your
environment variables for your database credentials and URL. 

You can fork this sample Jenkins pipeline here:

https://github.com/justintjoa-portfolio/SampleJenkinsPipeline

For the CI/CD aspect. It has a seedjob which will generate the main build job. This SpringBoot app has a Jenkinsfile
that will work with that jenkins instance.

The gradle also has extra libraries included for using JWT and JSON parsing if you need. 

