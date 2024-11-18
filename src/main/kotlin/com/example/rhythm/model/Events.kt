package com.example.rhythm.model

import org.springframework.data.annotation.Id

data class Events(
    @Id
    val id: String,
    val eventName: String,
    val image: String,
    val description: String,
    val ruleBook: String,
    val date: String,
    val location: String,
    val time: String,
    val type: String,
)