package com.training
import cats.{Monoid, Semigroup}
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
class SemigroupTest extends  AnyWordSpec with Matchers{

  "sem test" in{
    Semigroup[Int].combine(1, 2) should be(
      3
    )
    Semigroup[List[Int]].combine(List(1, 2, 3), List(4, 5, 6)) should be(
      List(1,2,3,4,5,6)
    )
    Semigroup[Option[Int]].combine(Option(1), Option(2)) should be(
      Some(3)
    )
    Semigroup[Option[Int]].combine(Option(1), None) should be(
      Some(1)
    )


  }

  "And now try a slightly more complex combination" in {
    Semigroup[Int => Int].combine(_ + 1, _ * 10).apply(6) should be(67)
  }

  "map conbine test" in{
    val aMap = Map("foo" -> Map("bar" -> 5))
    val anotherMap = Map("foo" -> Map("bar" -> 6))
    val combinedMap = Semigroup[Map[String, Map[String, Int]]].combine(aMap, anotherMap)

    combinedMap.get("foo") should be(Some(Map("bar"->11)))
  }

  "Monoid in" in{
    import cats.implicits._

    Monoid[String].empty should be("")
    Monoid[String].combineAll(List("a", "b", "c")) should be("abc")
    Monoid[String].combineAll(List()) should be("")

    Monoid[Map[String, Int]].combineAll(List(Map("a" -> 1, "b" -> 2), Map("a" -> 3))) should be(

      Map("b"->2,"a"->4)
    )
    Monoid[Map[String, Int]].combineAll(List()) should be(Map())

    val l = List(1, 2, 3, 4, 5)
    l.foldMap(identity) should be(15)
    l.foldMap(i => i.toString) should be("12345")

    l.foldMap(i => (i, i.toString)) should be(15,"12345")
  }

}
