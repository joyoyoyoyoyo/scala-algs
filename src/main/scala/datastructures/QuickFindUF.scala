package datastructures

/** Read in the number of nodes in the forest for the disjoint sets
  * 
  **/
class QuickFindUF(val n: Int) {
  val id: Array[Int] = Array.tabulate(n)(index => index)
  
  /** O(1) algorithm to check if two components are connected
    *   for the Dynamic-Connectivity problem
    **/
  def connected(p: Int, q: Int): Boolean = id(p) == id(q)

  /** O(n) algorithm to merge two connected components
    *
    **/
  def union(p: Int, q: Int): Unit = {
    val pid = id(p)
    val qid = id(q)
    for (i <- id.indices) {
      if (id(i) == pid)
        id(i) = qid
    }
  }

}
