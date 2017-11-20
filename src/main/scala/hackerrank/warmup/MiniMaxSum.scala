package hackerrank.warmup

object MiniMaxSum extends App{

  val arr = Array(6, 5, 4, 5)
  def minMaxSum(arr: Array[Int]) = {
    require(arr.nonEmpty, "Empty Array Passed")
    val result = (arr).foldLeft((0, Integer.MAX_VALUE, Integer.MIN_VALUE)) { (acc, element) => {
      val (total, min, max) = acc
      (total, min, max) match {
        case (x, y, z) if element > max => (total + element, min, element)
        case (x, y, z) if element < min => (total + element, element, max)
        case (x, y, z) => (total + element, min, max)
      }}
    }

    (result._2, result._3)
  }

  val (min,max) = minMaxSum(arr)
  println(s"min=$min, max=$max")

}
