object Neg {
  def containsNeg(nums: List[Int]): Boolean = {
    var exists = false
    for (num <- nums if num < 0)
      exists = true

    exists
  }

  def main(args: Array[String]): Unit = {
    val a = List(1,2,4)
    val b = List(1,2,-4,6)
    println(containsNeg(a))
    println(containsNeg(b))
  }
}
