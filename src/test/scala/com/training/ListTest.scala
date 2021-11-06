package com.training

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

import java.util.concurrent.{ArrayBlockingQueue, Executors, ThreadPoolExecutor, TimeUnit}

class ListTest extends AnyWordSpec with Matchers {

  val aa: List[String] = Nil
  val b: List[Int] = Nil

  (aa == Nil) should be(
    true
  )
  (aa eq Nil) should be(
    true
  )

  (b == Nil) should be(
    true
  )
  (b eq Nil) should be(
    true
  )

  (aa == b) should be(
    true
  )
  (aa eq b) should be(
    true
  )

  val bb = List(1, 2, 3)

  bb.headOption should equal(Some(1))
  bb.tail shouldEqual (List(2, 3))
  val d = List(1, 3, 5, 7, 9)
  val cc = d.filter { i => {
    i % 3 == 0
  }
  }

  cc should equal(List(3, 9))

  val ints = List(1, 3, 5, 7)
  // NOTE: foldLeft uses a form called currying that we will explore later
  ints.foldLeft(0)(_ + _) should equal(
    16
  )
  ints.foldLeft(10)(_ + _) should equal(
    26
  )
  ints.foldLeft(1)(_ * _) should equal(
    105
  )
  ints.foldLeft(0)(_ * _) should equal(
    0
  )
  val head = List(1, 3)
  val tail = List(5, 7)

  head ::: tail should be(
    List(1, 3, 5, 7)
  )
  head ::: Nil should be(
    List(1, 3))

  "list nilltest" in {
    val d = Nil
    val c = 3 :: d
    val b = 2 :: c
    val a = 1 :: b

    a should be(List(1, 2, 3))
    a.tail should be(List(2, 3))
    b.tail should be(List(3))
    c.tail should be(List())

  }

  "list iterable test" in{
    val list = List(3, 5, 9, 11, 15, 19, 21, 24, 32)
//    val it = list sliding 3
    val it = list sliding (3,3)
    it.next() should be(List(3, 5, 9))
    it.next() should be(List(11, 15, 19))
    it.next() should be(List(21, 24, 32))

    list.takeRight(3) should be(List(21,24,32))

    val xs1 = Set(3, 2, 1, 4, 5, 6, 7)
    val ys1 = Set(7, 2, 1, 4, 5, 6, 3)
    xs1.iterator.sameElements(ys1.iterator) should be(true)
  }

  "sameElements test with colletions" in {
    val xs = List("Manny", "Moe", "Jack")
    val ys = List("Manny", "Moe", "Jack")

    val s=xs.find(x=>x.contains("s"))
    println(s)
    xs.sameElements(ys) should be(
      true
    )

    val xt = List("Manny", "Moe", "Jack")
    val yt = List("Manny", "Jack", "Moe")
    xt.sameElements(yt) should be(
      false
    )

    val xs1 = Set(3, 2, 1, 4, 5, 6, 7)
    val ys1 = Set(7, 2, 1, 4, 5, 6, 3)
    xs1.sameElements(ys1) should be(true)

    val xt1 = Set(1, 2, 3)
    val yt1 = Set(3, 2, 1)
    xt1.sameElements(yt1) should be(false)
  }

  "thread test" in{
    val thread =new Thread(() => {
      for( i <- 0 to 10){
        print(i)
      }
    })
    thread.start()
  }

}
