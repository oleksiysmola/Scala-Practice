package com.smola.functionalprogramming.exercises

object IdentityMatrix extends App {
  // Write a function which creates an n x n identity matrix, taking n as an argument
  def newIdentityMatrix(n: Int): IndexedSeq[IndexedSeq[Int]] = {
    // Defines the range for the dimensions of the matrix
    val aRange = 0 to n

    // Two four comprehension expressions, setting value to 0 unless row and column number are equal
    val matrix = for {
      rowNumber <- aRange
    } yield for {
      columnNumber <- aRange
    } yield if (rowNumber == columnNumber) 1
    else 0
    matrix
  }
  println(newIdentityMatrix(5))

}
