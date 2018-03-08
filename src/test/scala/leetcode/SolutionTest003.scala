package leetcode

import org.scalatest.{FunSuite, Matchers}

/**
  * Created by: Angel Ortega
  * Date: 2/4/2018
  */
class SolutionTest003 extends FunSuite with Matchers {

  test("given a string, the length of the longest substring without repeating characters should be returned") {
    assert(Solution003.lengthOfLongestSubstring("abba") == 2)
    assert(Solution003.lengthOfLongestSubstring("dvdf") == 3)

    assert(Solution003.lengthOfLongestSubstring("nfpdmpi") == 5)
    assert(Solution003.lengthOfLongestSubstring("abcabcbb") == 3)
    assert(Solution003.lengthOfLongestSubstring("bbbbbb") == 1)
    assert(Solution003.lengthOfLongestSubstring("pwwkew") == 3)


  }

}
