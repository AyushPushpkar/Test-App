package com.example.lib

fun main(){

    val age = 10
    val result = age in 1..100
    println(result)
    when(age){
        18 -> println("vote")
        15 -> println("minor")
        else -> println("whatever")
    }
    val result2 = age in 1 until 100

    val bool : Boolean = if ((age<=100)&&(age>=1))
        true
    else false
    println(bool)
}