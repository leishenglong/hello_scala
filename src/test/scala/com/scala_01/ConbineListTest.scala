package com.scala_01

import com.training.scala_01.{AnonymousFunction, ForExpression}
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class ConbineListTest extends AnyWordSpec with Matchers {


  /**
   * List(1,2)
   * List(a,b)
   * output:
   * List(a1,b1,a2,b2)
   */
  "for test" should{
    "given tow list return combined list" in{
      val numbers=List(1,2)
      val chars=List('a','b')
      ForExpression.flatMapMap(chars,numbers) shouldEqual List("a1","a2","b1","b2")
      AnonymousFunction.combine(chars,numbers) shouldEqual List("a1","a2","b1","b2")
      AnonymousFunction.combineAnou(chars,numbers) shouldEqual List("a1","a2","b1","b2")


    }


    "given tow list return combined list only even number" in{
      val numbers=List(1,2)
      val chars=List('a','b')
      ForExpression.forExpWithFilter(chars,numbers) shouldEqual List("a2","b2")
    }



  }

}
