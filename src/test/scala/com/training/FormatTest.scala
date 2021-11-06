package com.training

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class FormatTest extends AnyWordSpec with Matchers {

  "specialTest" in {
    val c = 'a' //unicode for a
    val e = '\"'
    val f = '\\'

    "%c".format(c) should be("a")
    "%c".format(e) should be("\"")
    "%c".format(f) should be("\\")
  }

  "list" in{
    val secondElement = List(1, 2, 3) match {
      case x :: xs => xs.head//x means head,xs means the rest
      case _ => 0
    }

    secondElement should be(2)
  }
}
