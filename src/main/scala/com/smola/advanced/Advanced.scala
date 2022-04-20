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


}
