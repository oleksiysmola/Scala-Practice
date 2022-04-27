package com.smola.functionalprogramming.exercises
import org.scalatest.funsuite.AnyFunSuite

class BinaryConverterTest extends AnyFunSuite {
  val underTest = BinaryConverter
  test("Can convert a binary number to a decimal number") {
    // Given
    val binaryNumber = "1010"
    // When
    val actual = underTest.convertToDecimal(binaryNumber)
    // Then
    val expected = "10"
    assert(actual == expected)
  }
  test("Can convert number to binary") {
    // Given
    val numberToConvert = 5
    // When
    val actual = underTest.ConvertNumberToBinary(numberToConvert)
    // Then
    val expected = "101"
    assert(actual == expected)
  }
}
