package algorithms.sorting

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by: Angel Ortega
  * Date: 3/9/18
  */
class SelectionSortTest extends FlatSpec with Matchers {
  "[1, 5, 3, 4, 0, 8]" should "be sorted to [0, 1, 3, 4, 5, 8]" in {
    assert(Array(0, 1, 3, 4, 5, 8) sameElements SelectionSort.sort(Array(1, 5, 3, 4, 0, 8)))
    assert(Array(0, 1, 3, 4, 5, 8).deep == SelectionSort.sort(Array(1, 5, 3, 4, 0, 8)).deep)

  }

  "[1, 5, 3, 4, 0, 8, -12]" should "be sorted to [-12, 0, 1, 3, 4, 5, 8] and work on odd ranges" in {
    assert(Array(-12, 0, 1, 3, 4, 5, 8) sameElements SelectionSort.sort(Array(1, -12, 5, 3, 4, 0, 8)))
    assert(Array(-12, 0, 1, 3, 4, 5, 8).deep == SelectionSort.sort(Array(1, -12, 5, 3, 4, 0, 8)).deep)

  }

  "[3, 1]" should "be sorted to [1, 3] and swap once" in {
    assert(Array(1, 3) sameElements SelectionSort.sort(Array(3, 1)))
    assert(Array(1, 3).deep == SelectionSort.sort(Array(3, 1)).deep)

  }

  "[1]" should "be sorted to [1] and not change" in {
    assert(Array(1) sameElements SelectionSort.sort(Array(1)))
    assert(Array(1).deep == SelectionSort.sort(Array(1)).deep)

  }

  "[1, 3]" should "be sorted to [1, 3] and not change" in {
    assert(Array(1, 3) sameElements SelectionSort.sort(Array(1, 3)))
    assert(Array(1, 3).deep == SelectionSort.sort(Array(1, 3)).deep)


  }

  "[]" should "be sorted to [] and not change" in {
    assert(Array() sameElements SelectionSort.sort[Int](Array()))
    assert(Array().deep == SelectionSort.sort[Int](Array()).deep)

  }
}
