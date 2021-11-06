package com.training.scala_01


import java.time.LocalDate

object ClassTest {

  def main(args: Array[String]): Unit = {
    val user = new User(LocalDate.now(),"tyz")
    user.gender = "male"

    user.birthday
    user.school

    val user1= new User()
    val user2= new User()
    println(user2 ==user1)
    println(user2 eq user1)
  }

  class User(var birthday:LocalDate =LocalDate.now(),val school:String){
    def this()={
      this(LocalDate.now(),"tt")
    }
    var name :String =_
    val contry = "china"
    var gender :String= _  //占位符必须指定类型b

    private var idNumber:String = _

    override def toString: String = super.toString

  }

}
