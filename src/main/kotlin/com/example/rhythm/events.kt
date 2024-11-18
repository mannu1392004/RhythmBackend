package com.example.rhythm

import com.example.rhythm.model.Events
import org.springframework.data.mongodb.repository.MongoRepository

interface events:MongoRepository<Events,String>  {
}