package com.training.scala_01

object MethodNotations extends App {


  class Person(val name:String,movieName:String){
    def likes(movie :String)=movieName==movie

    def apply()=s"Hi,my name is $name and I like $movieName"
  }

  val tome=new Person("tome","spiderMan")
  println(tome.likes("spiderMan"))
  println(tome likes "spiderMan")

  val x = -1
  val y = 1.unary_-
  println(x==y)
}
