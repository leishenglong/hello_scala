package com.training

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class UnarySpec extends AnyWordSpec with Matchers {

  "Unary Spec" should {

    "return the same result given prefix invoke and unary invoke " in {
      val r1 = -2
      val r2 = 2.unary_-

      r1 shouldEqual r2
    }

  }

}
