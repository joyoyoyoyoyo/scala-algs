package algorithms.sorting

/**
  * Created by: Angel Ortega
  * Date: 3/9/18
  */
object SelectionSort {

  /** Selection Sort: works by recursively finding the next min
    * with the assumption that a[i] >= a[i-1] >= .. >= a[0] on each iteration for i.
    * Thus only a partition of the array, will be checked for all elements j > i
    *
    * Time Complexity: O(n ** 2)
    * Space Complexity: O(1)
    *
    * Sorting algorithm traits: In-place algorithm
    *
    * @param arr
    * @tparam A
    * @return
    */
  def sort[A : Ordering](arr: Array[A]) = {
    @scala.annotation.tailrec
    def traverse(arr: Array[A], i: Int, j: Int): Array[A] = {
      if (i - 1 >= j)
        arr
      else {
        val left = i
        val right = findMinIndex(arr, i + 1, j, i)
        exch(arr, left, right)
        traverse(arr, i + 1, j)
      }
    }

    @scala.annotation.tailrec
    def findMinIndex[A : Ordering](arr: Array[A], i: Int, j: Int, minIndex: Int): Int = {
      if (i > j)
        minIndex
      else
        arr(i) match {
          case min if implicitly[Ordering[A]].lt(arr(i), arr(minIndex)) => findMinIndex(arr, i + 1, j, i)
          case _ => findMinIndex(arr, i + 1, j, minIndex)
        }

    }

    def exch(arr: Array[A], left: Int, right: Int): Unit = {
      val swap = arr(left)
      arr(left) = arr(right)
      arr(right) = swap
    }

    traverse(arr, 0, arr.length - 1)
  }



}
