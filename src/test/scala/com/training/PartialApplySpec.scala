package com.training

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class PartialApplySpec extends AnyWordSpec with Matchers {

  "Partial apply Spec" should {

    "show how to use" in {
      def price(product: String): Double = product match {
        case "apples" => 140
        case "oranges" => 223
      }

      def withTax(cost: Double, state: String): Double = state match {
        case "NY" => cost * 2
        case "FL" => cost * 3
      }

      val locallyTaxed = withTax(_: Double, "NY")
      val costOfApples = locallyTaxed(price("apples"))

      Math.round(costOfApples) shouldEqual 280
    }

    "show how to use partial function" in {
      val result = List(1, 3, 5, "Seven") collect {case i: Int => i + 1}
      result shouldEqual List(2, 4, 6)
    }
  }

  "Partial function" should {
    "try PartialFunction" in {
      def pAnswerUnits: PartialFunction[Int, Int] = {
        case d: Int if d != 0 => 42 / d
      }

      pAnswerUnits(42) shouldEqual 1
    }
  }

}
