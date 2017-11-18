package hackerrank.warmup


object DiagonalDifference {

  val source = io.Source.stdin.getLines()
  val n = source.next().toInt

  var diagonalTotals = (0, 0)
  for(index <- 0 until n){
    val row = source.next().split(" ").map(_.toInt)
    val i = row(index)
    val j = row(row.length - index - 1)
    diagonalTotals = (diagonalTotals._1 + i, diagonalTotals._2 + j)
  }

  val absoluteDifference = math.abs(diagonalTotals._1 - diagonalTotals._2)
  println(absoluteDifference)


}
