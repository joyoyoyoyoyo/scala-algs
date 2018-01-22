package datastructures

/** 3-SUM problem
  * Given N distinct integers, find how many triples sum to exactly zero
  *
  */

/***
  * 3-SUM: brute force approach
  *
  * This algorithm uses 3 for loops to check every possible answer
  */
object ThreeSum {
  def count(arr: Array[Int]): Int = {
    val size = arr.length
    var count = 0
    for (i <- 0 until size) {
      for (j <- i + 1 until size) {
        // Check each triple
        for (k <- j + 1 until size) {
          // For simplicity, ignore integer overflow
          if (arr(i) + arr(j) + arr(j) == 0)
            count += 1
        }
      }
    }
    count
  }
}

/**
  * Bibliography: Algorithms, Part 1, Coursera, "Analysis of Algorithms - Observations", Video Url:
  * `https://www.coursera.org/learn/algorithms-part1/lecture/jmkCT/observations`
  */