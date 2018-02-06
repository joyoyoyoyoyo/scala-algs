package leetcode

/**
  * Created by: Angel Ortega
  * Date: 2/4/2018
  */
object Solution005 extends App {
  def longestPalindrome(s: String): String = {
    val mat = Array.fill(s.length, s.length)(false)


    var maxLen = 0
    var maxPalin = ""

    for (i <- s.indices) {
      for (j <- i until s.length) {
        val isPalindrome = s(i) == s(j)
        mat(i)(j) = isPalindrome
        if (isPalindrome) {
          val palindrome = s.slice(i, i + 1)

          if (palindrome.length > maxLen) {
            maxLen = palindrome.length
            maxPalin = palindrome
          }
        }
      }
    }

    for (i <- 0 until s.length - 1) {
      val isPalindrome = s(i) == s(i + 1)
      mat(i)(i + 1) = isPalindrome
      if (isPalindrome) {
        val palindrome = s.slice(i, i + 2)
        if (palindrome.length > maxLen) {
          maxLen = palindrome.length
          maxPalin = palindrome
        }
      }
    }

    var j = 0
    for (k <- 3 to s.length) {
      for (i <- 0 until s.length - k + 1) {
        j = i + k - 1
        val isPalindrome = s(i) == s(j) && mat(i + 1)(j - 1)
        mat(i)(j) = isPalindrome
        if (isPalindrome) {
          val palindrome = s.slice(i, j + 1)
          if (palindrome.length > maxLen) {
            maxLen = palindrome.length
            maxPalin = palindrome
          }
        }
      }
    }

    maxPalin
  }
}

/**
  * Reference at:
  * [1] https://www.geeksforgeeks.org/longest-palindrome-substring-set-1/
  * [2] https://www.youtube.com/watch?v=Fi5INvcmDos
  */