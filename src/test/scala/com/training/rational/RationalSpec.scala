package com.training.rational

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class RationalSpec extends AnyWordSpec with Matchers {

  "Rational Spec" should {

    "Constructing a Rational" in {
      val rational = new Rational(2, 1)
      println(rational)
    }

    "not allowed 0 denominator" in {
      the[IllegalArgumentException] thrownBy {
        new Rational(5, 0)
      }
    }

    "return added rational given two different rational" in {
      val r1 = new Rational(2, 1)
      val r2 = new Rational(3, 1)

      (r1 add r2).numer shouldEqual 5
      (r1 add r2).denom shouldEqual 1
    }
  }

}
