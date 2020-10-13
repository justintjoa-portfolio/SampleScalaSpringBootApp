This is an example of a starter Back-end written in Scala and Springboot (and leveraging Gradle), with configuration via Apache Tomcat and
data config via Spring JPA. This back-end was written around using PostgreSQL, but feel free to change the database
type as you see fit. Do include your own certificate for HTTPS in the resources folder, and make sure to set your
environment variables for your database credentials and URL. 

You can fork this sample Jenkins pipeline here:

https://github.com/justintjoa-portfolio/SampleJenkinsPipeline

For the CI/CD aspect. It has a seedjob which will generate the main build job. This SpringBoot app has a Jenkinsfile
that will work with that jenkins instance.

The gradle also has extra libraries included for using JWT and JSON parsing if you need. 

Note: I do use the Spring Boot application context itself in the tests in test.scala, but I would definitely agree this would not be the best
practice if you use this code and your project grows in size. It's going to create unnecessary wait time in the CI/CD
pipeline that really goes against the philosophy of CI/CD. As your project grows in size I'd instead advise you to
selectively pick the required classes that have the autowired services instead of pulling up the whole application
context. In this case the application itself isn't super huge so it's not too bad, but this can get costly as 
a project grows and scales quick. 

