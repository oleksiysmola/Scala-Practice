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
}
