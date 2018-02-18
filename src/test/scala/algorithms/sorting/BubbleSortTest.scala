package algorithms.sorting

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by: Angel Ortega
  * Date: 2/17/18
  */
class BubbleSortTest extends FlatSpec with Matchers {
  "[1, 5, 3, 4, 0, 8]" should "be sorted to [0, 1, 3, 4, 5, 8]" in {
    assert(Array(0, 1, 3, 4, 5, 8) sameElements BubbleSort.sort[Int](Array(1, 5, 3, 4, 0, 8)))
  }

  "[1, 5, 3, 4, 0, 8, -12]" should "be sorted to [-12, 0, 1, 3, 4, 5, 8] and work on odd ranges" in {
    assert(Array(-12, 0, 1, 3, 4, 5, 8) sameElements BubbleSort.sort[Int](Array(1, -12, 5, 3, 4, 0, 8)))
  }

  "[3, 1]" should "be sorted to [1, 3] and swap once" in {
    assert(Array(1, 3) sameElements BubbleSort.sort[Int](Array(3, 1)))
  }

  "[1]" should "be sorted to [1] and not change" in {
    assert(Array(1) sameElements BubbleSort.sort(Array(1)))
  }

  "[1, 3]" should "be sorted to [1, 3] and not change" in {
    assert(Array(1, 3) sameElements BubbleSort.sort(Array(1, 3)))
  }

  "[]" should "be sorted to [] and not change" in {
    assert(Array() sameElements BubbleSort.sort(Array.empty[Int]))
  }
}
