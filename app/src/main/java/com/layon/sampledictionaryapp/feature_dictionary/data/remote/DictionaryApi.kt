package com.layon.sampledictionaryapp.feature_dictionary.data.remote.dto

import retrofit2.http.GET
import retrofit2.http.Path

interface DictionaryApi {

    @GET("/api/v2/entries/en/{word}")
    suspend fun getWordInfo(
        @Path("word") word : String
    ): List<WordInfoDto>

}