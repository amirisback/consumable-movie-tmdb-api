package com.frogobox.frogothemoviedbapi.data.model

import com.frogobox.frogothemoviedbapi.data.model.ReleaseDate

data class ResultReleaseDate(
    val iso_3166_1: String,
    val release_dates: List<ReleaseDate>
)