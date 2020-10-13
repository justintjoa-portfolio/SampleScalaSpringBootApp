package com.mycompany.app.dbhandler.Data1

import com.mycompany.app.entities.Data1.AppUser
import org.springframework.data.jpa.repository.{JpaRepository, Modifying, Query}
import java.util

import org.springframework.transaction.annotation.Transactional

trait UserRepository extends JpaRepository[AppUser, String] {



  @Query(value = "SELECT * FROM appusers u where u.username = ?1",
    nativeQuery = true)
  def findUserByUsername(
                                          userName:String): util.List[AppUser]


  @Modifying
  @Transactional
  @Query(value = "DELETE FROM appusers u where u.username = ?1",
    nativeQuery = true)
  def deleteUserByUsername(
                          userName:String): Unit


}
