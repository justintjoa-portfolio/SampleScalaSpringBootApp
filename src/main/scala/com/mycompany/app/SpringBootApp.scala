package com.mycompany.app

//https://www.baeldung.com/spring-data-jpa-query
//https://springframework.guru/spring-data-jpa-query/
//https://stackoverflow.com/questions/43515279/error-unable-to-find-springbootconfiguration-when-doing-webmvctest-for-spring


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