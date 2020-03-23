package com.frogobox.frogothemoviedbapi.data.source

import android.content.Context
import com.frogobox.frogothemoviedbapi.data.model.MovieCertification
import com.frogobox.frogothemoviedbapi.data.model.TvCertification
import com.frogobox.frogothemoviedbapi.data.response.Certifications
import com.frogobox.frogothemoviedbapi.data.response.Changes

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * TMDBAPI
 * Copyright (C) 10/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogothemoviedbapi.data.source
 *
 */
class MovieRepository(private val remoteDataSource: MovieRemoteDataSource) : MovieDataSource {

    override fun usingChuckInterceptor(context: Context) {
        remoteDataSource.usingChuckInterceptor(context)
    }

    override fun getMovieCertifications(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<Certifications<MovieCertification>>
    ) {
        remoteDataSource.getMovieCertifications(apiKey, callback)
    }

    override fun getTvCertifications(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<Certifications<TvCertification>>
    ) {
        remoteDataSource.getTvCertifications(apiKey, callback)
    }

    override fun getMovieChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: String?,
        callback: MovieDataSource.GetRemoteCallback<Changes>
    ) {
        remoteDataSource.getMovieChangeList(apiKey, endDate, startDate, page, callback)
    }

    override fun getTvChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: String?,
        callback: MovieDataSource.GetRemoteCallback<Changes>
    ) {
        remoteDataSource.getTvChangeList(apiKey, endDate, startDate, page, callback)
    }

    override fun getPersonChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: String?,
        callback: MovieDataSource.GetRemoteCallback<Changes>
    ) {
        remoteDataSource.getPersonChangeList(apiKey, endDate, startDate, page, callback)
    }
}