package com.training.scala_01

import scala.collection.mutable

object HighOrderFunction {

  def callNTime(f: Int => Int, n: Int, x: Int): Int = {
    if (n <= 0) x
    else callNTime(f, n - 1, f(x))
  }

  def callNTimeBetter(f: Int => Int, n: Int): Int => Int = {
    if (n <= 0) (x: Int) => x
    else (x: Int) => callNTimeBetter(f, n - 1)(f(x)) //callNTimeBetter return f apply f(x)
  }

  val plusOne = (x: Int) => x + 1

  val plus10 = callNTimeBetter(plusOne, 10)
  println(plus10(1))


  val superAdd: Int => (Int => Int) = (a: Int) => (b: Int) => a + b
  //  val superAdd:Int=>Int=>Int=(a:Int)=>(b:Int)=>a+b

  val add=superAdd(3)//= b=>3+b
  add(4)//=7

  def curriedFormatter(c:String)(d:Double):String=c.format(d)
  val standardFormat:Double=>String=curriedFormatter("%4.2f")
  val preciseFormat:Double=>String=curriedFormatter("%10.8f")
  curriedFormatter("")(0.9)



  def generateNext(a: Int, b: Int): Int = a + b
  def fibonacciSequence(i: Int, map: mutable.Map[Int, Int]): String = {
    if (i == 1) return "0"
    if (i == 2) return "0 1"
    var str = "0 1"
    if (i > 2) {
      for (x <- 3 to i) {
        map += (x -> (map(x - 1) + map(x - 2)))
        str = str.concat(" " + (map(x - 1) + map(x - 2)))
      }
    }
    str
  }

}
