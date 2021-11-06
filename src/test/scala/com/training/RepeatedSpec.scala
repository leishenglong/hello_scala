package com.training

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class RepeatedSpec extends AnyWordSpec with Matchers{

  def repeatedParameterMethod(x: Int, y: String, z: Any*) = {
    "%d %ss can give you %s".format(x, y, z.mkString(", "))
  }

  "repeated" in{
    repeatedParameterMethod(
      3,
      "egg",
      "a delicious sandwich",
      "protein",
      "high cholesterol") should be(

      "3 eggs can give you a delicious sandwich, protein, high cholesterol"
    )
    repeatedParameterMethod(
      3,
      "egg",
      List("a delicious sandwich", "protein", "high cholesterol")) should be(

      "3 eggs can give you List(a delicious sandwich, protein, high cholesterol)"
    )

    repeatedParameterMethod(
      3,
      "egg",
      List("a delicious sandwich", "protein", "high cholesterol"): _*) should be(
    )
  }

}
