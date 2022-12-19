package com.example.logicbuilding.api

import com.example.logicbuilding.model.Post
import com.example.logicbuilding.model.periods
import retrofit2.http.GET

interface SimpleApi {
    @GET("")//TODO: need the endpoint
    suspend fun getPost(): Post

    @GET("")//TODO: need the endpoint
    suspend fun getPeriod(): periods
}