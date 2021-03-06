package com.appy.retrofitexample.adapter

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.appy.retrofitexample.R
import com.appy.retrofitexample.activity.SharedPreferenceActivity
import com.appy.retrofitexample.model.Movies
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.inflate_list.view.*
import org.jetbrains.anko.toast

class MyAdapter(var context: Context, var list: List<Movies>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var v = LayoutInflater.from(context).inflate(R.layout.inflate_list, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.tvName.text = "Name : " + list.get(position).original_title
        holder.tvId.text = "Id : " + list.get(position).id.toString()
        holder.tvDesc.text = "Desc : " + list.get(position).overview
        holder.tvDate.text = "Release Date : " + list.get(position).release_date

        holder.itemView.setOnClickListener {
            context.toast(list.get(position).original_title)

            val intent = Intent(context,SharedPreferenceActivity::class.java)
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)

        }

        Glide.with(context).load("https://image.tmdb.org/t/p/original${list.get(position).poster_path}").into(holder.imageView)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName = itemView.tvName
        val tvId = itemView.tvId
        val tvDesc = itemView.tvDesc
        val tvDate = itemView.tvDate
        val card_view = itemView.card_view
        val imageView = itemView.ivMovieImage
    }
}