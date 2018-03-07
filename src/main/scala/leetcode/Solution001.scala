package leetcode

/**
  * Created by: Angel Ortega
  * Date: 2/4/2018
  */
object Solution {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    // Time Complexity: O(n*log(n)), where n is the length the array
    // Space Complexity: O(1), no additional data structures are created
    val sortedNums = nums.zipWithIndex.sortWith(_._1 < _._1)

    @scala.annotation.tailrec
    def loop(i: Int, j: Int, nums: Array[(Int, Int)], target: Int): Array[Int] = {
      val sums = nums(i)._1 + nums(j)._1
      sums match {
        case x if (i > j) => Array[Int]()
        case x if (x < target) => loop(i+1, j, nums, target)
        case x if (x > target) => loop(i, j-1, nums, target)
        case x if (x == target) => Array[Int](nums(i)._2, nums(j)._2)
      }
    }

    loop(0, sortedNums.length - 1, sortedNums, target)

  }


}
