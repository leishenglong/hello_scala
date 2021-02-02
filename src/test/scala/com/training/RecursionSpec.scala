package com.training

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class RecursionSpec extends AnyWordSpec with Matchers {

  "Recursion Spec" should {

    "have a tail Recursion of filter" in {
      def filterR(xs: List[Int], pred: Int => Boolean, acc: List[Int]): List[Int] = {
        if (xs.isEmpty) acc
        else if (pred(xs.head)) filterR(xs.tail, pred, xs.head :: acc)
        else filterR(xs.tail, pred, acc)
      }

      val nums = List.range(1, 10)
      val odds = filterR(nums, x => x % 2 == 1, List())
      odds should contain theSameElementsAs List(1,3,5,7,9)
    }
  }
}
