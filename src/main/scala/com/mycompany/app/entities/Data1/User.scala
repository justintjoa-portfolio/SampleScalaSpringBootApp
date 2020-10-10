package com.mycompany.app.entities.Data1

import java.util.UUID

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence._

@Entity
@Table(name = "Users", schema = "public")
@JsonIgnoreProperties(Array("hibernateLazyInitializer", "handler"))
class User(
            @Column(name = "username")
            var username:String,
           @Column(name = "phoneNumber")
           var phoneNumber:String) {

  @Column(name="bearingsUsed")
  var bearingsUsed:Int = 0

  @Id
  val userID:String = UUID.randomUUID.toString()




}
