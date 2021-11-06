package com.training.scala_01

object CaseClassTest extends App {



  //  def main(args: Array[String]): Unit = {
  val user = User(1, "tom", 10)
  val user1 = User(2, "peter", 10)
  val user2 = User(2, "peter", 10)

  println(user2 == user1)

  println(user2 eq user1)
  //    user.age = 10
  user.gender = "male"
  user.copy()


  case class User(val id: Long, name: String, age: Int) {
    var gender: String = _

    override def toString: String = super.toString
  }



}
