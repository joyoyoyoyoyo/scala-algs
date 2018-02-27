package datastructures.priorityqueue
/**
  * Created by: Angel Ortega
  * Date: 2/18/18
  */
abstract class MaxPQ[+K <: Ordered[K]] {

  /**
    * Create a priority queue with given keys
    */
  abstract def this(a: Array[K]) 

  /**
    * Insert a key into the Priority Queue
    */
  abstract def insert(v: K)

  /**
    * Return and remove the largest key
    */
  abstract def delMax(): K

  /** 
    * Is the priority queue empty?
    */
  abstract def isEmpty: Boolean

  /**
    * Return the largest key
    */
  private abstract def max: K

  /**
    * Number of entries in the priority queue
    */
  private abstract def size: Int
}
