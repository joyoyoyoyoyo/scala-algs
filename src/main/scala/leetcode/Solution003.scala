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
    def lengthOfLongestSubstringLoop(xs: String, map: Map[Char, Int], i: Int, j: Int, max: Int): Int = {
      if (j >= xs.length ) max
      else {
          map.get(xs(j)) match {
            case Some(index) => {
              lengthOfLongestSubstringLoop(xs, map - (xs(j)), index, index + 1, math.max(j - index, max))
            }
            case None => lengthOfLongestSubstringLoop(xs, map + (xs(j) -> j), i, j + 1, math.max(j - i + 1, max))
          }
        }
    }
    lengthOfLongestSubstringLoop(s, Map.empty[Char,Int], 0, 0, 0)
  }


}
