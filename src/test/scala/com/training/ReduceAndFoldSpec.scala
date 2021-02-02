package com.training

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class ReduceAndFoldSpec extends AnyWordSpec with Matchers {

  "Reduce And Fold Spec" should {

    "reduce a list" in {
      val list = List.range(1, 10)
      list.reduce((a, b) => a + b) shouldEqual 45
    }

    "foldLeft a list" in {
      val list = List.range(1, 10)
      list.foldLeft(0)((a,b) => a+b) shouldEqual 45
    }

    "foldLeft a list with sub" in {
      val list = List.range(1, 3)
      list.foldLeft(0)((a,b) => a-b) shouldEqual -3
    }

    "foldRight a list" in {
      val list = List.range(1, 10)
      list.foldRight(0)((a,b) => a+b) shouldEqual 45
    }

    "foldRight a list with sub" in {
      val list = List.range(1, 3)
      list.foldRight(0)((a,b) => a-b) shouldEqual -1
    }
  }
}
