package com.example.lib

fun main(){

    var name:String? =null//null values can be accepted
 //   name = null
    println(name)
    //option1
    println(
        if (name==null)
        -1
        else name.length
    )
    //option2 -> safe call
    println(name?.length)

    //option3 -> !!
    println(name!!.length)
}