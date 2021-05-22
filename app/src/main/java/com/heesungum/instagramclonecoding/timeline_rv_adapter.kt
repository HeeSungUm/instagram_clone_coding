package com.heesungum.instagramclonecoding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import de.hdodenhof.circleimageview.CircleImageView

class timeline_rv_adapter(_itemCount:Int) : RecyclerView.Adapter<timeline_rv_adapter.ViewHolder>() {
    private val itemCount = _itemCount
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profileImageView : CircleImageView = itemView.findViewById(R.id.profile_civ)
        val mainContentImageView : ImageView = itemView.findViewById(R.id.timeline_main_iv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v : View = LayoutInflater.from(parent.context).inflate(R.layout.timeline_rv_item, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.profileImageView.load("https://cdn.womaneconomy.kr/news/photo/202008/93227_303386_4457.jpg")
        holder.mainContentImageView.load("https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=http%3A%2F%2Fcfile28.uf.tistory.com%2Fimage%2F99149F3359B87F0520EE68")
    }

    override fun getItemCount(): Int = itemCount
}