package algorithms

import algorithms.sorting.InsertionSort
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by: Angel Ortega
  * Date: 2/16/18
  */
class InsertionSortTest extends FlatSpec with Matchers {

  "An unsorted array" should "sort in O(n^2)" in {
    val unsorted = List(-5, 1, 2, 10, 5, -10, 100, 0, -3)
    assert(InsertionSort.sort(unsorted)== List(-10, -5, -3, 0, 1, 2, 5, 10, 100))
  }

}
