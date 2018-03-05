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
    lengthOfLongestSubstringLoop(s.toList, Map.empty[Char,Int], 0, 0, 0)
  }

  def lengthOfLongestSubstringLoop(s: List[Char], map: Map[Char, Int], j: Int, i: Int, max: Int): Int = {
    s match {
      case Nil => max
      case head :: tail => {
        val newIndex = map.getOrElse(head, i)
        lengthOfLongestSubstringLoop(tail, map + (head -> (j + 1)), j + 1, newIndex, math.max(j - newIndex + 1, max))
      }
    }
  }


}
