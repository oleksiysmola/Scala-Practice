package com.smola.functionalprogramming

object FunctionalProgramming extends App {
  /*
  Scala runs on JVM
  Functional programming:
  - compose functions
  - pass functions
  - return functions as results

  Conclusions: FunctionX
  */

  val simpleIncrementer = new Function1[Int, Int] {
    override def apply(arg: Int): Int = arg + 1
  }
  // Have essentially defined as a function
  println("Apply to 23: " + simpleIncrementer(23))
  // All Scala functions are instances of these FunctionX type

  // Function with two arguments and the String return type
  val stringConcatenator = new Function2[String, String, String] {
    override def apply(arg1: String, arg2: String): String = arg1 + " " + arg2
  }
  println("String concatenator gives: " + stringConcatenator("Jeg er", "osten"))

  // More concisely (Int => Int not needed technically since compiler can usually infer the types needed)
  val doubler: Int => Int = (x: Int) => 2 * x

  println("Doubler function: " + doubler(4))
}
