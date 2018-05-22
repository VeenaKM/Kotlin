package com.appy.retrofitexample.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.View
import android.view.View.VISIBLE
import com.appy.retrofitexample.R
import com.appy.retrofitexample.adapter.MyAdapter
import com.appy.retrofitexample.model.MovieResponse
import com.appy.retrofitexample.model.Movies
import com.appy.retrofitexample.retrofit.APIClient
import com.appy.retrofitexample.retrofit.ApiInterface
import com.appy.retrofitexample.util.ListItemDecorations
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    val TAG: String = MainActivity::class.java.simpleName
    val API_KEY: String = "ec44357d71b936de6ee7f5aa7837b6a4"
    lateinit var myCustomAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.addItemDecoration(ListItemDecorations(20))
        recyclerView.setHasFixedSize(true)

        if (API_KEY.isEmpty()) {
            toast("Please obtain your API KEY first from www.themoviedb.org")
            return
        }

        progressBar.visibility = VISIBLE

        var apiService = APIClient.client.create(ApiInterface::class.java)

        var call = apiService.getTopRatedMovies(API_KEY)

        call.enqueue(object : Callback<MovieResponse> {
            override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {

                var listOfMovies: List<Movies> = response.body()?.results!!
                myCustomAdapter = MyAdapter(applicationContext, listOfMovies)
                recyclerView.setAdapter(myCustomAdapter)
                progressBar.visibility = View.GONE

                println("path= ${listOfMovies[0].poster_path}")
                println("id= ${listOfMovies[0].id}")
            }

            override fun onFailure(call: Call<MovieResponse>?, t: Throwable?) {
                progressBar.visibility = View.GONE
                Log.e(TAG, t.toString())
            }
        })
    }
}