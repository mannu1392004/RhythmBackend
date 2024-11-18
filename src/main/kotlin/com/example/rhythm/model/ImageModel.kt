package com.example.rhythm.model

import org.springframework.data.annotation.Id

data class ImageModel(
    @Id
    val image: String,
)
