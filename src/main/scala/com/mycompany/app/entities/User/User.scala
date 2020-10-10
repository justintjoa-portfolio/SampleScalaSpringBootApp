package com.mycompany.app.entities.User

import java.util.UUID

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence._

@Entity
@Table(name = "Users", schema = "public")
@JsonIgnoreProperties(Array("hibernateLazyInitializer", "handler"))
class User(
           @Column(name = "phoneNumber")
           var phoneNumber:String) {

  @Id
  var userID = UUID.randomUUID.toString()

}
