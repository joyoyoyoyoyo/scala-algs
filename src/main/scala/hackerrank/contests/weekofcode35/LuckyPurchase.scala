package hackerrank.contests.weekofcode35

object LuckyPurchase {

  case class Laptop(name: String, price: String)


  def solution(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    val n = sc.nextInt();
    val (laptop,price) = findLuckyPurchase(n)

    def findLuckyPurchase(n: Int) = {
      val Laptop(name, value) = io.Source.stdin.getLines().take(n).map(_.split(" ")).unzip()
      ???
    }
  }
}
