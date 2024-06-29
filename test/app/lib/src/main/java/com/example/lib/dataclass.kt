package com.example.lib

data class user (var name :String, var password :String){

}

fun main() {
    val obj = user("Ayush","0804")
    println(obj.toString())
    println(obj.hashCode()) //unique code
    var(name1,pass2)=obj
    println(name1)

    val obj2 = obj.copy()
    obj2.name = "Suko"
    println(obj2)
    println(obj2.hashCode())
    println(obj2.component1())

    var(name,pass)=obj2
    println(pass)
}