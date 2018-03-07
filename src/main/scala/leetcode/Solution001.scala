package leetcode

/**
  * Created by: Angel Ortega
  * Date: 2/4/2018
  */
object Solution001 {

  def twoSumInPlace(nums: Array[Int], target: Int): Array[Int] = {
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

  // Time Complexity: O(n)
  // We traverse the list containing n elements only once. Each look up in the table costs only O(1) time.
  //
  // Space complexity: O(n)
  // The extra space required depends on the number of items stored in the hash table, which stores at most n elements.
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
      @scala.annotation.tailrec
      def twoSumLoop(nums: Array[Int], index: Int, target: Int, map: Map[Int, Int]): Array[Int] = {
        if (nums.isEmpty)
          Array(0, 0)
        else {
          map.get(nums.head) match {
            case Some(firstIndex) => Array(firstIndex, index)
            case None => twoSumLoop(nums.tail, index + 1, target, map + ((target - nums.head) -> index))
          }
        }
      }

    twoSumLoop(nums, 0, target, Map.empty[Int, Int])

  }

}
