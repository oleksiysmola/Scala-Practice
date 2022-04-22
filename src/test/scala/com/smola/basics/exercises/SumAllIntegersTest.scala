package com.smola.basics.exercises
import org.scalatest.funsuite.AnyFunSuite

class SumAllIntegersTest extends AnyFunSuite {
  val underTest = SumAllIntegers
  test("Can the function compute the sum of all the integers from 0 to 5") {
    // Given
    val summationLimit = 5
    // When
    val actual = underTest.sumOfIntegers(summationLimit)
    // Then
    val expected = 15
    assert(actual == expected)
  }
  test("Returns 0 when given 0 as an argument") {
    // Given
    val summationLimit = 0
    // When
    val actual = underTest.sumOfIntegers(summationLimit)
    // Then
    val expected = 0
    assert(actual == expected)
  }
  test("Throws exception when argument is less than 1") {
    // Given
    val summationLimit = -1
    // Then
    assertThrows[IllegalArgumentException] {
      // When
      underTest.sumOfIntegers(summationLimit)
    }
  }
}
