package com.mycompany.app.entities.Data1

import java.util.UUID

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence._

@Entity
@Table(name = "AppUsers", schema = "public")
@JsonIgnoreProperties(Array("hibernateLazyInitializer", "handler"))
class AppUser(
            var username:String,
           var phoneNumber:String) {

  var bearingsused:Int = 0

  @Id
  val userid:String = UUID.randomUUID.toString()

  def this() {
    this("","")
  }


}
