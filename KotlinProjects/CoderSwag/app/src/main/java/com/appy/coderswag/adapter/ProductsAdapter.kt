package com.appy.coderswag.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.appy.coderswag.R
import com.appy.coderswag.model.Product
import kotlinx.android.synthetic.main.product_list_item.view.*

class ProductsAdapter(val context: Context,val products: List<Product>): RecyclerView.Adapter<ProductsAdapter.ProductHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item,parent,false)
        return ProductHolder(view)
    }

    override fun getItemCount(): Int {
       return products.count()
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.bindProduct(products[position],context)
    }

    inner class ProductHolder(itemView: View?): RecyclerView.ViewHolder(itemView) {

        val ivProductImage = itemView?.findViewById<ImageView>(R.id.ivProductImage)
        val tvProductName = itemView?.findViewById<TextView>(R.id.tvProductName)
        val tvProductPrice = itemView?.findViewById<TextView>(R.id.tvProductPrice)

        fun bindProduct(product: Product, context: Context){
            val resourceID= context.resources.getIdentifier(product.image,"drawable",context.packageName)

            ivProductImage?.setImageResource(resourceID)
            tvProductName?.text = product.title
            tvProductPrice?.text = product.price
        }
    }
}