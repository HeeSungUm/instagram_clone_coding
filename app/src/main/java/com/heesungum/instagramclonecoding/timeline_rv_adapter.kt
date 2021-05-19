package com.heesungum.instagramclonecoding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import de.hdodenhof.circleimageview.CircleImageView

class timeline_rv_adapter(_itemCount:Int) : RecyclerView.Adapter<timeline_rv_adapter.ViewHolder>() {
    private val itemCount = _itemCount
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView : CircleImageView = itemView.findViewById(R.id.profile_civ)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v : View = LayoutInflater.from(parent.context).inflate(R.layout.timeline_rv_item, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.load("https://cdn.womaneconomy.kr/news/photo/202008/93227_303386_4457.jpg")
    }

    override fun getItemCount(): Int = itemCount
}