package hackerrank.datastructures

abstract class UF(val forest: Array[Int]) {
  forest.indices.map(idx => forest(idx) = idx)
  abstract def union(p: Int, q: Int): Unit
  abstract def connected(p: Int, q: Int): Boolean
  abstract def find(p: Int): Int
  abstract def count: Int

}
