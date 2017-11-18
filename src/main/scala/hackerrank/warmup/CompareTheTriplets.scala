package hackerrank.warmup

object CompareTheTriplets {

  def compare(a: Int, b: Int): (Int, Int) = if (a > b ) (1, 0) else if (a == b) (0, 0) else (0, 0)

}

object Solution extends App {
  val sc = new java.util.Scanner (System.in);
  var a0 = sc.nextInt()
  var a1 = sc.nextInt()
  var a2 = sc.nextInt()
  var b0 = sc.nextInt()
  var b1 = sc.nextInt()
  var b2 = sc.nextInt()

  val results =  CompareTheTriplets.compare(a0, b0)  CompareTheTriplets.compare(a1, b1) + CompareTheTriplets.compare(a2, b2)
}