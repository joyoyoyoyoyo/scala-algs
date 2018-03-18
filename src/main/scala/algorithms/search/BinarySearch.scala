package algorithms.search


/** Binary Search in a Sorted Array:
  *
  * Time Complexity: O(log(n))
  * Space Complexity: O(1)
  *
  * Assumptions: Applies to a sorted array data structure
  */
object BinarySearch {

  def indexOf(arr: Array[Int], target: Int): Int = {

    @scala.annotation.tailrec
    def indexOf(arr: Array[Int], lo: Int, hi: Int, target: Int): Int = {
      if (lo > hi)
        -1
      else {
        val middle = lo + (hi - lo)/ 2
        arr(middle) match {
          case mid if target == mid => middle
          case mid if mid < target => indexOf(arr, middle + 1, hi, target)
          case mid if mid > target => indexOf(arr, lo, middle - 1, target)
        }
      }
    }

    indexOf(arr, 0, arr.length - 1, target)

  }
}
