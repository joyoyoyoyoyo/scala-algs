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

  def sort[A : Ordering](unsorted: List[A]): List[A] = {
    import scala.math.Ordering.Implicits._

    val sortedLL = unsorted.indices.foldLeft(List.empty[A])( (acc, i) =>{
      val indexOfMin: Int = (i until unsorted.length).reduceLeft(
        (x, y) =>
          if (unsorted(x) < unsorted(y)) x else y
      )
      val swap = unsorted(i)
      val firstSwapLL = unsorted.updated(i, unsorted(indexOfMin))
      firstSwapLL.updated(indexOfMin, swap)

    })
    sortedLL
  }



}
