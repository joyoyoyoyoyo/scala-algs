
/** In theory, WQU + Path Compression is not quite linear
  * In practice, WQU + Path Compression is linear
  * @param n
  */
case class WeightedQuickUnionPCUF(n: Int) {
  /** Initialize
    * O(N)
    */
  val id: Array[Int] = Array.tabulate(n)(index => index)
  val sz: Array[Int] = Array.fill(n)(0)

  /** Finding the root with path compression
    * will keep the tree almost completely flat
    */
  private def root(i: Int): Int = {
    var iter = i
    while (iter != id(i)) {
      // Path compression adds constant time
      id(iter) = id(id(iter))
      iter = id(iter)
    }
    iter
  }

  /** O(log(N)) **/
  def connected(p: Int, q: Int): Boolean = root(p) == root(q)

  /** O(log(N) **/
  def union(p: Int, q: Int): Unit = {
    val i = root(p)
    val j = root(q)
    if (i == j)
      return
    if (sz(i) < sz(j)) {
      id(i) = j
      sz(j) = sz(j) + sz(i)
    } else {
      id(j) = i
      sz(i) = sz(i) + sz(j)
    }
  }

}
