package com.example.logicbuilding.model

data class Data(
    val min_amount: Int,
    val max_amount: Int
)

data class Period(
    val period: String,
    val display_str: String,
    val terms: Terms
)

data class Terms(
    val term: Int,
    val display_str: String
)