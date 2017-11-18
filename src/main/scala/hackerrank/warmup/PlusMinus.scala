package hackerrank.warmup

import scala.annotation.tailrec
import scala.collection.SeqLike

object PlusMinus {

  val n = io.StdIn.readInt()
  val arr = io.Source.stdin.getLines().next().split(" ").map(_.toInt)

  val (pos, rest) = arr.partition(_ > 0)
    val (neg, zero) = rest.partition(_ < 0)

  val posFrac = pos.length.toDouble / arr.length
  val negFrac = neg.length.toDouble / arr.length
  val zeroFrac = zero.length.toDouble / arr.length

  println("%1.6f\n%1.6f\n%1.6f".format(posFrac, negFrac, zeroFrac))
}
