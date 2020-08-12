package com.hanseltritama.recyclercardviewdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

// The adapter class is responsible for taking in the data source
// and creating a view for each item in the Recycler View

class TvShowAdapter(private val tvShowList: List<TvShow>) : RecyclerView.Adapter<TvShowViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return TvShowViewHolder(inflater, parent)
    }

    override fun getItemCount(): Int = tvShowList.size

    override fun onBindViewHolder(holder: TvShowViewHolder, position: Int) {

        val tvShow: TvShow = tvShowList[position]

        holder.tvShowTitle!!.text = tvShow.tvShowTitle
        holder.tvShowImage!!.setImageResource(tvShow.tvShowImage)

        holder.tvShowCardView!!.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View?) {
                view?.let { Snackbar.make(it, "Position: $position", Snackbar.LENGTH_LONG).show() }
            }
        })

    }

}