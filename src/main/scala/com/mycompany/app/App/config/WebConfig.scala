package com.mycompany.app.App.config

import org.apache.catalina.Context
import org.apache.catalina.connector.Connector
import org.apache.tomcat.util.descriptor.web.SecurityCollection
import org.apache.tomcat.util.descriptor.web.SecurityConstraint
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory
import org.springframework.boot.web.servlet.server.ServletWebServerFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class WebConfig {
  @Bean
  def servletContainer: ServletWebServerFactory = {
    val tomcat = new TomcatServletWebServerFactory() {
      override protected def postProcessContext(context: Context):Unit = {
        val securityConstraint = new SecurityConstraint
        securityConstraint.setUserConstraint("CONFIDENTIAL")
        val collection = new SecurityCollection
        collection.addPattern("/*")
        securityConstraint.addCollection(collection)
        context.addConstraint(securityConstraint)
      }
    }
    tomcat.addAdditionalTomcatConnectors(redirectConnector)
    return tomcat
  }

  private def redirectConnector:Connector = {
    val connector = new Connector("org.apache.coyote.http11.Http11NioProtocol")
    connector.setScheme("http")
    connector.setPort(8080)
    connector.setSecure(false)
    connector.setRedirectPort(8443)
    return connector
  }
}