package leetcode

import java.nio.StringCharBuffer

/**
  * Created by: Angel Ortega
  * Date: 2/4/2018
  */
object Solution003 {
  def lengthOfLongestSubstring(s: String): Int = {
    var i = 0
    val dictionary = Array.fill(128)(-1)
    slideOnString(s, 0, 0, dictionary, 0)


  }

  def slideOnString(s: String, start: Int, next: Int, dictionary: Array[Int], max: Int): Int = {
    if (next == s.length)
      max
    // base case: Check if exists
    else if (dictionary(s(next)) == -1) {
      dictionary(s(next)) = next
      slideOnString(s, start, next + 1, dictionary, max + 1)
    }
    else {
      val offset = dictionary(s(next))
      dictionary(s(next)) = next
      math.max(slideOnString(s, next, next + 1, dictionary, next - (start + 1)), max)
    }
  }
}
