package hackerrank.warmup

object MiniMaxSum {

  val arr = Array(6, 5, 4, 5)

  def minMaxSum(arr: Array[Int]) = {
    require(arr.nonEmpty, "Empty Array Passed")
    val (total, min, max) = (arr).foldLeft((0, Integer.MAX_VALUE, Integer.MIN_VALUE)) { (acc, element) => {
      val (total, min, max) = acc
      (total, min, max) match {
        case (x, y, z) if element > max => (total + element, min, element)
        case (x, y, z) if element < min => (total + element, element, max)
        case (x, y, z) => (total + element, min, max)
      }}
    }
    (total - max, total - min)
  }

  val (minSum, maxSum) = minMaxSum(arr)
  println(s"min=$minSum, max=$maxSum")

}
