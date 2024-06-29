package com.example.lib

//single inheritence
open class Papa {     //super parent base
    private var say = "papa"
    open var a = "duniya"
    fun prop(){
        println("$a ka $say")
    }

}

//multilevel
open class Beta : Papa(){   // sub child
    open protected var b = "papa" //can be used by sub
    fun kon(){
        println("sare $a ka papa")
    }
}

//hierarchical
class Toy : Beta(){
    var c = "nalayak"
    override var b = "pqr"
    fun kon2(){
        println("$c beta and $b" )
        println(super.b)
    }
}


class Toy2 : Beta(){
    var c = "rizz"
    override var a = "abc"
    fun kon2(){
        println("$c beta and $b" )
        println(super.prop())

    }
}

fun main() {
    val obj=Papa()
    obj.prop()

    val obj2=Beta()
    obj2.kon()

    val obj3=Toy()
    obj3.kon2()

    val obj4=Toy2()
    obj4.kon2()
}
