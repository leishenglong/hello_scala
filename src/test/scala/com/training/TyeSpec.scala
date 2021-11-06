package com.training

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class MyContainer[A](val a: A)(implicit manifest: scala.reflect.Manifest[A]) {
  def contents = manifest.runtimeClass.getSimpleName
}

class TyeSpec extends AnyWordSpec with Matchers {

  val fruitBasket = new MyContainer(List)
  fruitBasket.contents should be("List$"
  )

  object Planets extends Enumeration {
    val Mercury = Value
    val Venus = Value
    val Earth = Value
    val Mars = Value
    val Jupiter = Value
    val Saturn = Value
    val Uranus = Value
    val Neptune = Value
    val Pluto = Value

    val Mercury1 = Value(22, "Hermes")
  }

  Planets.Mercury.id should be(0)
  Planets.Venus.id should be(1)

  Planets.Mercury.toString should be("Mercury") //How does it get the name? by Reflection.

  Planets.Mercury1.toString should be()

}
