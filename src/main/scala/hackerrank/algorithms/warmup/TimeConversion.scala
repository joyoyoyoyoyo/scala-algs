package hackerrank.algorithms.warmup

case class MilitaryTime()

object TimeConversion {

  val militaryTimeRegex = ???
  val twelveHourClockRegex = ???

  def timeConversion[String](twelveHourClock: String): String =  {

    val militaryTime = twelveHourClock match {
      case miltaryTimeRegex => ???
      case twelveHourClockRegex => ???
    }
    militaryTime
  }

  def main(args: Array[String]) = {
    val military0 = "07:05:45PM".map(timeConversion)
  }

}
