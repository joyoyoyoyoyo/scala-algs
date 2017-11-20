package hackerrank.algorithms.warmup

object Staircase {
  val n = io.StdIn.readInt()
  val staircase = (1 to n).foldLeft("")((line, num) => line + " " * (n - num) + "#" * num + "\n" )

  println(staircase)

}
