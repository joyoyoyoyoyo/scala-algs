package leetcode

import java.nio.StringCharBuffer

/**
  * Created by: Angel Ortega
  * Date: 2/4/2018
  */
object Solution003 {
  def lengthOfLongestSubstring(s: String): Int = {
    val buffer = new StringBuilder

    val prev = 1
    val maxLength = s.indices.foldLeft(0){ (i, subsequence) => {
        if (buffer.contains(s(i))) {
          val maxSoFar = math.max(buffer.length + 1, prev)
          buffer.clear()
          maxSoFar
        }
        else {
          buffer + s(i)
          prev + 1
        }
      }
    }
    maxLength
  }

//  def x() =

}
