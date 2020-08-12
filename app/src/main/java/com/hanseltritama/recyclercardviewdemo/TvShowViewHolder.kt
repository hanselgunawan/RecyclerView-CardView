package com.hanseltritama.recyclercardviewdemo

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class TvShowViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.list_item, parent, false)) {

    var tvShowTitle: TextView? = null
    var tvShowImage: ImageView? = null
    var tvShowCardView: CardView? = null

    init {
        tvShowTitle = itemView.findViewById(R.id.tv_show_title)
        tvShowImage = itemView.findViewById(R.id.tv_show_image)
        tvShowCardView = itemView.findViewById(R.id.card_view)
    }
}