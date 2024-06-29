package com.example.lib

enum class Color {
    RED,
    BLACK,
    BLUE
}

sealed class Colour(code : Int) {
    class TEAL : Colour(1)
    class BROWN : Colour(2)
    class JADE(var code: Int) : Colour(code)
}

fun main() {
    val value= Color.RED
    println(value)
    println(value.ordinal) //sequence

    val all = Color.values()
    all.forEach { println(it) }
    all.forEach { println( it.ordinal )}


    val grad = Colour.JADE(5)
    println(grad)
    println(grad.code)
}