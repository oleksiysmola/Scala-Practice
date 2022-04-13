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
  /* Like interfaces: compiles as the eat method of an animal object but at runtime
  the method from the lowest child will be called
  */

}
