package com.young.movieapp.ui

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.young.movieapp.R
import com.young.movieapp.utils.inflate
import kotlinx.android.synthetic.main.frag_recycler.*

class MovieFragment : Fragment() {

    private val movieList by lazy { rv_news_list }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return container?.inflate(R.layout.frag_recycler)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) { // (2)
        super.onActivityCreated(savedInstanceState)
        // RecyclerView의 리소스 id
        rv_news_list.apply {
            setHasFixedSize(true) // this.. 즉 rv_movie_list.setHasFixedSize()와 같다
            val linearLayout = LinearLayoutManager(context)
            layoutManager = linearLayout // this.layoutManager
        }
    }
}