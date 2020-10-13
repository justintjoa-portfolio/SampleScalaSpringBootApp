package com.mycompany.app.config

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.orm.jpa.JpaTransactionManager
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean
import org.springframework.transaction.annotation.EnableTransactionManagement
import javax.persistence.EntityManagerFactory
import javax.sql.DataSource
import java.util



@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "userEntityManagerFactory", transactionManagerRef = "userTransactionManager", basePackages = Array("com.mycompany.app.dbhandler.Data1"))
class Data1Config {
  @Primary
  @Bean(name = Array("userDataSource"))
  @ConfigurationProperties(prefix = "spring.datasource") def userDataSource = DataSourceBuilder.create.build

  @Primary
  @Bean(name = Array("userEntityManagerFactory")) def entityManagerFactory(builder: EntityManagerFactoryBuilder, @Qualifier("userDataSource") dataSource: DataSource): LocalContainerEntityManagerFactoryBean = {
    val properties = new util.HashMap[String, AnyRef]
    properties.put("hibernate.hbm2ddl.auto", "update")
    return builder.dataSource(dataSource).packages("com.mycompany.app.entities.Data1").persistenceUnit("db1").properties(properties).build
  }

  @Primary
  @Bean(name = Array("userTransactionManager")) def userTransactionManager(@Qualifier("userEntityManagerFactory") userEntityManagerFactory: EntityManagerFactory) = new JpaTransactionManager(userEntityManagerFactory)
}

