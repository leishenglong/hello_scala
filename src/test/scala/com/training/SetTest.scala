package com.training

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class SetTest extends AnyWordSpec with Matchers{

  val set = Set("1",2,3)

  set.size should be(3)

}
