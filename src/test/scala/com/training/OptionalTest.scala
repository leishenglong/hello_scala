package com.training

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class OptionalTest extends AnyWordSpec with Matchers {

  def maybeItWillReturnSomething(flag: Boolean): Option[String] = {
    if (flag) Some("Found value") else None
  }

  val value1 = maybeItWillReturnSomething(true)
  val value2 = maybeItWillReturnSomething(false)

  value1 getOrElse "No value" should be(
    "Found value"
  )
  value2 getOrElse "No value" should be(
    "No value"
  )
  value2 getOrElse {
    "default function"
  } should be(
    "default function"
  )

  val number: Option[Int] = Some(3)
  val noNumber: Option[Int] = None
  val result1 = number.fold(1)(_ * 3)
  //  val result2 = noNumber.fold(2)(_ * 3)
  result1 should be(9)
  //  result2 should be(2)


  val tuple = ("apple", 3, 4, 5)

  tuple._3 should be(4)

  /**
   * advanced function test
   */


  def lambda = { x: Int => x + 1 }

  def lambda2 = (x: Int) => x + 2

  val lambda3 = (x: Int) => x + 3

  val lambda4 = new Function1[Int, Int] {
    def apply(v1: Int): Int = v1 - 1
  }

  def lambda5(x: Int) = x + 1

  val result = lambda(3)
  val result1andhalf = lambda.apply(3)

  val result2 = lambda2(3)
  val result3 = lambda3(3)
  val result4 = lambda4(3)
  val result5 = lambda5(3)

  result should be(4)
  result1andhalf should be(4)
  result2 should be(5)
  result3 should be(6)
  result4 should be(2)
  result5 should be(4)


  def makeUpper(xs: List[String]) =
    xs map {
      _.toUpperCase
    }

  def makeWhatEverYouLike(xs: List[String], sideEffect: String => String) =
    xs map sideEffect

  makeUpper(List("abc", "xyz", "123")) should be(
    List("ABC", "XYZ", "123")
  )

  makeWhatEverYouLike(List("ABC", "XYZ", "123"), x => x.toLowerCase) should be(
    List("abc", "xyz", "123")
  )

  //using it inline
  val myName = (name: String) => s"My name is $name"
  makeWhatEverYouLike(List("John", "Mark"), myName) should be(
    List("My name is John"," My name is Mark")
  )

  List("Scala", "Erlang", "Clojure") map (_.length) should be(
    List(5, 6, 7)
  )



}
