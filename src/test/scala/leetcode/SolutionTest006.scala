package leetcode

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by: Angel Ortega
  * Date: 3/10/18
  */
class SolutionTest006 extends FlatSpec with Matchers {

  val actual1 = Solution006.convert("PAYPALISHIRING" , 3)
  val zigzagged1 = "PAHNAPLSIIGYIR"

  assert(zigzagged1 == actual1)

  val actual2 = Solution006.convert("ABCD" , 2)
  val zigzagged2 = "ACBD"
  assert(zigzagged2 == actual2)

}
