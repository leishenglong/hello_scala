package com.training.numberoff

object NumberOff {

  val Fizz = "Fizz"
  val Buzz = "Buzz"
  val Whizz: String = "Whizz"

  def numberOff(n: Int): String = {
    val multiple_of_3 = n % 3 == 0
    val multiple_of_5 = n % 5 == 0
    val multiple_of_7 = n % 7 == 0
    var outPut = ""

    if (multiple_of_3) {
      outPut = Fizz
    }

    if (multiple_of_5) {
      outPut = Buzz
    }

    if (multiple_of_7) {
      outPut = Whizz
    }

    if (multiple_of_3 && multiple_of_5) {
      outPut = Fizz + Buzz

    }

    if (multiple_of_3 && multiple_of_7) {
      outPut = Fizz + Whizz

    }

    if (multiple_of_5 && multiple_of_7) {
      outPut = Buzz + Whizz
    }

    if (multiple_of_3 && multiple_of_5 && multiple_of_7) {
      outPut = Fizz + Buzz + Whizz
    }

    outPut
  }


}
