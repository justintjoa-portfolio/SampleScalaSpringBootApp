package com.mycompany.app.services

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util

import com.mycompany.app.dbhandler.Data1.UserRepository
import com.mycompany.app.entities.Data1.AppUser


@Service
class UserService {

  @Autowired
  private val userRepository:UserRepository = null

  def findByUsername(Username: String):AppUser = {
    var userBank = userRepository.findUserByUsername(Username)
    if (userBank.size() == 0) {
      throw new Exception()
    }
    return userBank.get(0)
  }

  def save(userEntry: AppUser):AppUser= {
    if (userRepository.findUserByUsername(userEntry.username).size() > 0) {
      throw new Exception()
    }
    userRepository.save(userEntry)
  }

  def deleteByUsername(Username: String):Unit = userRepository.deleteUserByUsername(Username)
}