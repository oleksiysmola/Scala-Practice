package com.smola.functionalprogramming.exercises
import com.smola.exceptions.custom.LengthMismatchException
import org.scalatest.funsuite.AnyFunSuite

class ScalarProductTest extends AnyFunSuite {
  val underTest = ScalarProduct
  test("Can the compute the scalar product of (2, -1) and (1, 4)") {
    // Given
    val vector1 = Vector(2.0, -1.0)
    val vector2 = Vector(1.0, 4.0)
    // When
    val actual = underTest.dotProduct(vector1, vector2)
    // Then
    val expected = -2
    assert(actual == expected)
  }
  test("Throws exception when vector dimensions do not match") {
    // Given
    val vector1 = Vector(2.0, -1.0)
    val vector2 = Vector(1.0, 4.0, 5.0)
    // When
    val caught = intercept[LengthMismatchException] {
      underTest.dotProduct(vector1, vector2)
    }
    // Then
    assert(caught.getMessage == "Argument dimensions do not match")
  }
}
