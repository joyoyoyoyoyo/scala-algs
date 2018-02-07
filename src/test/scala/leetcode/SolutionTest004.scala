package leetcode

import org.scalatest._

/**
  * Created by: Angel Ortega
  * Date: 2/4/2018
  */
class SolutionTest004 extends FunSuite with Matchers {
  test{"Median of Two Sorted Arrays"} {
    val num1 = Array(1, 3)
    val num2 = Array(2)
    assert(2.0 == Solution004.findMedianSortedArrays(num1, num2))
    assert(2.5 == Solution004.findMedianSortedArrays(Array(1, 2), Array(3, 4)))
  }
}
