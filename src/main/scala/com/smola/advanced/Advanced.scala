package com.smola.advanced

import scala.util.{Failure, Success, Try}

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
  println(stringProcessing)

  def methodWhichCanThrowException(): String = throw new RuntimeException
  val aTry = Try(methodWhichCanThrowException())
  // a try = "collection" with a value if the code went well or an exception if the code threw one

  val anotherStringProcessing = aTry match {
    case Success(validValue) => s"We have obtained a valid string: $validValue"
    case Failure(ex) => s"We have obtained an exception: $ex"
  }

  println(anotherStringProcessing)
  // use map, flatMap, filter can be used on both Try and Option


}
