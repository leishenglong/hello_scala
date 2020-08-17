/**
 * Run with
 * $ scalac Neg.scala
 * $ scala Neg
 */

object Neg {
  def containsNeg(nums: List[Int]): Boolean = nums.exists(_ < 0)
  def containsOdd(nums: List[Int]): Boolean = nums.exists(_ % 2 == 1)

  def main(args: Array[String]): Unit = {
    val a = List(1, 2, 4)
    val b = List(1, 2, -4, 6)
    println(containsNeg(a))
    println(containsNeg(b))

    val numsWithoutOdd = List(2,4,8)
    val numsWithOdd = List(2,1,8)
    println(containsOdd(numsWithoutOdd))
    println(containsOdd(numsWithOdd))

  }
}
