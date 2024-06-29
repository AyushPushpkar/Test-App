package com.example.lib

class Era {
    fun showa(){
        println("gojira")
    }
    fun heisei(){
        println("godzilla 84")
    }
    fun millenium(){
        println("godzilla 2000")
    }
    fun reiwa(){
        println("shin godzilla")
    }
}

fun main(){
    val Godzilla=Era()
    Godzilla.showa()
    Godzilla.heisei()
    Godzilla.millenium()
    Godzilla.reiwa()

}