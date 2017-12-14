package datastructures

abstract case class UF(val forest: Array[Int]) {
  forest.indices.map(idx => forest(idx) = idx)
  def union(p: Int, q: Int): Unit
  def connected(p: Int, q: Int): Boolean
  def find(p: Int): Int
  def count: Int

}
