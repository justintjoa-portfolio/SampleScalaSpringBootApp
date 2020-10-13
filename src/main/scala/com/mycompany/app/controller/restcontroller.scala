package com.mycompany.app.controller


import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation._


import com.mycompany.app.services.{NodeService, UserService}
import javax.servlet.http.HttpServletRequest

@RestController
class restcontroller {


  @Autowired
  private val userService:UserService = null

  @Autowired
  private val nodeService:NodeService = null


  @RequestMapping(value = Array("/register"), method = Array(RequestMethod.POST))
  def hello(): String = {
    return "Hello world!"
  }
}
