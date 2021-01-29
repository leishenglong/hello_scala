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

      biggerThan2 shouldEqual List(4,5,7,9)
    }
  }

}
