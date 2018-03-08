package algorithms

/**
  * Time complexity: Theta((1/2)*N*(N-1)) or O(N**2)
  */
object TwoSum {
  def count(arr: Array[Int]): Int = {
    var count = 0
    for (i <- 0 until arr.length;
         j <- i+1 until arr.length) {
      if (arr(i) + arr(j) == 0)
        count += 1
    }
    count
  }
}

/**
  * Bibliography: Algorithms, Part 1, Coursera, "Analysis of Algorithms - Observations", Video
  */