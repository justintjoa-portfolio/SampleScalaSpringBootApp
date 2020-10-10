package com.mycompany.app.entities.Data1

import java.util.UUID

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence._

@Entity
@Table(name = "Nodes", schema = "public")
@JsonIgnoreProperties(Array("hibernateLazyInitializer", "handler"))
class NodeEntry(
               var userid:String,
               var label:String,
            var location:String,
                var imageurl:String,
                var bearing:String) {
  @Id
  val nodeid:String = UUID.randomUUID.toString()

  def this() {
    this("","","","","")
  }


}
