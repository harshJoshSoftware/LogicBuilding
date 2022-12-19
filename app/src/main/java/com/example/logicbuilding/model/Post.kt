package com.example.logicbuilding.model

data class Post(
    val min_amount: Int,
    val max_amount: Int
)

data class periods(
    val userId: Int,
    val id: Int,
    val title: String,
    val body: String
)