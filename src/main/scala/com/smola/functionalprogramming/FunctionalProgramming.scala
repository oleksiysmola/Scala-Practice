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

  // Vectors: fast Seq implementation
  val aVector = Vector(2, 0, 1)
  println("A vector: " + aVector)

  // Sets = no duplicates
  val aSet = Set(1, 2, 3, 4, 1, 2, 3) // Set(1,2,3,4)
  println("Set: " + aSet)
  // The main purpose of sets is to determine whether a particular element is contained within
  val setHas5 = aSet.contains(5)
  println("Does the set contain 5: " + setHas5)
  // Adding to sets
  val anAddedSet = aSet + 5 // Doesn't necessarily add to the end of the set!
  println("New set is: " + anAddedSet)
  // Removing from sets
  val aRemovedSet = aSet - 3
  println("Reduced set is: " + aRemovedSet)

  // Ranges like a fictitious list of numbers ie doesn't contain every value in that range
  val aRange = 1 to 1000
  println("Range of values: " + aRange)
  // To get in increments of 2
  val twoByTwo = aRange.map(x => 2 * x).toList
  println("A list of values separated by 2: " + twoByTwo)

  // Tuples
  val aTuple = ("Fugl", "Katt", "Hund", "Elg", 3)
  println("A tuple: " + aTuple)

  // Maps
  val aPhonebook: Map[String, Int] = Map(
    ("Saul", 30329955),
    "Mr White" -> 293921 // Equivalent to ("Mr White", 293921)
  )
  println("A map: " + aPhonebook)
}
