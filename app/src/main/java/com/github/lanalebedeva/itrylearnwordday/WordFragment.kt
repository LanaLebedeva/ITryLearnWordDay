package com.github.lanalebedeva.itrylearnwordday

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.github.lanalebedeva.itrylearnwordday.databinding.FragmentWordBinding
import com.google.android.material.button.MaterialButton

class WordFragment : Fragment(R.layout.fragment_word) {
    private var _binding: FragmentWordBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWordBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val word: TextView = binding.cvWord
        val imageWord: ImageView = binding.cvImageWord
        val buttonPrevious: MaterialButton = binding.cvButtonPrevious
        val buttonNext: MaterialButton = binding.cvButtonNext
        val explanation: TextView = binding.cvExplanation
        val translation: TextView = binding.cvTranslation
        val button_i_know: MaterialButton = binding.cvButtonIKnow
        val button_edit: MaterialButton = binding.cvButtonEdit
    }
    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}
