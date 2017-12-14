package datastructures

class QuickUnionUF(val n: Int) {
  val id: Array[Int] = Array.tabulate(n)(index => index)

  private def root(i: Int): Int = {
    var iter: Int = i
    while (iter != id(iter)) { iter = id(iter) }
    iter
  }

  @scala.annotation.tailrec
  private def rootRecursive(i: Int): Int = if (id(i) == i) i else rootRecursive(id(i))

  /**
    * O(n) since two path traversals are performed, both for p and q (the depth can get very long)
    * @param p
    * @param q
    * @return
    */
  def connected(p: Int, q: Int): Boolean = root(p) == root(q)

  /**
    * O (n) because the disjoint set's root could be very long for both p and q
    * @param p
    * @param q
    */
  def union(p: Int, q: Int): Unit = {
    val i = root(p)
    val j = root(q)
    id(i) = j
  }

}
