package com.smola.functionalprogramming.exercises

object BinaryConverter {
  def convertToDecimal(binaryNumber: String): String = {
    // If zero return zero
    if (binaryNumber == "0") "0"
    else {
      val binarySize = binaryNumber.length - 1
      val rangeOfPowers = 0 to binarySize
      val groupsOfNumbers = for {
        power <- rangeOfPowers
      } yield math.pow(2.0, power.toDouble).toInt
      val totalNumbers = groupsOfNumbers.sum
      val rangeOfNumbers = 1 to totalNumbers
      println(rangeOfNumbers)
    }
    "0"
  }

}
