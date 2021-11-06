package com.training

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class ForTest extends  AnyWordSpec with Matchers{

  val xValues = 1 to 4 //1,2,3,4
  val yValues = 1 to 2 //1,2
  val coordinates = for {
    x <- xValues
    y <- yValues
  } yield (x,y)
  println(coordinates(3) )
}
