package com.numberoff

import com.training.numberoff.NumberOff
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class NumberOffSpec extends AnyWordSpec with Matchers {

  "NumberOff Spec" should {

    "given 3 when number off return Fizz " in {

      val except = "Fizz"
      val actual = NumberOff.numberOff(3)
      actual shouldEqual except
    }

    "given 5 when number off return Buzz " in {

      val except = "Buzz"
      val actual = NumberOff.numberOff(5)
      actual shouldEqual except
    }

    "given 7 when number off return Whizz " in {

      val except = "Whizz"
      val actual = NumberOff.numberOff(7)
      actual shouldEqual except
    }
    "given 15 when number off return FizzBuzz " in {

      val except = "FizzBuzz"
      val actual = NumberOff.numberOff(15)
      actual shouldEqual except
    }

    "given 21 when number off return FizzWhizz " in {

      val except = "FizzWhizz"
      val actual = NumberOff.numberOff(21)
      actual shouldEqual except
    }

    "given 35 when number off return FizzWhizz " in {

      val except = "BuzzWhizz"
      val actual = NumberOff.numberOff(35)
      actual shouldEqual except
    }

    "given 105 when number off return FizzBuzzWhizz " in {

      val except = "FizzBuzzWhizz"
      val actual = NumberOff.numberOff(105)
      actual shouldEqual except
    }

  }

}
