package com.example.lib

import kotlin.time.times

//parameterised constructor
class explain1(var n1:Int , var n2:Int){ //global variable
    var n3:Int = n2 + 3 //local variable
    var n4:Int
    init {  // initializer block
        n4 = n1
    }
    fun add(){
        println("${n1+n2}")
    }
}

//purpose -> to initialise memory of class
class explain{
    var n3 :Int? = null
    var n4 :Int? =null  //don't use init

    constructor(){} //primary constructor
    constructor( n1:Int=3 , n2:Int=6){ //default values
        this.n3=n2+4
        this.n4=n1*2
    } //secondary constructor

    constructor(name:String){
        println(name)
    }

    fun mul(){
        println("${n3!! * n4!!}")
    }
}

fun main(){
 //  var n1= readLine()!!.toInt()
//    var obj = explain1(n1 ,45)
//    obj.add()

    var obj2 = explain("Ayush")

    var obj3=explain(2,6)
    obj3.mul()
}