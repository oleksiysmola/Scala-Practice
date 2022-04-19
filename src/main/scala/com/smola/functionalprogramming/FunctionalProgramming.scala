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

  // Higher-order functions
  val aMappedList: List[Int] = List(1, 2, 3).map(x => x + 1) // HOF
  println("New list: " + aMappedList)
  val aFlatMappedList: List[Int] = List(1, 2, 3).flatMap(x => List(x, x * 2))
  println("Flat mapped list: " + aFlatMappedList)
  val aFilteredList: List[Int] = List(1, 2, 3, 4, 5).filter(_ <= 3) // Equivalent to x => x <= 3
  println("A filtered list: " + aFilteredList)
  // All pairs between 1,2,3 and letters 'a', 'b', 'c'
  val allPairs = List(1, 2, 3).flatMap(number => List('a', 'b', 'c').map(letter => s"$number-$letter"))
  println("All pairs: " + allPairs)

  // For comprehensions
  val alternativePairs = for {
    number <- List(1, 3, 3)
    letter <- List('a', 'b', 'c')
  } yield s"$number-$letter"
  println("Alternative pairs: " + allPairs)

  // Lists
  val aList = List(1, 2, 3, 4, 5)
  // Head returns first element
  println("Head of list: " + aList.head)
  // Tail returns the rest of the list
  println("Tail of the list: " + aList.tail)
  // Can prepend a list
  val aPrependedList = 0 :: aList
  println("Prepended list: " + aPrependedList)
  // Extended list
  val anExtendedList = 0 +: aList :+ 6
  println("Extended list: " + anExtendedList)

  // Sequences
  val aSequence: Seq[Int] = Seq(1,2,3)
  println("Sequence: " + aSequence)
  val accessedElement = aSequence(1) // Element at index 1 ie 2 in this case
  print("Index 1 of sequence: " + accessedElement)
}
