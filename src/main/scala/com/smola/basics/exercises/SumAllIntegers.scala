package com.smola.basics.exercises

object SumAllIntegers extends App {
  def sumOfIntegers(n: Int): Int =
    if (n == 1) 1
    else if (n == 0) 0  
    else if (n < 0) throw new IllegalArgumentException()
    else n + sumOfIntegers(n - 1)
}
