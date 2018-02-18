package leetcode

import java.nio.StringCharBuffer

/**
  * Created by: Angel Ortega
  * Date: 2/4/2018
  */
object Solution003 {
  def lengthOfLongestSubstring(s: String): Int = {
    val dictionary = Array.fill(128)((-1,0))
    slideOnString(s, 0, 0, dictionary, 0)


  }

  @scala.annotation.tailrec
  def slideOnString(s: String, start: Int, next: Int, dictionary: Array[(Int,Int)], max: Int): Int = {
    if (next == s.length) {
      dictionary.foldLeft(next - start)((maxSoFar, tuple) => {
        math.max(tuple._2, maxSoFar)
      })
    }
    // base case: Check if exists
    else if (dictionary(s(next))._1 == -1) {
      dictionary(s(next)) = (next, max + 1)
      slideOnString(s, start, next + 1, dictionary, max + 1)
    }
    else {
      val offset = dictionary(s(start))._1 + 1
      val index = if (s(next) == s(offset)) next else offset
      dictionary(s(next)) = (next, max )
      slideOnString(s, index , next + 1, dictionary, next - offset)
    }
  }
}
