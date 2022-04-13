package com.smola.basics

object Basics extends App{

  // Defining a value
  val speedOfLight: Int = 299792458 // Cannot reassign variable (is a constant)

  // Don't need to always specify type! Compiler be smort
  val aBoolean = false

  // A string
  val aString = "Jeg elsker fugler"
  // Composed string
  val aComposedString = "Jeg" + " har " + "tusen " + "ender"
  // Interpolated string
  val anInterpolatedString = s"The speed of light is $speedOfLight m/s"

  println(aString)
  println(aComposedString)
  println(anInterpolatedString)

  // Expressions: structures that can be reduced to a value
  val anExpression = 2 + 3

  // Within Scala if statements are expressions and return a value
  // If expression
  val ifExpression = if (speedOfLight > 50) 20 else 10
  println(ifExpression)

  // Chained expression
  val chainedExpression =
    if (speedOfLight > 1e10) 5
    else if (speedOfLight < 20) 6
    else if (speedOfLight > 100) 10
    else 7
  println(chainedExpression)

  // Code block
  val codeBlock = {
    val aLocalValue = 3

    // Last expression of code block is returned
    aLocalValue + 2
  }

  println(codeBlock)

  // Define a function with a single line or a code block
  def myFunction(x: Int, y: String): String = {
    x + " " + y
  }
  println(myFunction(1, "5"))

  // Define a factorial function
  def factorial(n: Int): Int =
    if (n <= 1) 1
    // Recursive, function can be called within itself!
    else n * factorial(n - 1)

  println(factorial(3))
}

