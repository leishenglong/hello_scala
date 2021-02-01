package com.training

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class ByNameSpec extends AnyWordSpec with Matchers {

  "ByName Spec" should {

    "throw exception given parameter is not by name" in {
      val flag = true

      def booleanAssert(valid: Boolean) = {
        if (flag && !valid) println("Not valid")
        else println("valid")
      }

      the[Exception] thrownBy {
        booleanAssert(5 / 0 == 0)
      }
    }

    "work normal given parameter is by name" in {
      val flag = false

      def byNameAssert(valid: => Boolean) = {
        if (flag && !valid) println("Not valid")
        else println("valid")
      }

      byNameAssert(5 / 0 == 0)
    }
  }

}
