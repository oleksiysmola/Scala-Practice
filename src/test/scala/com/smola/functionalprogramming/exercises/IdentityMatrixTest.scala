package com.smola.functionalprogramming.exercises
import com.smola.exceptions.custom.InvalidDimensionsException
import org.scalatest.funsuite.AnyFunSuite

class IdentityMatrixTest extends AnyFunSuite {
  val underTest = IdentityMatrix
  test("Throws exception when vector dimensions do not match") {
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
