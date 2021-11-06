package com.training.scala_01

object ForExpression {
  def flatMapMap(chars: List[Char], numbers: List[Int]): List[String] = {
    chars.flatMap(c => numbers.map(c + "" + _))
  }

  /*
  for(seq;filter) yield expr
   */
  def forExp(chars: List[Char], numbers: List[Int]): List[String] =
    for (char <- chars; number <- numbers ) yield char + "" + number


  def forExpWithFilter(chars: List[Char], numbers: List[Int]): List[String] =
    for (char <- chars; number <- numbers ;if number%2==0) yield char + "" + number


  def forExpS(chars: List[Char], numbers: List[Int]): List[String] = for {
    char <- chars
    number <- numbers
  } yield char + "" + number




}
