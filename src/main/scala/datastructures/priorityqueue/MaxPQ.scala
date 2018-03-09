package datastructures.priorityqueue

import scala.reflect.ClassTag


/**
  * Created by: Angel Ortega
  * Date: 2/18/18
  */
abstract class MaxPQ[T](protected val pq: Array[T]) {
  /**
    * Create a priority queue with given keys
    */

  /**
    * Insert a key into the Priority Queue
    * Time Complexity: O(log(n))
    */
  def insert(v: T)

  /**
    * Return and remove the largest key
    */
  def delMax(): T

  /**
    * Is the priority queue empty?
    */
  def isEmpty: Boolean

  /**
    * Return the largest key
    */
  def max: T

  /**
    * Number of entries in the priority queue
    */
  def size: Int
}
