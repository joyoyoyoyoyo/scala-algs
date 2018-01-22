package datastructures

/** 1-SUM Problem: How many single numbers equal exactly zero?
  *
  * Time complexity: O(N)
  * Space complexity: O(1)
  */
class OneSum {
  def count(arr: Array[Int]): Int = {
    var count = 0
    for (element <- arr)
      if (element == 0)
        count+=1
    count
  }
}
