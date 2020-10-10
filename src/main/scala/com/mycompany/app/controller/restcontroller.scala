package com.mycompany.app.controller

import com.fasterxml.jackson.databind.JsonNode
import org.apache.cassandra.tools.nodetool.Refresh
import org.apache.commons.codec.binary.Base64
import org.json.simple.parser.ParseException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation._
import com.mashape.unirest.http.HttpResponse
import com.mashape.unirest.http.Unirest
import com.mashape.unirest.http.exceptions.UnirestException
import java.io.IOException
import java.io.UnsupportedEncodingException
import java.security.GeneralSecurityException
import java.util
import java.util.UUID

import com.mycompany.app.services.UserService
import javax.servlet.http.HttpServletRequest

@RestController
class restcontroller {


  @Autowired
  private val userService:UserService = null


  @RequestMapping(value = Array("/register"), method = Array(RequestMethod.POST))
  def hello(): String = {
    return "Hello world!"
  }
}
