package com.mycompany.app

//https://www.baeldung.com/spring-data-jpa-query
//https://springframework.guru/spring-data-jpa-query/
//https://stackoverflow.com/questions/43515279/error-unable-to-find-springbootconfiguration-when-doing-webmvctest-for-spring
//https://medium.com/@vimalma1093/java-springboot-blocking-vs-non-blocking-rest-api-implementation-fe5643840287
//https://stackoverflow.com/questions/54504230/how-to-fix-error-executing-ddl-alter-table-events-drop-foreign-key-fkg0mkvgsqn

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.scheduling.annotation.EnableScheduling


@SpringBootApplication
@EnableScheduling
class SpringBootApp


object SpringBootApp extends App{
  SpringApplication.run(classOf[SpringBootApp])
}
