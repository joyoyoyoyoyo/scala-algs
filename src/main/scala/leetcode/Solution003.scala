package leetcode

// Given a string, find the length of the longest substring without repeating characters.
// Examples:
//
// Given "abcabcbb", the answer is "abc", which the length is 3.
//
// Given "bbbbb", the answer is "b", with the length of 1.
//
// Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
/**
  * Created by: Angel Ortega
  * Date: 2/4/2018
  */
object Solution003 {
  def lengthOfLongestSubstring(s: String): Int = {

    @scala.annotation.tailrec
    def loopForMaxSubstring(s: String, map: Map[Char, Int], i: Int, j: Int, acc: Int): Int = {
      if (j < s.length) {
        map.get(s.charAt(j)) match {
          case Some(prevIdx) => {
            val idx = math.max(prevIdx, i)
            loopForMaxSubstring(s, map + (s.charAt(j) -> (j + 1)), idx, j + 1, math.max(j - idx + 1, acc))
          }
          case None => {
            // move window of [i, j]
            loopForMaxSubstring(s, map + (s.charAt(j) -> (j + 1)), i, j + 1, math.max(acc, j - i + 1))
          }
        }
      }
      else
        acc
    }

    loopForMaxSubstring(s, Map.empty[Char, Int], 0, 0, 0)
  }

}
