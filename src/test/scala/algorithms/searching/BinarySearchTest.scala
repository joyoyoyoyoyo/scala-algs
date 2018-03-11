package algorithms.searching

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by: Angel Ortega
  * Date: 3/11/2018
  */
class BinarySearchTest extends FlatSpec with Matchers {
  assert( BinarySearch.indexOf((0 to 10000).toArray, 750) == 750)

  assert( BinarySearch.indexOf(Array(-14, 32, 443, 5400, 5555, 6000, 7000, 8888, 9999, 10000, 11111, 18000, 20000), -14) == 0)

  val actual = BinarySearch.indexOf(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 5)
  val expected = 4

  assert(actual == expected)

  assert( BinarySearch.indexOf(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 10) == 9)
  assert( BinarySearch.indexOf(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 3) == 2)
  assert( BinarySearch.indexOf(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 5) == 4)
  assert( BinarySearch.indexOf(Array(-14, 32, 443, 5400, 5555, 6000, 7000, 8888, 9999, 10000, 11111, 18000, 20000), 18000) == 11)



}
