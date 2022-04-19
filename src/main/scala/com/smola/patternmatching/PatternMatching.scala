package com.smola.patternmatching

object PatternMatching extends App {

  // Switch expression
  val anInteger = 55
  val order = anInteger match {
    case 1 => "first"
    case 2 => "second"
    case 3 => "third"
    case _ => anInteger + "th"
  }
  println(order)

  // Class decomposition
  case class Person(name: String, Age: Int)
  val joseph = Person("Joseph", 22)

  val personGreeting = joseph match {
    case Person(n, a) => s"Hei, jeg heter $n og jeg er $a."
    case _ => "something else"
  }
  println(personGreeting)

  // Tuple decomposition
  val aTuple = ("Rhapsody of Fire", "Metal")
  val bandDescription = aTuple match {
    case (band, genre) => s"$band belongs to the genre $genre."
    case _ => "something else"
  }
  println(bandDescription)

  // List decomposition
  val aList = List(1,2,3)
  val listDescription = aList match {
    case List(_, 2, _) => "List containing 2 at index 1"
    case _ => "Unknown list"
  }

  println(listDescription)
  // If PM doesn't match anything a match error will be thrown
  // Pattern matching matches all cases in sequence

}
