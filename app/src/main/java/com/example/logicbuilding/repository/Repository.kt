package com.example.logicbuilding.repository

import com.example.logicbuilding.api.RetrofitInstance
import com.example.logicbuilding.model.Data
import com.example.logicbuilding.model.Period

class Repository {
    suspend fun getPost(): Data {
        return RetrofitInstance.api.getPost()
    }

    suspend fun getPeriod(): Period {
        return RetrofitInstance.api.getPeriod()
    }
}