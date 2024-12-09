package com.layon.sampledictionaryapp.feature_dictionary.domain.model

import com.layon.sampledictionaryapp.feature_dictionary.data.remote.dto.DefinitionDto

data class Meaning(
    val definitions: List<Definition>,
    val partOfSpeech: String,
) {

}
