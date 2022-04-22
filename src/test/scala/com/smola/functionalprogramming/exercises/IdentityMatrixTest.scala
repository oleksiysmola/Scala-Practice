package com.smola.functionalprogramming.exercises
import com.smola.exceptions.custom.InvalidDimensionsException
import org.scalatest.funsuite.AnyFunSuite

class IdentityMatrixTest extends AnyFunSuite {
  val underTest = IdentityMatrix
  test("Can generate a 2 by 2 identity matrix") {
    // Given
    val testDimensions = 2
    // When
    val actual = underTest.newIdentityMatrix(testDimensions)
    // Then
    val expected = Vector(Vector(1, 0), Vector(0, 1))
    assert(actual == expected)
  }
  test("Throws exception when invalid dimension argument is given") {
    // Given
    val testDimensions = -1
    // When
    val caught = intercept[InvalidDimensionsException] {
      underTest.newIdentityMatrix(testDimensions)
    }
    // Then
    assert(caught.getMessage == "Dimensions cannot be less than or equal to 0")
  }
}
