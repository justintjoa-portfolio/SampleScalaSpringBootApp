package com.mycompany.app.dbhandler.Data1

import java.util

import com.mycompany.app.entities.Data1.NodeEntry
import org.springframework.data.jpa.repository.{JpaRepository, Query}
import org.springframework.data.repository.query.Param

trait NodeRepository extends JpaRepository[NodeEntry, String] {

  @Query("SELECT u FROM NodeEntry u WHERE u.user = :user")
  def findNodesByUserID(
                         @Param("user") userID: String): java.util.Optional[util.List[NodeEntry]]

  @Query("DELETE u FROM NodeEntry u WHERE u.user = :user")
  def deleteNodesByUserID(
                           @Param("user") userID: String): Unit

  @Query("DELETE u FROM NodeEntry u WHERE u.user = :user and u.label = :label")
  def deleteNodesByParams(
                           @Param("user") userID: String,
                           @Param("label") label: String): Unit


}
