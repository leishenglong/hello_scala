package com.training

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class VarVsValSpec extends AnyWordSpec with Matchers {

  "Var vs Val Spec" should {

    "print by using var" in {
      val args = Array("str1", "str2", "str3")
      printArgs(args)
    }

    "print by using val" in {
      val args = Array("str1", "str2", "str3")
      for (a <- args)
        println(a)
    }

    "print by using foreach" in {
      val args = Array("str1", "str2", "str3")
      args.foreach(println)
    }

    "print by using map" in {
      val args = Array("str1", "str2", "str3")
      args.map(println)
    }
  }

  def printArgs(args: Array[String]): Unit = {
    var i = 0
    while (i < args.length) {
      println(args(i))
      i += 1
    }
  }

}
