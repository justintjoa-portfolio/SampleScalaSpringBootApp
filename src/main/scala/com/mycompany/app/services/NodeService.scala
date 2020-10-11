package com.mycompany.app.services
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util

import com.mycompany.app.dbhandler.Data1.{NodeRepository, UserRepository}
import com.mycompany.app.entities.Data1.{NodeEntry, AppUser}


@Service
class NodeService {

  @Autowired
  private val nodeRepository:NodeRepository = null

  def findByUserID(ID: String):util.List[NodeEntry] = {
    return nodeRepository.findNodesByUserID(ID)
  }

  def save(nodeEntry: NodeEntry):NodeEntry = {
    return nodeRepository.save(nodeEntry)
  }

  def deleteByParams(ID: String, name:String):Unit = nodeRepository.deleteNodesByParams(ID, name)

  def deleteByID(ID: String):Unit = nodeRepository.deleteNodesByUserID(ID)
}
