package hackerrank.algorithms.strings

/**
  * Created by: Angel Ortega
  * Date: 2/7/2018
  */
object ReducedString {
  val cut = "[]"

  def delete(s: String): String = {
    val farthestCut = 0
    s.toList match {
      case ch1 :: ch2 :: Nil if ch1 == ch2 => ""
      case ch1 :: ch2 :: tail if ch1 == ch2 => delete(Nil ,tail)
      case ch1 :: ch2 :: tail => delete(ch1 :: Nil, ch2 :: tail)
    }
  }


  @scala.annotation.tailrec
  def delete[Char](head: List[Char], next: List[Char]): String = {
    head :: next match {
      case ch1 :: ch2 :: Nil if ch1 == ch2 => ""
      case ch1 :: ch2 :: tail if ch1 == ch2 => delete(head, tail)
      case ch1 :: ch2 :: tail => delete(head :: ch2 :: Nil, ch2 :: tail)
    }
  }


  def main(args: Array[String]) {
//    val sc = new java.util.Scanner (System.in);
//    val s = sc.next();
    val s = "abba"
    println(delete(s))
  }
}
