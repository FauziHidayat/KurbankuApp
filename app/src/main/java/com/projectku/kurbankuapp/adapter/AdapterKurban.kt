package com.projectku.kurbankuapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.projectku.kurbankuapp.R
import com.projectku.kurbankuapp.model.Kurban

class AdapterKurban(private val listKurban: ArrayList<Kurban>) : RecyclerView.Adapter<AdapterKurban.ViewHolder>() {

    private var onItemClickCallback: OnItemClickCallback? = null

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var imgKurban: ImageView = itemView.findViewById(R.id.img_kurban)
        var itemNameKurban: TextView = itemView.findViewById(R.id.tv_name)
        var itemAge: TextView = itemView.findViewById(R.id.tv_age)
        var itemWeight: TextView = itemView.findViewById(R.id.tv_weight)
        var itemPrice: TextView = itemView.findViewById(R.id.tv_price)
        var cardItem: CardView = itemView.findViewById(R.id.cv_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterKurban.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_kurban, parent , false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterKurban.ViewHolder, position: Int) {
        val kurban = listKurban[position]

        holder.itemNameKurban.text = kurban.name
        holder.itemAge.text = kurban.age
        holder.itemWeight.text = kurban.weight
        holder.itemPrice.text = kurban.price

        Glide.with(holder.itemView.context)
            .load(kurban.images)
            .apply(RequestOptions())
            .into(holder.imgKurban)


        //val context = holder.itemView.context

        holder.cardItem.setOnClickListener {
            onItemClickCallback?.onItemClicked(kurban)
        }
    }

    override fun getItemCount(): Int = listKurban.size

    interface OnItemClickCallback{
        fun onItemClicked(data: Kurban)
    }
}