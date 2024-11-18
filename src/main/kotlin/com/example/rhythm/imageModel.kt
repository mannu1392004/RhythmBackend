package com.example.rhythm

import com.example.rhythm.model.ImageModel
import org.springframework.data.mongodb.repository.MongoRepository

interface imageModel:MongoRepository<ImageModel,String> {
}