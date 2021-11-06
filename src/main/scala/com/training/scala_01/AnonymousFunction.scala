package com.training.scala_01

object AnonymousFunction {


  val combineAnou=new Function2[List[Char],List[Int],List[String]]{
    override def apply(v1: List[Char], v2: List[Int]): List[String] = for{
      char<-v1
      num<-v2
    }yield char+""+num
  }


  val combine:(List[Char],List[Int])=>List[String]=(chars: List[Char], numbers: List[Int])=>
    for {
      char <- chars
      number <- numbers
    } yield char + "" + number



}
