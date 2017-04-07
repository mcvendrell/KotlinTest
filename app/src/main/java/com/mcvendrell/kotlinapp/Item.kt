package com.mcvendrell.kotlinapp

/*class Item {
    var title: String = ""
        get() {
            return "title: $field"
        }
        set(value) {
            field = "title: $value"
        }
    var url: String = ""
}*/

fun getItems(): List<Item> {
    return (1..10).map{ Item(it.toLong(), "Title $it", "http://lorempixel.com/400/400/cats/$it/")}
}

data class Item(val id: Long, val title: String, val url: String)