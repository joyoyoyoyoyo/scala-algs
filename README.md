# 📚 scala-algs 💻
Algorithms, data structures, and coding problems from Coursera, Textbooks, and HackerRank—all using Scala.

Descriptions of the algorithms and data structures are written in comments or `*.MD` files as summaries.


### Flame War 🔥
All data structures and algorithms in this repository are written both functionally and
imperatively for pedagogical reasons. Imperative, mutable code is not encouraged in the Scala community. However,
mutable data structures and imperative algorithms are used for two reasons: (1) to reduce time spent on translating
imperative code to functional code and (2) to focus on algorithm-analysis. Most de-facto data structures and algorithm
analysis resources write implementations using mutable data structures and imperative algorithms.

### D.I.Y. ☭
Although there are few resources providing a functional approach to algorithms and data structures, this repository is
made to encourage others to D.I.Y. implement their own functional algorithms and data structures. Taking the necessary
steps to document alternative implementations can help others learn alternative functional algorithm implementations
and immutable data structure implementations.


## Data Structures
- src
  - main
    - scala
      - datastructures
        - unionfind
          - [x] Union-Find
            - [src.main.scala.datastructures.unionfind.UF.scala](https://github.com/joyoyoyoyoyo/scala-algs/blob/master/src/main/scala/datastructures/unionfind/UF.scala)
          - [x] Quick-Find Union-Find
            - [src.main.scala.datastructures.unionfind.QuickFindUF.scala](https://github.com/joyoyoyoyoyo/scala-algs/blob/master/src/main/scala/datastructures/unionfind/QuickFindUF.scala)
          - [x] Quick-Union Union-Find
            - [src.main.scala.datastructures.unionfind.QuickUnionUF.scala](https://github.com/joyoyoyoyoyo/scala-algs/blob/master/src/main/scala/datastructures/unionfind/QuickUnionUF.scala)
          - [x] Quick-Union Union-Find with Path Compression
            - [src.main.scala.datastructures.unionfind.QuickUnionPCUF.scala](https://github.com/joyoyoyoyoyo/scala-algs/blob/master/src/main/scala/datastructures/unionfind/QuickUnionPCUF.scala)
          - [x] Weighted Quick-Union Union-Find
            - [src.main.scala.datastructures.unionfind.WeightedQuickUnionUF.scala](https://github.com/joyoyoyoyoyo/scala-algs/blob/master/src/main/scala/datastructures/unionfind/WeightedQuickUnionUF.scala)
          - [x] Weighted Quick-Union Union-Find with Path Compression
            - [src.main.scala.datastructures.unionfind.WeightedQuickUnionPCUF.scala](https://github.com/joyoyoyoyoyo/scala-algs/blob/master/src/main/scala/datastructures/unionfind/WeightedQuickUnionPCUF.scala)
      - algorithms
        - sorting
          - [x] Bubble Sort
            - [src.main.scala.algorithms.sorting.BubbleSort.scala](https://github.com/joyoyoyoyoyo/scala-algs/blob/master/src/main/scala/algorithms/sorting/BubbleSort.scala)
          - [ ] Insertion Sort
            - [src.main.scala.algorithms.sorting.InsertionSort.scala](https://github.com/joyoyoyoyoyo/scala-algs/blob/master/src/main/scala/algorithms/sorting/InsertionSort.scala)
          - [ ] Selection Sort
          - [ ] Merge Sort
          - [ ] Quick Sort
          - [ ] Radix Sort

