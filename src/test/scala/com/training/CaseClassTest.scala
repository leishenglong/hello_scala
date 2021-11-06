package com.training

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

import scala.collection.immutable.Stream.cons

class CaseClassTest extends AnyWordSpec with Matchers{

  case class Dog(name: String, breed: String)
  val d1 = Dog("Scooby", "Doberman")
  d1.toString should be("Dog(Scooby,Doberman)")

  "generic" in{
    classOf[String].getCanonicalName should be("java.lang.String")
    classOf[String].getSimpleName should be("java.lang.String")
  }


  "fold" in{
    val list = List(5, 4, 3, 2, 1)
    val result = list.foldLeft(0) { (`running total`, `next element`) =>
      `running total` - `next element`
    }
    result should be(-15
    )

    val result2 = list.foldLeft(0)(_ - _) //Short hand
    result2 should be(-15
    )

    (((((0 - 5) - 4) - 3) - 2) - 1) should be(-15
    )
  }

  "reduce" in{
    val stringList = List("Do", "Re", "Me", "Fa", "So", "La", "Te", "Do")
    stringList.reduceRight {
      _ + _
    } should be(
      "DoReMeFaSoLaTeDo")

    val intList = List(5, 4, 3, 2, 1)
    intList.reduceRight(
      (x, y) => x - y) should be(
      3
    )
    intList.reverse.reduceLeft((x, y) => y - x) should be(
      3
    )
    intList.reverse.reduce((x, y) => y - x) should be(
      3
    )
  }

  "makeString" in{
    val stringBuilder = new StringBuilder()
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
    stringBuilder.append("I want all numbers 6-12: ")
    list.filter(it => it > 5 && it < 13).addString(stringBuilder, ",")
    stringBuilder.mkString should be(
      "I want all numbers 6-12: 6,7,8,9,10,11,12"
    )

    "lazyList" in{
//      def makeLazyList(v: Int): LazyList[Int] = cons(v, makeLazyList(v + 1))
//      val a = makeLazyList(2)
//      (a take 3 toList) should be(
//        3
//      )
    }}
    class Employee(
                    val firstName: String,
                    val middleName: Option[String],
                    val lastName: String)

    object Employee {
      //factory methods, extractors, apply
      //Extractor: Create tokens that represent your object
      def unapply(x: Employee) =
        Some((x.lastName, x.middleName, x.firstName))
    }

    val singri = new Employee("Singri", None, "Keerthi")

    val Employee(d, b, c) = singri

    "unapply" in{
    d should be(
      Some("Singri")
    )
    b should be(
      None
    )
    c should be(
      Some("Keerthi")
    )}
//
//  def calc(x: () => Int): Either[Throwable, Int] = {
//    try Right(x()) // An explicit call of the x function
//    catch {
//      case b: Throwable => Left(b)
//    }
//  }
//
//  val y = calc { () => // explicitly declaring that Unit is a parameter with ()
//    14 + 15
//  }
//
//  y should be(
//  )

  object PigLatinizer {
    def apply(x: => String) = x.tail + x.head + "ay"
  }

  val result = PigLatinizer {
    val x = "pret"
    val z = "zel"
    val aa = x++z
    println("tail:"+aa.tail)
    println("head:"+aa.head)
//    println(x ++ z)
//    x ++ z //concatenate the strings

    aa
  }

  result should be ("retzelpay")




}
