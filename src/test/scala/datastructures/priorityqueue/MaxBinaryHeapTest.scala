package datastructures.priorityqueue

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by: Angel Ortega
  * Date: 3/8/18
  */
class MaxBinaryHeapTest extends FlatSpec with Matchers {

  "Inserting into an empty heap" should "contain the element" in {

    val heap = new MaxBinaryHeap[Int](100)
    heap.insert(1)
    println(heap)
    fail("Complete")

  }

}
