package com.mycompany.app.dbhandler.Data1

import com.mycompany.app.entities.Data1.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

trait UserRepository extends JpaRepository[User, String] {



  @Query("SELECT u FROM User u WHERE u.userName = :userName")
  def findUserByUsername(
                                          @Param("userName") userName:String): java.util.Optional[User]

  @Query("DELETE u FROM User u WHERE u.userName = :userName")
  def deleteUserByUsername(
                          @Param("userName") userName:String): Unit


}
