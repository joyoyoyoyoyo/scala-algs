# 📚 scala-algs 💻
Algorithms and Data Structures written in Scala, along with LeetCode problems.

### Pedagogy 🔥
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
        - binarysearchtree
          - immutable
            - solution00
              - ✅ [Binary Search Tree](https://github.com/joyoyoyoyoyo/scala-algs/blob/master/src/main/scala/datastructures/binarysearchtree/immutable/solution00/Tree.scala)
            - solution01
              - ✅ [Binary Search Tree](https://github.com/joyoyoyoyoyo/scala-algs/blob/master/src/main/scala/datastructures/binarysearchtree/immutable/solution01/Tree.scala)
        - unionfind
          - ✅ [Union-Find](https://github.com/joyoyoyoyoyo/scala-algs/blob/master/src/main/scala/datastructures/unionfind/UF.scala)
          - ✅ [Quick-Find Union-Find](https://github.com/joyoyoyoyoyo/scala-algs/blob/master/src/main/scala/datastructures/unionfind/QuickFindUF.scala)
          - ✅ [Quick-Union Union-Find](https://github.com/joyoyoyoyoyo/scala-algs/blob/master/src/main/scala/datastructures/unionfind/QuickUnionUF.scala)
          - ✅ [Quick-Union Union-Find with Path Compression](https://github.com/joyoyoyoyoyo/scala-algs/blob/master/src/main/scala/datastructures/unionfind/QuickUnionPCUF.scala)
          - ✅ [Weighted Quick-Union Union-Find](https://github.com/joyoyoyoyoyo/scala-algs/blob/master/src/main/scala/datastructures/unionfind/WeightedQuickUnionUF.scala)
          - ✅ [Weighted Quick-Union Union-Find with Path Compression](https://github.com/joyoyoyoyoyo/scala-algs/blob/master/src/main/scala/datastructures/unionfind/WeightedQuickUnionPCUF.scala)
        - priorityqueue
          - ✅ [Max Binary Heap](https://github.com/joyoyoyoyoyo/scala-algs/blob/master/src/main/scala/datastructures/priorityqueue/MaxBinaryHeap.scala)
          - ✅ [Abstract Max PQ](https://github.com/joyoyoyoyoyo/scala-algs/blob/master/src/main/scala/datastructures/priorityqueue/MaxPQ.scala)
        - singlylinkedlist
          - mutable
            - ✅ [Singly Linked List](https://github.com/joyoyoyoyoyo/scala-algs/blob/master/src/main/scala/datastructures/singlylinkedlist/mutable/SinglyLinkedList.scala)   
        - undirectedgraph
          - solution00
            - ✅ [Adjacency List Undirected Graph](https://github.com/joyoyoyoyoyo/scala-algs/blob/master/src/main/scala/datastructures/undirectedgraph/solution00/UndirectedGraph.scala)
      - algorithms
        - sorting
          - ✅ [Bubble Sort](https://github.com/joyoyoyoyoyo/scala-algs/blob/master/src/main/scala/algorithms/sorting/BubbleSort.scala)
          - ✅ [Insertion Sort](https://github.com/joyoyoyoyoyo/scala-algs/blob/master/src/main/scala/algorithms/sorting/InsertionSort.scala)
          - ✅ [Selection Sort](https://github.com/joyoyoyoyoyo/scala-algs/blob/master/src/main/scala/algorithms/sorting/SelectionSort.scala)
          - 💭 Merge Sort
          - 💭 Quick Sort
          - 💭 Radix Sort
        - search
          - ✅ [Binary Search on a Sorted Array](https://github.com/joyoyoyoyoyo/scala-algs/blob/master/src/main/scala/algorithms/search/BinarySearch.scala)

