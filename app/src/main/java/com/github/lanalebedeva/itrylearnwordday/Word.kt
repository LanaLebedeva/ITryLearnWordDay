package com.github.lanalebedeva.itrylearnwordday

data class Word(
    val id: Long,
    val word: String,
    val imageUrl: String,
    val explanation: String,
    val translation: String,
)
