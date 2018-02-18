package algorithms.sorting

/**
  * Created by: Angel Ortega
  * Date: 2/17/18
  */
object BubbleSort {

  def sort[T](arr: Array[T], cmp: (T, T) => Boolean) = {
    val windows = arr.sliding(2, 1)
    val sorting = arr.scanLeft(List.empty[T])((acc, elem) => {
      
      acc
    })
    windows.foreach( window => {
      exchangeWhile(cmp(window(0), window(1))) {
        val swap = window(1)
        window(1) = window(0)
        window(0) = swap
      }
    })
  }

  def exchangeWhile[T](cond: => Boolean)(block: Unit): Unit = {
    if (cond) {
      block
      exchangeWhile(cond)(block)
    }
  }

}
