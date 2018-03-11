package leetcode

/**
  * Created by: Angel Ortega
  * Date: 2/5/18
  */
object Solution006 {

  def convert(s: String, numRows: Int): String = {
    val c = s.toCharArray
    val len = c.length
    val sb = Array.fill(numRows)(new StringBuilder())

    var i = 0
    while (i < len) {

      for (idx <- 0 until numRows if i < len) {
        sb(idx).append(c(i))
        i+=1
      }
      for (idx <- numRows-2 to 1 by -1 if i < len) {
        sb(idx).append(c(i))
        i+=1
      }

    }

    for (idx <- 1 until sb.length ) yield {
      sb(0).append(sb(idx))

    }
    val result = sb(0).toString
    result
  }


}
