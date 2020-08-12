package com.hanseltritama.recyclercardviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var tvShowArray: ArrayList<TvShow>
    private lateinit var tvShowAdapter: TvShowAdapter

    val TvShows = arrayOf("Breaking Bad","Rick and Morty", "FRIENDS","Sherlock","Stranger Things")
    val TvShowImages = arrayOf(R.drawable.android_black,R.drawable.android_black,R.drawable.android_black,R.drawable.android_black,R.drawable.android_black)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i in TvShows.indices) {
            val tvShow = TvShow(TvShows[i], TvShowImages[i])
            tvShowArray.add(tvShow)
        }

        tvShowAdapter = TvShowAdapter(tvShowArray)

        main_tv_shows_recycler_view.layoutManager = LinearLayoutManager(this)
        main_tv_shows_recycler_view.itemAnimator = DefaultItemAnimator()
        main_tv_shows_recycler_view.adapter = tvShowAdapter

    }
}
