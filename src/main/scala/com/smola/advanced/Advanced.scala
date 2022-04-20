package com.smola.advanced

import scala.concurrent.Future
import scala.util.{Failure, Success, Try}
import scala.concurrent.ExecutionContext.Implicits.global

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

  // Evaluate something on another thread {asynchronous programming}
  val aFuture = Future({
    println("Loading...")
    Thread.sleep(1000)
    println("I have computed a value")
    67
  })

  Thread.sleep(2000)

  // Future is a "collection" which contains a value when it's evaluated
  // Is composable with map, flatMap and filter
  // monads

  // Implicits

  // 1: Implicit arguments
  def aMethodWithImplicitArguments(implicit arg: Int) = arg + 1
  implicit val myImplicitInt: Int = 46
  println(aMethodWithImplicitArguments)
  // 2: Implicit conversions
  implicit class MyInteger(n: Int) {
    def isEven() = n % 2 == 0
  }
  print("Is the 10 even: " + 10.isEven())




}
