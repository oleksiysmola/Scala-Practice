package com.smola.functionalprogramming.exercises

object ScalarProduct extends App {
  // Write a Scala function that takes two Vectors as an argument and returns the dot product

  def dotProduct(x1: Vector[Double], x2: Vector[Double]): Double = {
    // Create range for based on lengths of the two arrays
    val dimensions = 0 to x1.length - 1

    // For comprehension to multiple together the components
    val product = for {
      index <- dimensions
    } yield x1(index)*x2(index)
    product.sum
  }
  val x1 = Vector(2.0, 4.0, -5.0)
  val x2 = Vector(-1.0, 6.0, 8.0)
  println(dotProduct(x1, x2))
}
