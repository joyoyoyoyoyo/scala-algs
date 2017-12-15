case class WeightedQuickUnionUF(n: Int) {
  val id = Array.tabulate(n)(index => index)
  val sz = Array.fill(n)(0)

  def connected(p: Int, q: Int): Boolean = ???

  def union(p: Int, q: Int): Unit = ???

}
