package datastructures.singlylinkedlist

class SinglyLinkedList {

  var root: Option[Node] = None

  def add(v: Int): Unit = {
    if (root.isEmpty)
      root = Some(new Node(v))
    else {
      var iterator = root
      while (iterator.getOrElse(None) != None) {
        iterator = iterator.
      }
    }
  }

}

