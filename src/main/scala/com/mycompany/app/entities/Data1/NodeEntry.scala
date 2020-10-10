package com.mycompany.app.entities.Data1

import java.util.UUID

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence._

@Entity
@Table(name = "Nodes", schema = "public")
@JsonIgnoreProperties(Array("hibernateLazyInitializer", "handler"))
class NodeEntry(
               @Column(name = "user")
               var user:String,
               @Column(name="label")
               var label:String,
            @Column(name = "location")
            var location:String,
               @Column(name="imageBucketURL")
                var URL:String,
               @Column(name="bearing")
                var bearing:String) {
  @Id
  val nodeID:String = UUID.randomUUID.toString()


}
