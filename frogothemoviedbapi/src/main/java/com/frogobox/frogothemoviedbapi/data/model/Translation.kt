package com.frogobox.frogothemoviedbapi.data.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * TMDBAPI
 * Copyright (C) 13/03/2020.
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
data class Translation(

    @SerializedName("iso_3166_1")
    var iso_3166_1: String? = null,

    @SerializedName("iso_639_1")
    var iso_639_1: String? = null,

    @SerializedName("name")
    var name: String? = null,

    @SerializedName("english_name")
    var english_name: String? = null,

    @SerializedName("data")
    var data: TranslationData? = null

)