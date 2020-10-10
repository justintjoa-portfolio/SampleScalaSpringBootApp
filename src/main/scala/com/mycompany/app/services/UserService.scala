package com.mycompany.app.services

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util

import com.mycompany.app.dbhandler.User.UserRepository
import com.mycompany.app.entities.User.User


@Service
class UserService {

  @Autowired
  private val userRepository:UserRepository = null

  def findAll:util.List[User] = userRepository.findAll

  def findByUUID(UUID: String):User = userRepository.findById(UUID).orElse(throw new Exception())

  def save(userEntry: User):User = userRepository.save(userEntry)

  def deleteByUUID(UUID: String):Unit = userRepository.deleteById(UUID)
}