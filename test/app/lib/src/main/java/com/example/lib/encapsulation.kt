package com.example.lib

class calci {
     public var num1 = 32f //data members
    private var num2 = 43
    internal var num3 = 11 //later in depth //like public //not outside package
    protected var num4 = 69 // inheritance

    fun add(){    //member functions
        println("sum = ${num1+num2}")
    }

    fun mul(){
        println("mul = ${num1*num2}")
    }
    fun div(){
        println("div = ${(num2.toFloat()/num1)}")
    }
    fun mod(){
        println("mod = ${num2%num1}")
    }
}

fun main(){
    val smtg = calci()
    smtg.add()
    smtg.mul()
    smtg.div()
    smtg.mod()
    println(smtg.num1)
}