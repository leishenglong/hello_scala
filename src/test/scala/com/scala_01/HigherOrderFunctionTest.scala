package com.scala_01

import com.training.scala_01.HighOrderFunction
import com.training.scala_01.HighOrderFunction.fibonacciSequence
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import scala.collection.mutable.Map

class HigherOrderFunctionTest extends AnyWordSpec with Matchers {


  "higer order function" should{
    "given 1 and function then return 4" in{
      val time=(x:Int)=>x+1
      HighOrderFunction.callNTime(time,3,1) shouldEqual 4

    }




  }


  //0 1 1 2 3 5 8 13=>f(n) = f(n-1)+f(n-2)
  //f1=0,f2=1
  /**
   * 1:0 ,
   * 2:0 1,
   * 3:0 1 1
   * 4:0 1 1 2
   * 5:0 1 1 2 3
   */

  "Fibonacci sequence" should{
    "given 1 then return 0"in{
        fibonacciSequence(1,Map.empty) shouldEqual "0"
    }
    "given 2 then return 0 1"in{
        fibonacciSequence(2,Map.empty) shouldEqual "0 1"
    }

    "given 3 then return 0 1 1"in{
      val map=Map(1->0,2->1)
      fibonacciSequence(3,map) shouldEqual "0 1 1"
    }

    "given 6 then return 0 1 1"in{
      val map=Map(1->0,2->1)
      fibonacciSequence(6,map) shouldEqual "0 1 1 2 3 5"
    }
  }


}
