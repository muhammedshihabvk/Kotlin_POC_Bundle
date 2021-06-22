package com.shabsudemy.mykotlinfirstapp.models

import java.io.Serializable

class Hero(val name:String, val age:Int) : Serializable

//class Hero(val age:Int) {
//
//    init {
//        println("inti method called")
//    }
//
//    constructor(place:String,pincode:Int,age:Int):this(age){  //use primary and secondary constructor same time
//        this.place = place
//        this.pincode = pincode
//    }
//
//
//    var name: String? = null
//    var place:String = ""
//    var pincode:Int = 0
//
//
//    fun printHeroName(){
//        println(name)
//    }
//
//    fun printHeroAge(){
//        println(age)
//    }
//
//    fun addNumbers(a:Int,b:Int):Int{
//        return a+b
//    }
//}

