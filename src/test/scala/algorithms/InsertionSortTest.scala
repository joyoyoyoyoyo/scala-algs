//package algorithms
//
//import algorithms.sorting.InsertionSort
//import org.scalatest.{FlatSpec, Matchers}
//
///**
//  * Created by: Angel Ortega
//  * Date: 2/16/18
//  */
//class InsertionSortTest extends FlatSpec with Matchers {
//
//  private val expectedSortings = Map(
//    List(-5, 1, 2, 10, 5, -10, 100, 0, -3) -> List(-10, -5, -3, 0, 1, 2, 5, 10, 100)
//  )
//
//  "An unsorted array" should "sort in O(n^2)" in {
//    val unsorted = List(-5, 1, 2, 10, 5, -10, 100, 0, -3)
//    val sortedActual = InsertionSort.sort(unsorted)
//    assert(expectedSortings(unsorted) == sortedActual)
//  }
//
//}
