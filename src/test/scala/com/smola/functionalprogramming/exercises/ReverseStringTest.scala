package com.smola.functionalprogramming.exercises
import org.scalatest.funsuite.AnyFunSuite

class ReverseStringTest extends AnyFunSuite {
  val underTest = ReverseString
  test("Can reverse a given string") {
    // Given
    val stringToReverse = "Jeg har en fugl"
    // When
    val actual = underTest.StringReverse(stringToReverse)
    // Then
    val expected = "lguf ne rah geJ"
    assert(actual == expected)
  }
}
