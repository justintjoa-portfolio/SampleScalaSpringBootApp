package com.mycompany.app.dbhandler.User

import com.mycompany.app.entities.User.User
import org.springframework.data.jpa.repository.JpaRepository

trait UserRepository extends JpaRepository[User, String] {}
