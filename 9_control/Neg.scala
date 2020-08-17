/**
 * Run with
 * $ scalac Neg.scala
 * $ scala Neg
 */

object Neg {
  def containsNeg(nums: List[Int]): Boolean = nums.exists(_ < 0)

  def main(args: Array[String]): Unit = {
    val a = List(1, 2, 4)
    val b = List(1, 2, -4, 6)
    println(containsNeg(a))
    println(containsNeg(b))
  }
}
