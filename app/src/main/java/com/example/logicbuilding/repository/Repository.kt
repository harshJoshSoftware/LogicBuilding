package com.example.logicbuilding.repository

import com.example.logicbuilding.api.RetrofitInstance
import com.example.logicbuilding.model.Post
import com.example.logicbuilding.model.periods

class Repository {
    suspend fun getPost(): Post {
        return RetrofitInstance.api.getPost()
    }

    suspend fun getPeriod(): periods {
        return RetrofitInstance.api.getPeriod()
    }
}