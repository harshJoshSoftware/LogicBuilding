package com.example.logicbuilding.api

import com.example.logicbuilding.model.Data
import com.example.logicbuilding.model.Period
import retrofit2.http.GET

interface SimpleApi {
    @GET("")//TODO: need the endpoint
    suspend fun getPost(): Data

    @GET("")//TODO: need the endpoint
    suspend fun getPeriod(): Period
}