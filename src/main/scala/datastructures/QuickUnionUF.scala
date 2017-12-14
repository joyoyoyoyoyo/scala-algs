package datastructures

class QuickUnionUF(val n: Int) {
  val id: Array[Int] = Array.tabulate(n)(index => index)

  def connected(p: Int, q: Int): Boolean = ???

  def union(p: Int, q: Int): Unit = ???

}
