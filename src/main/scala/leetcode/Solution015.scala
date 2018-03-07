object Solution015 {
  def threeSum(nums: Array[Int]): List[List[Int]] = {

    val iterations = for (i <- nums.indices; j <- i until nums.length) yield (i, j)

    val memo = iterations.foldLeft(Map.empty[Int, (Int, Int)])((cache, y) => {
      val (i, j) = y
      if (nums(i) == nums(j))
        cache
      else
        cache + ((nums(i) + nums(j)) -> (i, j))
    })

    val result = (0 until nums.length).foldLeft((List.empty[List[Int]], memo))((acc, k) => {
      val (possibilities, map) = acc
      map.get(-nums(k)) match {
        case Some(indexes) if (indexes._1 != k && indexes._2 != k ) =>
          (List(nums(indexes._1), nums(indexes._2), nums(k)) :: possibilities, map - (nums(indexes._1) + nums(indexes._2)))
        case _ => (possibilities, map)
      }
    })
    result._1
  }
}