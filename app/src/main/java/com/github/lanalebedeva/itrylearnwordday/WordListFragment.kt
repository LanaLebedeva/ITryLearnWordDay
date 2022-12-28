package com.github.lanalebedeva.itrylearnwordday

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class WordListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_word_list, container, false)
        val wordRecyclerView = view.findViewById<RecyclerView>(R.id.fragment_word_list)
        val frameLayoutManager = LinearLayoutManager(view.context)
        val adapter = WordAdapter(Generator.generate())

        wordRecyclerView.layoutManager = frameLayoutManager
        wordRecyclerView.adapter = adapter

        return view
    }

}
