package com.example.lib

fun main() {
    println("Booyah!")
    var name = "Shin" //mutable
    name = "Minus One"
    println("Godzilla $name")

    val movie = "King Kong" //immutable
    println(movie)

    var fav: String //declare
    fav = "GvK" //initialize
    println(fav.length)
    var num : Int = 5  //32bit
    println("GxK $fav $num")

    val pi: Float
    pi = 3.14F

    val myLong : Long //64bit
    myLong = 345L

    val myShort : Short //16 bits
    myShort = 1154

    val myByte : Byte //8 bits
    myByte = 115

    val myDouble : Double //32 bits
    myDouble = 34.14
    println(myDouble)

    val grade :Char
    grade = 'A'
    println("grade $grade")

    val map : Boolean
    map = true
    println(map)

    println(69)

}
