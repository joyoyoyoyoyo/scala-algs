package hackerrank.algorithms.warmup

case class MilitaryTime()

object TimeConversion {

  /** Constraints
    * Given a 12-hour AM/PM format time, convert it to military (24-hour) time
    *
    * A 12 hour am/pm format time does not contain 0:00, such as a 24-hour time clock
    *  1:00 am is 01:00:00
    * 12:00 am is 00:00:00
    * 12:00 pm is 12:00:00
    * 01:00 pm is 13:00:00pm
    */

  /**
    * Approach 1: Use Regular Expressions to match on AM/PM
    *
    * case x: AM => x == 1 => remove AM
    * case x: AM if x == 12 => revert to 00:00:00 => remove AM
    * case x: PM if x == 12 => do no change  => remove PM
    * case x: PM if x > 12 => add x to 12 => remove PM
    */
  def timeConversion1(s: String): String = {
    ???
  }


  /**
    * Approach 2: If conditionals on front two characters and last two characters (constant time since we use absolutes,
    * meaning that we know the character array's indices before the lookup)
    *
    */
  def timeConversion2(s: String): String = {
    ???
  }

  /**
    * Approach 1 is a clean code solution
    * Approach 2 is an optimal solution in terms of algorithmic complexity, but follows a procedural approach
    *
    */
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
