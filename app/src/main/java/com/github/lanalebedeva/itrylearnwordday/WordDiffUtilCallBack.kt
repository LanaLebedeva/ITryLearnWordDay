package com.github.lanalebedeva.itrylearnwordday

import androidx.recyclerview.widget.DiffUtil
import com.github.lanalebedeva.itrylearnwordday.data.Word

class WordDiffUtilCallBack: DiffUtil.ItemCallback<Word>() {

    override fun areItemsTheSame(oldItem: Word, newItem: Word) = oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Word, newItem: Word) = oldItem == newItem
}
