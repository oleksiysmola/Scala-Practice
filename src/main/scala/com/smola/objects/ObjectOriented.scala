package com.smola.objects

object ObjectOriented extends App{

  // Class and instance
  class Animal {
    // Define fields
    val age: Int = 0
    // Define methods
    def eat() = println("Dyret spiser")
  }
  val anAnimal = new Animal

  // Inheritance
  class Bird(val name: String) extends Animal {
    // Override modifier allows the overriding of methods
    override def eat() = println("Fuglen spiser")
  }
  val aBird = new Bird("Pineapple")

  println(aBird.name) // val required before constructor argument for variable to be recognised as class property

  // Subtype polymorphism
  val aDeclaredAnimal: Animal = new Bird("Book Snap")
  aDeclaredAnimal.eat()
  /* Compiles as the eat method of an animal object but at runtime
  the method from the lowest child will be called
  */

  // Abstract classes
  abstract class WalkingAnimal {
    val hasLegs = true // By default scope is always public. Can restrict with private or protected
    def walk(): Unit
  }

  // Interface
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  trait Philosopher {
    def ?!(thought: String): Unit // Valid method name
  }

  // Single and multi-class inheritance: Can inherit from multiple classes
  class Crocodile extends Animal with Carnivore with Philosopher {
    override def eat(animal: Animal): Unit = println("The poor animal is now getting eaten :(")
    override def ?!(thought: String): Unit = println(s"I am thinking $thought")
  }

  val aCroc = new Crocodile
  aCroc.eat(aDeclaredAnimal)
  // Scala allows for alternative notation methods with one argument: object method argument
  aCroc eat aDeclaredAnimal
  aCroc ?! "about Scala"

  // Operators in Scala are methods?!
  val basicMath = 1 + 2
  val moreMath = 1.+(2) // Equivalent to the line above

  // Anonymous class
  val dinosour = new Carnivore {
    override def eat(animal: Animal): Unit = println("Dinosaurs can eat anything")
  }

  // Singleton object
  object MySingleton { // Only instance of MySingleton type
    val mySpecialValue = 53278
    def mySpecialMethod(): Int = 5327
    def apply(x: Int): Int = x + 1
  }

  MySingleton.apply(65)
  MySingleton(65) // Equivalent to MySingleton.apply(65) akin to static keyword in Java
  // With apply methods in a class we can invoke the class like a function
}
