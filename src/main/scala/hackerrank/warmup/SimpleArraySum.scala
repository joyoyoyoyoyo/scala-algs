import scala.util._


object SimpleArraySum extends App {

  val n = io.StdIn.readInt()
  val arr = io.StdIn.readLine().split(" ").map(acc => Try(acc.toInt).getOrElse(0))


  val result = Solution.foldSum(n, arr)
  assert(arr.sum == result, s"Sum equality is not correct the result should be ${arr.sum}, not $result")
  assert(arr.sum + 1 == result + 1)
  println(s"Sum: $result with time complexity of O(n) and O(n) memory storage," +
    s" where n is the size of the array")
}

object Solution {
  def simpleArraySum(n: Int, arr: Array[Int]) = arr.sum

  def foldSum(n: Int, arr: Array[Int]) = (0 until n).fold(0)(_ + arr(_))
}
