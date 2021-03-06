package com.smola.basics

import java.time.{LocalDate, LocalTime}

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

  println("A string: " + aString)
  println("A composed string: " + aComposedString)
  println("An interpolated string: " + anInterpolatedString)

  // Expressions: structures that can be reduced to a value
  val anExpression = 2 + 3

  // Within Scala if statements are expressions and return a value
  // If expression
  val ifExpression = if (speedOfLight > 50) 20 else 10
  println("If expression: " + ifExpression)

  // Chained expression
  val chainedExpression =
    if (speedOfLight > 1e10) 5
    else if (speedOfLight < 20) 6
    else if (speedOfLight > 100) 10
    else 7
  println("Chained if expression: " + chainedExpression)

  // Code block
  val codeBlock = {
    val aLocalValue = 3

    // Last expression of code block is returned
    aLocalValue + 2
  }

  println("Code block: " + codeBlock)

  // Define a function with a single line or a code block
  def myFunction(x: Int, y: String): String = {
    x + " " + y
  }
  println("My function: " + myFunction(1, "5"))

  // Define a factorial function
  def factorial(n: Int): Int =
    if (n <= 1) 1
    // Recursive, function can be called within itself!
    else n * factorial(n - 1)

  println("Factorial function: " + factorial(3))


  // Unit type equivalent to void
  println("Print statement returns the Unit type: " + "Hva betyr de om det?")

  // Local Date
  val dateNow = LocalDate.now()
  println(dateNow)
  val christmasDay = LocalDate.of(2022, 12, 25)
  println(christmasDay)

  // Local Time
  val timeNow = LocalTime.now()
  println(timeNow)
  val lunchTime = LocalTime.of(12, 0, 0)
  println(lunchTime)
}

