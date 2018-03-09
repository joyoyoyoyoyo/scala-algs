package datastructures.priorityqueue

import scala.reflect.ClassTag


/**
  * Created by: Angel Ortega
  * Date: 2/18/18
  */
abstract class MaxPQ[K : Ordering](protected val pq: Array[K]) {

  /**
    * Insert a key into the Priority Queue
    */
  def insert(v: K): Unit

  /**
    * Return and remove the largest key
    */
  def delMax(): K

  /**
    * Is the priority queue empty?
    */
  def isEmpty: Boolean

  /**
    * Return the largest key
    */
  def max: K

  /**
    * Number of entries in the priority queue
    */
  def size: Int
}
