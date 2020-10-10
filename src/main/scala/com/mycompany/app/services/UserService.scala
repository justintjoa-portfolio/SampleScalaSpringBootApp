package com.mycompany.app.services

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util

import com.mycompany.app.dbhandler.Data1.UserRepository
import com.mycompany.app.entities.Data1.User


@Service
class UserService {

  @Autowired
  private val userRepository:UserRepository = null

  def findByUsername(Username: String):User = userRepository.findUserByUsername(Username).orElse(throw new Exception())

  def save(userEntry: User):User = userRepository.save(userEntry)

  def deleteByUsername(Username: String):Unit = userRepository.deleteUserByUsername(Username)
}