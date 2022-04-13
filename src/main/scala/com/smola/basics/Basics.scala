package com.smola.basics

object Basics extends App{

  // Defining a value
  val speedOfLight: Int = 299792458 // Cannot reassign variable (is a constant)

  // Don't need to always specify type!
  val aBoolean = false

  // A string
  val aString = "Jeg elsker fugler"
  // Composed string
  val aComposedString = "Jeg" + " har " + " tusen " + " ender"
  // Interpolated string
  val anInterpolatedString = s"The speed of light is $speedOfLight m/s"

  println(aString)
  println(aComposedString)
  println(anInterpolatedString)

}
