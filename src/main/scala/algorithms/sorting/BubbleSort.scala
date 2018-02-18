package algorithms.sorting

/** Bubble Sort has a worst-case time-complexity of Big-O(n ** 2)
  *
  * Created by: Angel Ortega
  * Date: 2/17/18
  */
object BubbleSort {

  def sort[A](arr: Array[A], cmp: (A, A) => Boolean): Array[A] = {

    for (i <- 1 until arr.length) {
      for (window <- (0 to arr.length - i).sliding(2, 1)) {
        val x = arr(window(0))
        if (cmp(arr(window(1)), arr(window(0)))) {
          val swap = arr(window(1))
          arr(window(1)) = arr(window(0))
          arr(window(0)) = swap
        }
      }
    }
    arr
  }

  def sort[A](arr: Array[A])(implicit ord: Ordering[A]): Array[A] = {
    sort(arr, ord.lt)
  }
}