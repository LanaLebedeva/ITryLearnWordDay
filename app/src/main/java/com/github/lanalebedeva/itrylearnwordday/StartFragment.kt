package com.github.lanalebedeva.itrylearnwordday

import android.R
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.GridView
import androidx.fragment.app.Fragment
import com.github.lanalebedeva.itrylearnwordday.databinding.FragmentStartBinding


class StartFragment : Fragment(R.layout.fragment_start) {

    private var _binding: FragmentStartBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentStartBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val data = view.resources.getStringArray(R.array.languages)
        val gridView: GridView = binding.gvStart
        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(view.context, R.layout.item_langages, data)
        gridView.adapter = adapter

        gridView.onItemClickListener =
            OnItemClickListener { adapterView, viewOnClick, i, l ->
                Log.d("START", "view = ${viewOnClick} i=${i} l=${l}")
            }
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}
