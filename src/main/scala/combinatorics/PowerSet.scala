package combinatorics


object PowerSet {
  def powerSet[Numerical](seq: Seq[Numerical]) = (0 to seq.length).flatMap(seq.combinations(_))
}
