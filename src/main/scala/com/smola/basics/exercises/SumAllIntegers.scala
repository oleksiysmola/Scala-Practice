package com.smola.basics.exercises

object SumAllIntegers extends App {
  def sumOfIntegers(n: Int): Int =
    if (n <= 1) 1
    else n + sumOfIntegers(n - 1)
  println(sumOfIntegers(1))
  println(sumOfIntegers(3))
  println(sumOfIntegers(100))

}
