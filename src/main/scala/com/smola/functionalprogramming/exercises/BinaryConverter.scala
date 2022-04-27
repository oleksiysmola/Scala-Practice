package com.smola.functionalprogramming.exercises

import scala.collection.mutable.Queue

object BinaryConverter {
  // Fields to track the number we want to convert to binary along with the current number we are at
  var currentNumber = 0
  val binaryQueue = new Queue[String]
  var binaryPlaceHolder1 = ""
  var binaryPlaceHolder2 = ""
  binaryQueue.addOne("1")

  def ConvertNumberToBinary(number: Int): String = {
    // Store binary number of current number
    val currentBinary = binaryQueue.front
    this.binaryPlaceHolder1 = currentBinary
    // Remove entry at front of the queue
    this.binaryQueue.dequeue()
    // Add 0 to first placeholder and 1 to the second adding both to the queue
    this.binaryPlaceHolder2 = this.binaryPlaceHolder1
    this.binaryPlaceHolder1 += "0"
    this.binaryQueue.addOne(binaryPlaceHolder1)
    this.binaryPlaceHolder2 += "1"
    this.binaryQueue.addOne(binaryPlaceHolder2)
    this.currentNumber += 1
    if (currentNumber == number) {
      // Resets all fields so method can be called again
      this.currentNumber = 0
      this.binaryPlaceHolder1 = ""
      this.binaryPlaceHolder2 = ""
      this.binaryQueue.clear()
      this.binaryQueue.addOne("1")
      // We return the current binary number
      currentBinary
    }
    // If we have not reached the target number then call method again
    else ConvertNumberToBinary(number)
  }
  def convertToDecimal(binaryNumber: String): String = {
    // If zero return zero
    if (binaryNumber == "0") "0"
    else {
      // Use the length of the binary number to determine the range in which it lies
      val binarySize = binaryNumber.length - 1
      val rangeOfPowers = 0 to binarySize
      val groupsOfNumbers = for {
        power <- rangeOfPowers
      } yield math.pow(2.0, power.toDouble).toInt
      val totalNumbers = groupsOfNumbers.sum
      val rangeOfNumbers = 1 to totalNumbers
      // Find all binary numbers in the allowed range and map to a list
      val binaryNumbers = rangeOfNumbers.map(ConvertNumberToBinary(_))
      // Number will be the index of the given binary number + 1
      1.+(binaryNumbers.indexOf(binaryNumber)).toString
    }
  }

}
