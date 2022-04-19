package com.smola.generics

object Generics extends App {
  abstract class MyList[T] {
    def head: T
    def tail: MyList[T]
  }

  val aList: List[Int] = List(1, 2, 3)
  println("My list: " + aList)
  println("First entry: " + aList.head)
  println("Rest: " + aList.tail)

}
