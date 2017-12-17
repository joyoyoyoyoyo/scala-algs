case class WeightedQuickUnionUF(n: Int) {
  val id = Array.tabulate(n)(index => index)
  val sz = Array.fill(n)(0)

  private def root(i: Int): Int = ???

  def connected(p: Int, q: Int): Boolean = root(p) == root(q)

  def union(p: Int, q: Int): Unit = ???

}
