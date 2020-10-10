package test

import java.io.IOException
import java.security.GeneralSecurityException

import org.junit.Test
import java.util
import java.util.List

import com.mycompany.app.SpringBootApp
import com.mycompany.app.config.Data1Config
import com.mycompany.app.dbhandler.Data1.{NodeRepository, UserRepository}
import com.mycompany.app.services.{NodeService, UserService}
import com.mycompany.app.entities.Data1._
import org.junit.Assert._
import org.junit.jupiter.api.`extension`.ExtendWith
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.context.junit4.SpringRunner

import scala.annotation.tailrec
import scala.util.control.Breaks.break

@RunWith(classOf[SpringRunner])
@SpringBootTest(classes=Array(classOf[SpringBootApp]))
class test {

  @Autowired
  private val userService:UserService = null

  @Autowired
  private val nodeService:NodeService = null


  @Test
  def basic(): Unit = {
    var input = new User("jack", "+16265337628")
    userService.save(input)
    var nodeinput = new NodeEntry(input.userID, "one", "foo", "foo2", "foo3")
    var nodeinput2 = new NodeEntry(input.userID, "two", "foo", "foo2", "foo3")
    var nodeinput3 = new NodeEntry(input.userID, "three", "foo", "foo2", "foo3")
    var nodeinput4 = new NodeEntry(input.userID, "four", "foo", "foo2", "foo3")
    nodeService.save(nodeinput); nodeService.save(nodeinput2); nodeService.save(nodeinput3); nodeService.save(nodeinput4)
    userService.findByUsername(input.username)
    nodeService.findByUserID(input.userID)
    nodeService.deleteByParams(input.userID, "three")
    nodeService.deleteByID(input.userID)
    userService.deleteByUsername(input.username)

  }

}

