object ArraysAndStrings {


  def isUniqueChars(str: String): Boolean = {
    val charSet = Array.fill(128)(false)

    @scala.annotation.tailrec
    def loop(str: Seq[Char], truthy: Boolean): Boolean = {
      str match {
        case Nil => true
        case Seq(c) if charSet(c.toInt) => false
        case Seq(c) => loop(str.tail, !charSet(c.toInt))
      }
    }

    val arr = str.toCharArray.toSeq
    loop(arr, false)
  }
  val uniqueness = isUniqueChars("abc")
  println(s"uniqueness=${uniqueness}")
}