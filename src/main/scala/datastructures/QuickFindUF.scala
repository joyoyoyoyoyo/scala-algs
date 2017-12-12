/** Read in the number of nodes in the forest for the disjoint sets
  * 
  **/
class QuickFindUF(val n: Int) {
  val id = Array.tabulate(n)(index => index)
  
  def connected(p: Int, q: Int) = id(p) == id(q)

  def union(p: Int, q: Int) = ???

}
