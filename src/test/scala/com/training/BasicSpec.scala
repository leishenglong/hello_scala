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

    "return exist result using var" in {
      def containsNeg(nums: List[Int]): Boolean = {
        var exists = false
        for (num <- nums) {
          if (num < 0) exists = true
        }
        exists
      }

      val nums1 = List(1, 2, 3, 0)
      containsNeg(nums1) shouldEqual false

      val nums2 = List(1, 2, 3, -4, 0)
      containsNeg(nums2) shouldEqual true
    }

    "return exist result using val" in {
      def containsNeg(nums: List[Int]): Boolean = {
        nums.exists(_ < 0)
      }

      val nums1 = List(1, 2, 3, 0)
      containsNeg(nums1) shouldEqual false

      val nums2 = List(1, 2, 3, -4, 0)
      containsNeg(nums2) shouldEqual true
    }

  }

}
