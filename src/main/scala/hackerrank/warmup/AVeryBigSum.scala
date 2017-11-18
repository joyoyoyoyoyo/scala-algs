package hackerrank.warmup

object AVeryBigSum {

  val aVeryBigSum = io.Source.stdin.getLines()
      .drop(1).next()
      .split(" ")
      .map(_.toLong)
      .sum

  println(aVeryBigSum)
}
