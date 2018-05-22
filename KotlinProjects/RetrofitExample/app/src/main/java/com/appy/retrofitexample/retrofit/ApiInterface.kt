package com.appy.retrofitexample.retrofit

import android.telecom.CallScreeningService
import com.appy.retrofitexample.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiInterface {

    @GET("movie/top_rated?")
     fun getTopRatedMovies(@Query("api_key")  api_key: String): Call<MovieResponse>

    @GET("movie/{id}")
      fun getMovieDetails(@Path("id") id: Int, @Query("api_key")api_key: String): Call<MovieResponse>
}