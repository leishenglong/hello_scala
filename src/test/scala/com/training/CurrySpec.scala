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

    "show curry function" in {
      def filter(xs: List[Int], p: Int => Boolean): List[Int] = {
        if (xs.isEmpty) xs
        else if (p(xs.head)) xs.head :: filter(xs.tail, p)
        else filter(xs.tail, p)
      }

      def modN(n: Int)(x: Int) = (x % n) == 0

      val nums = List.range(1, 9)

      filter(nums, modN(2)) shouldEqual List(2, 4, 6, 8)
      filter(nums, modN(3)) shouldEqual List(3, 6)
    }
  }

}
