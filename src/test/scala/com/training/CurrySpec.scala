package com.training

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class CurrySpec extends AnyWordSpec with Matchers {

  "Curry Spec" should {

    "use non-curried function" in {
      def plainOldSum(x: Int, y: Int) = x + y

      plainOldSum(1, 2) shouldEqual 3
    }

    "use curried function" in {
      def curriedSum(x: Int)(y: Int) = x + y
      curriedSum(1)(2) shouldEqual 3
    }

    "use curried function and partially apply" in {
      def curriedSum(x: Int)(y: Int) = x + y
      val plusOne = curriedSum(1)_
      plusOne(2) shouldEqual 3
    }
  }

}
