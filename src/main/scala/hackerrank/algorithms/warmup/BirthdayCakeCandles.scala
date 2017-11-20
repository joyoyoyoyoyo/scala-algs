package hackerrank.algorithms.warmup

object BirthdayCakeCandles {

  case class BlownCandle(frequency: Int, tallest: Int)

  def birthdayCakeCandles(n: Int, arr: Array[Int]): Int =  {
    val blownOut = arr.foldLeft(BlownCandle(0,0))((candle, currentCandleHeight) => {
      if(currentCandleHeight > candle.tallest)
        BlownCandle(1, currentCandleHeight)
      else if (currentCandleHeight == candle.tallest){
        BlownCandle(candle.frequency + 1, candle.tallest)
      } else {
        BlownCandle(candle.frequency, candle.tallest)
      }
    })
    blownOut.frequency
  }

}
