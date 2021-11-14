package com.training.scala_01

object CBNvsCBV extends App {
  def callByValue(x: Long): Unit = {
    println("x:" + x)
    println("x:" + x)
  }

  def callByName(y: => Long): Unit = {
    println("y:" + y)
    println("y:" + y)
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())

  def isCall(): Int = 1 + isCall()
  def printFist(x:Int,y: => Long):Unit=println(x)

//  printFist(isCall(),34)
  printFist(34,isCall())

}
