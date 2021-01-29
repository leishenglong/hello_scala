package com.training

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class BasicSpec extends AnyWordSpec with Matchers {

  "Basic Spec" should {

    "show how to drop from array" in {
      val args = Array("a", "b", "c")
      val result = args.drop(1)
      println(result.length)
    }

    "show filter function" in {
      val someNumbers = List(1, 0, 4, 5, 7, 2, 9)
      val biggerThan2 = someNumbers.filter(n => n >= 3)

      biggerThan2 shouldEqual List(4, 5, 7, 9)
    }

    "show filter with underscores" in {
      val someNumbers = List(1, 0, 4, 5, 7, 2, 9)
      val biggerThan2 = someNumbers.filter(_ >= 3)

      biggerThan2 shouldEqual List(4, 5, 7, 9)
    }

    "partially applied function" in {
      def sum(a: Int, b: Int, c: Int) = a + b + c

      sum(1, 2, 3) shouldEqual 6
    }

    "partially applied function v2" in {
      def sum(a: Int, b: Int, c: Int) = a + b + c
      val a = sum _

      a(1, 2, 3) shouldEqual 6
    }

    "partially applied function given need one more parameter" in {
      def sum(a: Int, b: Int, c: Int) = a + b + c
      val b = sum(1, _, 4)

      b(2) shouldEqual 7
    }
  }

}
