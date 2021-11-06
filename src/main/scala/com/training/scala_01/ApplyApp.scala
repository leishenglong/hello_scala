package com.training.scala_01

object ApplyApp {

  def main(args: Array[String]): Unit = {

    val a= ApplyTest
    val b= ApplyTest

    println(a==b)
    println(a eq b)

    val c = new ApplyTest2
    val d = new ApplyTest2
    println(c.equals(d))
    val ap1 = ApplyTest()  // object.apply
    val ap2 =new ApplyTest2
    ap2()   //class.apply

  }


  object ApplyTest{
    var cnt=1
    def incr={
      cnt+=1
    }
    val app = new ApplyTest2
    def apply()={
      println("this is object apply..")
    }
  }

  class ApplyTest2{

    def apply()={
      println("this is class apply..")
    }
  }





}
