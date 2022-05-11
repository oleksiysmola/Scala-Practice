package com.smola.functionalprogramming.exercises
import org.scalatest.funsuite.AnyFunSuite
import com.smola.functionalprogramming.exercises.ArrayDifference


class ArrayDifferenceTest extends AnyFunSuite {
  val underTest = ArrayDifference
  test("Can return false if sequence not included") {
    // Given
    val largeSequence = Seq(1, 3, 4, 5, 5, 7)
    val smallSequence = Seq(4, 5, 7)
    // When
    val actual = underTest.ArrayDifference(largeSequence, smallSequence)
    // Then
    val expected = Seq(1, 3)
    assert(actual == expected)
  }

}
