package algorithms.sorting

import scala.language.higherKinds

/**
  * Created by: Angel Ortega
  * Date: 2/16/18
  */
object InsertionSort {

//  def search[A : Ordering](acc: List[A], element: A): List[A] = {
//    import scala.math.Ordering.Implicits._
//    acc.indices.reduceLeft( (i, j) => acc(i) < acc(j))
//  }

  def sort[A : Ordering](xs: List[A]): List[A] = {
    def insert[A: Ordering](x: A,  xs: List[A]): List[A] = {
      if (xs.isEmpty || implicitly[Ordering[A]].lt(x, xs.head)) x :: xs
      else xs.head :: insert(x, xs.tail)
    }
    if (xs.isEmpty) Nil
    else insert(xs.head, sort(xs.tail))
  }



}
