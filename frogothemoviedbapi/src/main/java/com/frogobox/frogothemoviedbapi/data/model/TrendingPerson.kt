package com.frogobox.frogothemoviedbapi.data.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * consumable-code-movie-tmdb-api
 * Copyright (C) 29/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogothemoviedbapi.data.model
 *
 */
data class TrendingPerson(

    @SerializedName("adult")
    var adult: Boolean? = null,

    @SerializedName("gender")
    var gender: Int? = null,

    @SerializedName("name")
    var name: String? = null,

    @SerializedName("id")
    var id: Int? = null,

    @SerializedName("known_for")
    var known_for: List<TrendingMovie>? = null,

    @SerializedName("known_for_department")
    var known_for_department: String? = null,

    @SerializedName("profile_path")
    var profile_path: String? = null,

    @SerializedName("popularity")
    var popularity: Double? = null,

    @SerializedName("media_type:")
    var media_type: String? = null

)