package com.example.lib

open class A {
    open fun hello() {
        println("base class")
    }
    fun mod(n:Int,m:Int):Int{
        return n%m
    }
}

class B : A(){
    override fun hello() {  //static binding //compile time poly
        println("sub class")
        super.hello()
    }
    fun mod(n:Int,m:Int,p:Int):Int {  //func overloading // runtime poly
        var a =n%m+p
        return(a)
    }
}


fun main() {
    var obj = B()
    obj.hello()
    var a =obj.mod(10,5,2)
    println(a)

    var obj2= A()
    obj2.hello()
}