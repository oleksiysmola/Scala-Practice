package com.smola.functionalprogramming.exercises

object ReverseString extends App {
  // Write a program to reverse all the characters in a string
  val aString = "Jeg har en fugl"
  // Initialise empty string
  val initialString = ""
  def StringReverse(string: String): String =
    // If the string is the same length as the original pass
    if (string.length == aString.length) string
    // Keep passing characters from the target string to our new string (moving left along aString)
    else StringReverse(string + aString.charAt(aString.length - 1 - string.length))
  println(StringReverse(initialString))

}
