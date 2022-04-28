package com.smola.functionalprogramming.exercises
import org.scalatest.funsuite.AnyFunSuite

class RectanglePointCalculatorTest extends AnyFunSuite {
  val underTest = RectanglePointCalculator
  test("Can the return the correct number of points for rectangle with sides of length 6 and 4") {
    // Given
    val a = 6
    val b = 4
    // When
    val actual = underTest.CountPoints(a, b)
    // Then
    val expected = 23
    assert(actual == expected)
  }
}
