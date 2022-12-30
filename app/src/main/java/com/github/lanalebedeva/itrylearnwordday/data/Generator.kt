package com.github.lanalebedeva.itrylearnwordday.data

object Generator {
    fun generate(): MutableList<Word> {
        return mutableListOf(
            Word(
                id = 1L,
                word = "dog",
                imageUrl = "https://media3.giphy.com/media/3o7527pa7qs9kCG78A/giphy.gif?cid=28d581b128mzecg7tajl56oklyhwyyiycbjg7d8wl8n8dnu6&rid=giphy.gif&ct=g",
                explanation = "a common animal with four legs, especially kept by people as a pet or to hunt or guard thinghs",
                translation = "собака",
            ),
            Word(
                id = 2L,
                word = "cat",
                imageUrl = "https://media1.giphy.com/media/BzyTuYCmvSORqs1ABM/giphy.gif?cid=28d581b1r2yvjahx91esxuoc5j7qkegnjrj40nuy1xnkzas1&rid=giphy.gif&ct=g",
                explanation = "a small animal fith fur, four legs, a tail, and claws, usually kept as pet or for catching mice",
                translation = "кошка",
            ),
            Word(
                id = 3L,
                word = "mousee",
                imageUrl = "https://media3.giphy.com/media/NPSUg7shzn54s/giphy.gif?cid=28d581b1c067gmdye8zt5pxesifph1pgdq24376ayxo3dm0i&rid=giphy.gif&ct=g",
                explanation = "a amall mammal with short fur, a pointed face, and a long tail",
                translation = "мышь",
            ),
        )
    }
}
