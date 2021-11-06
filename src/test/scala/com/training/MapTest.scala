package com.training

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

import scala.collection.immutable.Stream.cons

class MapTest extends AnyWordSpec with Matchers {

  val map = Map("1" -> "a", "2" -> "b", 3 -> "c", 2.3 -> 8)
  map(2.3) should be(8)

  map.size should be(4)
  val nMap = map - "1"
  map.contains("1") should be(true)
  nMap.contains("1") should be(false)

  val set = Set(1, 3, 4, 6)
  val result = set.map(_ * 4)
  result.lastOption should be(
    Some(24)
  )

  val sets = Set(4, 6, 7, 8, 9, 13, 14)
  val results = sets.toSeq

  println("dd" + results)
  val indexSeq = sets.toIndexedSeq
  println(indexSeq)
  //  (result take 3) should be()

  "map" should {
    val map = Map("Phoenix" -> "Arizona", "Austin" -> "Texas")
    //    map.known should be(
    //      2
    //    )

    //    val stream = cons(0, cons(1, LazyList.empty))
    //    stream.knownSize should be(
    //      2
    //    )
  }

  "list" in {
    val list = List(10, 19, 45, 1, 22)
    list.headOption should be(
      10
    )

    val list2 = List()
    list2.headOption should be(
      None
    )
  }

  "array" in {
    val array = Array(87, 44, 5, 4, 200, 10, 39, 100)
    val result = array splitAt 3
    result._1 should be(
      Array(87, 44, 5)
    )
    result._2 should be(
      Array(4, 200, 10, 39, 100)
    )

    val array1 = Array(87, 44, 5, 4, 200, 10, 39, 100)
    val result1 = array1 span (_ < 100)
    result1._1 should be(Array(87, 44, 5, 4)
    )
    result1._2 should be(
      Array(200, 10, 39, 100)
    )

    val result2 = array partition (_ < 100)
    result2._1 should be(
      Array(87, 44, 5, 4)
    )
    result2._2 should be(
      Array(200, 10, 39, 100)
    )
  }

  "number" in {
    val a = 2
    val b = 31
    val c = 0x30f
    val e = 0
    val f = -2
    val g = -31
    val h = -0x30f
    a should be(
      2
    )
    b should be(
      31
    )
    c should be(
      783
    ) //Hint: 30F = 783
    e should be(
      0
    )
    f should be(
      -2
    )
    g should be(
      -31
    )
    h should be(
      -783)
  }

  "double_float" in{
    val a = 3.0
    val b = 3.00
    val c = 2.73
    val d = 3f
    val e = 3.22d
    val f = 93e-9
    val g = 93e-9
    val h = 0.0
    val i = 9.23e-9d
    a should be(
      3.0
    )
    b should be(
      3.00
    )
    c should be(
      2.73
    )
    d should be(
      3f
    )
    e should be(
      3.22d
    )
    f should be(
    )
    g should be(
    )
    h should be(
    )
    i should be(
    )
  }
}
