package com.example.lib

//type 1
fun sum(){
    var a = 3
    var b =5
    var add = a+b
    println(add)
}

//type 2
fun sum2(): Int {
    var a = 3
    var b =5
    var c =b-a
    return(c)              //return
}

//type 3

fun sum3(a:Int,b :Int){  //argument
    var c = a*b
    println(c)
}

//type 4
fun sum4(a:Int,b :Int):Float{
    var c = (b.toFloat()/a)
    return(c)
}

fun main() {
    sum()
    var s =sum2()
    println(s)

    var a =3
    var b= 5
    sum3(a,b)
    var c = sum4(a,b)
    println(c)

    var lamda = {a:Int,b:Int->b%a}
    println(lamda(5,12))
}