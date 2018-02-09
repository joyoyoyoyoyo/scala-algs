package leetcode

/**
  * Created by: Angel Ortega
  * Date: 2/5/18
  */
object Solution006 {

  def convert(s: String, numRows: Int): String =
    s.split('\n').flatMap(line => line.filter(_ != ' ')).mkString("")


}
