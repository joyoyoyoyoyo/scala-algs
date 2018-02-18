package algorithms.sorting

/**
  * Created by: Angel Ortega
  * Date: 2/17/18
  */
object BubbleSort {

  def sort[T](arr: Array[T], cmp: (T, T) => Boolean): Array[T] = {

    for (i <- arr.indices) {
      for (window <- (0 until arr.length).sliding(2, 1)) {
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
}