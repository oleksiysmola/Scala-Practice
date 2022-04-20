package com.smola.advanced

object Advanced extends App {

  // lazy evaluation - Only evaluates when first used
  lazy val aLazyValue = 2
  lazy val lazyValueWithSideEffect = {
    println("Jeg sover")
    43
  }
  val anotherValue = lazyValueWithSideEffect + 1
  println(anotherValue)
  // Useful in infinite collections

  // Pseudo-collections: Option, Try
  def aMethodThatCanReturnNull(): String = "Hallo Norge!"
  val anOption = Option(aMethodThatCanReturnNull()) // Some("Hallo Norge")
  // Option = "collection" which contains at most one element: Some(value) or None

  val stringProcessing = anOption match {
    case Some(string) => s"I have obtained a valid string: $string"
    case None => "I have obtained nothing"
  }
  // Can use map, flatMap, filter
  println(stringProcessing)


}
