package com.training

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class TailRecursiveSpec extends AnyWordSpec with Matchers {

  "Tail Recursive Spec" should {

    "build a tail recursive" in {
      def bang(x: Int): Int = {
        if (x == 0) throw new Exception("bang !!!")
        else bang(x - 1)
      }

      the[Exception] thrownBy {
        bang(5)
      }
    }
  }

}
