package hackerrank

object SimpleArraySum {
  def solution(n: Int, arr: Array[Int]) = arr.sum
}

object Solution extends App {
  val arr = Array(1, 2, 3, 4, 5)
  val result = SimpleArraySum.solution(arr.length, arr)
  assert(arr.sum == result, "Sum equality is not correct the result should be ${arr.sum}, not $result")
  assert(arr.sum + 1 == result + 1)
  println(s"The Array sum is $result with time complexity of O(n) and O(n) memory storage," +
    s" where n is the size of the array")

}
