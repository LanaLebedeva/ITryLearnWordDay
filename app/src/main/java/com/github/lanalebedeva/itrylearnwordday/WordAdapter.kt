package com.github.lanalebedeva.itrylearnwordday

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class WordAdapter(
    private val wordListData: MutableList<Word>,
) : RecyclerView.Adapter<WordAdapter.WordItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.word_item, parent, false)
        return WordItemViewHolder(view)
    }


    override fun getItemCount() = wordListData.size

    override fun onBindViewHolder(holder: WordItemViewHolder, position: Int) {
        val item = wordListData[position]
        holder.bind(item)
    }

    class WordItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val word: TextView = itemView.findViewById(R.id.cv_word)
        private val imageWord: ImageView = itemView.findViewById(R.id.cv_image_word)
        private val explanation: TextView = itemView.findViewById(R.id.cv_explanation)
        private val translation: TextView = itemView.findViewById(R.id.cv_translation)

        fun bind(listItem: Word) {
            word.text = listItem.word
            Picasso
                .get()
                .load(listItem.imageUrl)
                .placeholder(R.drawable.ic_launcher_background)
                .into(imageWord)
            explanation.text = listItem.explanation
            translation.text = listItem.translation
        }
    }
}
