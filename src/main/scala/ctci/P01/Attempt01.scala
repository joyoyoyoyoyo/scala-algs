//package ctci.P01
//
//package object Attempt01 {
//
//  object ArraysAndStrings {
//      sealed trait NotUnique {
//        def value: Int
//      }
//
//      case class Maybe(c: Char) extends NotUnique {
//        def value = c.toInt
//      }
//
//      case class Empty() extends NotUnique
//
//      def isUniqueChars(str: String): Boolean = {
//        str match {
//          case Maybe(c) =>
//          case c: Char =>
//        }
//      }
//  }
//}
