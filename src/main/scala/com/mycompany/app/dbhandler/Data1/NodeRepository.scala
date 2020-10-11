package com.mycompany.app.dbhandler.Data1

import java.util

import com.mycompany.app.entities.Data1.NodeEntry
import org.springframework.data.jpa.repository.{JpaRepository, Modifying, Query}
import org.springframework.data.repository.query.Param
import org.springframework.transaction.annotation.Transactional

trait NodeRepository extends JpaRepository[NodeEntry, String] {

  @Query(value = "SELECT * FROM nodes u where u.userid = ?1",
    nativeQuery = true)
  def findNodesByUserID(
                         userID: String): util.List[NodeEntry]

  @Modifying
  @Transactional
  @Query(value = "DELETE FROM nodes u where u.userid = ?1",
    nativeQuery = true)
  def deleteNodesByUserID(
                           userID: String): Unit

  @Modifying
  @Transactional
  @Query(value = "DELETE FROM nodes u where u.userid = ?1 and u.label = ?2",
    nativeQuery = true)
  def deleteNodesByParams(
                           userID: String,
                           label: String): Unit


}
