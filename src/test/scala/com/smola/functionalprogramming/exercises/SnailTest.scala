package com.smola.functionalprogramming.exercises
import org.scalatest.funsuite.AnyFunSuite

class SnailTest extends AnyFunSuite {
  val underTest = Snail
  test("Returns correct path for 3 x 3 grid") {
    // Given
    val testGrid = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
    // When
    val actual = underTest.snail(testGrid)
    // Then
    val expected = List(1, 2, 3, 6, 9, 8, 7, 4, 5)
    assert(actual == expected)
  }

}
