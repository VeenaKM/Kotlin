package com.appy.retrofitexample.model

data class MovieResponse(var page: Int?, var total_results: Int?, var total_pages: Int?, var results: List<Movies>?)
