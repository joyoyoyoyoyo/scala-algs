package leetcode

/**
  * Created by: Angel Ortega
  * Date: 2/4/2018
  */
object Solution005 extends App {
  def longestPalindrome(s: String): String = {
    val mat = Array.fill(s.length, s.length)(false)



    for (i <- s.indices) {
      for (j <- i until s.length) {
        val isPalindrome = s(i) == s(j)
        mat(i)(j) = isPalindrome
      }
    }

    for (i <- 0 until s.length) {
      for (j <- i + 1 until s.length - 1) {
        mat(i)(j) = s(i) == s(j) && s(i + 1) == s(j)
      }
    }

    var k = 0
    var maxLen = 0
    var maxPalin = ""

    for (i <- 2 until s.length) {
      for (j <- 0 until s.length - 2) {
        k = j + i
        val isPalindrome = ???
        mat(i)(k) = isPalindrome
        if (isPalindrome) {
          val seq = s.slice(i, k)
          if (seq.length > maxLen) {
            maxLen = seq.length
            maxPalin = seq
          }
        }
      }
    }

    println(mat.mkString(" "))
    maxPalin
  }
}
