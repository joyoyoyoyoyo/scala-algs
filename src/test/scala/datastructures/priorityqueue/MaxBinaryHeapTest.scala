package datastructures.priorityqueue

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by: Angel Ortega
  * Date: 3/8/18
  */
class MaxBinaryHeapTest extends FlatSpec with Matchers {

  "Inserting into a heap" should "add a new element and obey the heap structure property" in {

    val heap = new MaxBinaryHeap(6)
    assert(heap.size == 0)
    assert(heap.toString == "MaxBinaryHeap=[0, 0, 0, 0, 0, 0]")

    heap.insert(1)
    assert(heap.size == 1)
    assert(heap.toString == "MaxBinaryHeap=[1, 0, 0, 0, 0, 0]")
    //  1
    // / \

    heap.insert(2)
    assert(heap.size == 2)
    assert(heap.toString == "MaxBinaryHeap=[2, 1, 0, 0, 0, 0]")
    //    2
    //   / \
    //  1
    // / \

    heap.insert(3)
    assert(heap.size == 3)
    assert(heap.toString == "MaxBinaryHeap=[3, 1, 2, 0, 0, 0]")
    //    3
    //   / \
    //  1   2
    // / \ / \

    heap.insert(4)
    assert(heap.size == 4)
    assert(heap.toString == "MaxBinaryHeap=[4, 3, 2, 1, 0, 0]")
    //     4
    //    / \
    //   3   2
    //  / \ / \
    // 1

    heap.insert(5)
    assert(heap.size == 5)
    assert(heap.toString == "MaxBinaryHeap=[5, 4, 2, 1, 3, 0]")
    //     5
    //    / \
    //   4   2
    //  / \ / \
    // 1  3

    heap.insert(6)
    assert(heap.size == 6)
    assert(heap.toString == "MaxBinaryHeap=[6, 4, 5, 1, 3, 2]")
    //     6
    //    / \
    //   4   5
    //  / \ / \
    // 1  3 2

  }

}
