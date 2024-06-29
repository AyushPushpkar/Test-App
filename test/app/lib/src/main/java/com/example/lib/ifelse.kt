package com.example.lib

fun main() {
    println("enter year")
    val year = readLine()!!.toInt()
    if(year%100==0){
        if (year%400==0)
            println("century leap year")
        else println("century year")
    }
    else{
        if (year%4==0)
            println("leap year")
        else println("not leap year")
    }

    val AyushIQ = 90
    val RohanIQ = 19
    val IQ = if ( AyushIQ > RohanIQ)
        "Ayush is smart"
    else "Rohan is stupid"
    println(IQ)
}
