package com.mycompany.app.dbhandler.Data1

import java.util

import com.mycompany.app.entities.Data1.NodeEntry
import org.springframework.data.jpa.repository.{JpaRepository, Query}
import org.springframework.data.repository.query.Param

trait NodeRepository extends JpaRepository[NodeEntry, String] {

  @Query("SELECT u FROM NodeEntry u WHERE u.userid = :userid")
  def findNodesByUserID(
                         @Param("userid") userID: String): util.List[NodeEntry]

  @Query("DELETE u FROM NodeEntry u WHERE u.userid = :userid")
  def deleteNodesByUserID(
                           @Param("userid") userID: String): Unit

  @Query("DELETE u FROM NodeEntry u WHERE u.userid = :userid and u.label = :label")
  def deleteNodesByParams(
                           @Param("userid") userID: String,
                           @Param("label") label: String): Unit


}
