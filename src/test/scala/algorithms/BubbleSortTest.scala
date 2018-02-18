package algorithms

import org.scalatest.{FlatSpec, Matchers}
import algorithms.sorting.BubbleSort

/**
  * Created by: Angel Ortega
  * Date: 2/17/18
  */
class BubbleSortTest extends FlatSpec with Matchers {
  "[1, 5, 3, 4, 0, 8]" should "be sorted to [0, 1, 3, 4, 5, 8]" in {
    assert(Array(0, 1, 3, 4, 5, 8) == BubbleSort.sort[Int](Array(1, 5, 3, 4, 0, 8), _ < _))
  }
}
