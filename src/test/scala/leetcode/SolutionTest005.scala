package leetcode

import org.scalatest._

/**
  * Created by: Angel Ortega
  * Date: 2/4/2018
  */
class SolutionTest005 extends FunSuite with Matchers {
  test("babad should return bab or aba") {
    assert(
      Solution005.longestPalindrome("babad") == "bab" ||
      Solution005.longestPalindrome("babad") == "aba"
    )
  }

  test("cbbd should return bb") {
    assert(
      Solution005.longestPalindrome("cbbd") == "bb"
    )
  }

}
