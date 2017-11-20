package hackerrank.algorithms.warmup


object CompareTheTriplets {

  def readTriplet(input: Iterator[String]) = input.next().split(" ").map(_.toInt)

  val input = io.Source.stdin.getLines()
  val p1 = readTriplet(input)
  val p2 = readTriplet(input)
  val initialScore = (0,0)
  val totalScore = p1.zip(p2).foldLeft(initialScore) { (player, acc) =>
    if (player._1 > player._2)
      (1 + 1, 0)
    else if (player._1 < player._2)
      (0, 1 + 1)
    else
      acc
  }
}
