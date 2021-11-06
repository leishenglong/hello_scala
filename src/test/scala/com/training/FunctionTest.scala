package com.training

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class FunctionTest extends AnyWordSpec with Matchers{

  def customFilter(f: Int => Boolean)(xs: List[Int]) =
    xs filter f
  def  onlyEven(x: Int) = x % 2 == 0
  val xs = List(12, 11, 5, 20, 3, 13, 2)
  customFilter(onlyEven)(xs) should be(List(12,20,2))

  val onlyEvenFilter = customFilter(onlyEven) _
  onlyEvenFilter(xs) should be(List(12,20,2))


  "partial function" in{
    val doubleEvens: PartialFunction[Int, Int] =
      new PartialFunction[Int, Int] {
        //States that this partial function will take on the task
        def isDefinedAt(x: Int) = x % 2 == 0

        //What we do if this partial function matches
        def apply(v1: Int) = v1 * 2
      }

    val tripleOdds: PartialFunction[Int, Int] = new PartialFunction[Int, Int] {
      def isDefinedAt(x: Int) = x % 2 != 0

      def apply(v1: Int) = v1 * 3
    }

    val whatToDo = doubleEvens orElse tripleOdds //Here we chain the partial functions together

    whatToDo(3) should be(9)
    whatToDo(4) should be(8)
  }



  def howMuchCanIMake_?(hours: Int)(implicit amount: BigDecimal, currencyName: String) =
    (amount * hours).toString() + " " + currencyName

  implicit val hourlyRate = BigDecimal(34)
  implicit val currencyName = "Dollars"

  howMuchCanIMake_?(30) should be(
    "1020 Dollars"
  )



  " " in {
    def howMuchCanIMake_?(hours: Int, amount: BigDecimal = 34, currencyName: String = "Dollars") =
      (amount * hours).toString() + " " + currencyName

    howMuchCanIMake_?(30) should be(
      "1020 Dollars"
    )

    howMuchCanIMake_?(30, 95) should be(
      "2850 Dollars"
    )
  }

}
