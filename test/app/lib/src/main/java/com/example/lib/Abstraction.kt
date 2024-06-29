package com.example.lib

abstract class goji {
     fun heisei(){
        println("1984")
    }
    abstract fun milleium()
}

class gamera():goji(){
    override fun milleium() {
        println("flying turtle")
    }

}

fun main() {
    val obj = gamera()
    obj.heisei()
    obj.milleium()
}