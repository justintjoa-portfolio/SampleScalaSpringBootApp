package com.mycompany.app.dbhandler.Data1

import com.mycompany.app.entities.Data1.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import java.util

trait UserRepository extends JpaRepository[User, String] {



  @Query("SELECT u FROM User u WHERE u.username = :username")
  def findUserByUsername(
                                          @Param("username") userName:String): util.List[User]

  @Query("DELETE u FROM User u WHERE u.username = :username")
  def deleteUserByUsername(
                          @Param("username") userName:String): Unit


}
