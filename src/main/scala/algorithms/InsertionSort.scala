package algorithms

import scala.language.higherKinds

/**
  * Created by: Angel Ortega
  * Date: 2/16/18
  */
object InsertionSort {

  @scala.annotation.tailrec
  def isort[A <: Ordered[A]](x: A, unsorted: List[A]): List[A] = {
    unsorted match {
      case head :: Nil => head :: Nil
      case next :: tail if x < next => isort(x, tail)
      case next :: tail if x > next => isort(next, next :: x :: tail)
    }
  }

  @scala.annotation.tailrec
  def sortLoop[A <: Ordered[A]](sorted: List[A], unsorted: List[A]): List[A] = {
    unsorted match {
      case Nil => Nil
      case head :: Nil => head :: Nil
      case head :: tail => sortLoop(isort(head, sorted), tail)
    }
  }

  def sort[A <: Ordered[A]](unsorted: List[A]) = {
    unsorted match {
      case Nil => Nil
      case head :: Nil => head :: Nil
      case head :: tail => sortLoop(isort(head, head :: tail), tail)
    }
  }

}
