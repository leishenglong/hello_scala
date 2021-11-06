package com.training

import cats.Functor
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class CatsSpec extends AnyWordSpec with Matchers {

  val source = List("Cats", "is", "awesome")
  val product = Functor[List].fproduct(source)(_.length).toMap

//  product.get("Cats").getOrElse(0) should be(4
//  )
//      product.get("is").getOrElse(0) should be(
//      )
//      product.get("awesome").getOrElse(0) should be(
//      )

  val listOpt = Functor[List] compose Functor[Option]
  listOpt.map(List(Some(1), None, Some(3)))(_ + 1) should be(2)

}
