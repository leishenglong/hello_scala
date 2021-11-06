package com.training

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class inFixandPostFixTest extends  AnyWordSpec with Matchers{

  "infix test" in{
    val g: String = "Check out the big brains on Brad!"

    g indexOf 'o' should be(6) //indexOf(Char) can be used as an infix operator

    // g indexOf 'o', 4 should be (6) //indexOf(Char, Int) cannot be used as an infix operator

    g.indexOf('o', 7) should be(25)

  }
  val g: Int = 31
  (g toHexString) should be("1f")

  def repeatedParameterMethod(x: Int, y: String, z: Any*) = {
    "%d %ss can give you %s".format(x, y, z.mkString(", "))
  }

  repeatedParameterMethod(
    3,
    "egg",
    List("a delicious sandwich", "protein", "high cholesterol")) should be(

    "3 eggs can give you List(a delicious sandwich, protein, high cholesterol)"
  )


}
