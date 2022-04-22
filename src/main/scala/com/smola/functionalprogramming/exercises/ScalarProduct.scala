package com.smola.functionalprogramming.exercises

import com.smola.exceptions.custom.LengthMismatchException

object ScalarProduct extends App {
  // Write a Scala function that takes two Vectors as an argument and returns the dot product

  def dotProduct(x1: Vector[Double], x2: Vector[Double]): Double = {
    // Throws exception if lengths of vectors do not match
    if (x1.length != x2.length) throw new LengthMismatchException("Argument dimensions do not match")
    // If dimensions match compute the dot product
    else {
      // Create range for based on lengths of the two arrays
      val dimensions = 0 to x1.length - 1

      // For comprehension to multiple together the components
      val product = for {
        index <- dimensions
      } yield x1(index) * x2(index)
      product.sum
    }
  }
}
