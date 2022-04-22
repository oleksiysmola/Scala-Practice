package com.smola.functionalprogramming.exercises

object ReverseString extends App {
  // Write a program to reverse all the characters in a string
  // Define the string to be reversed as a field of the object
  var stringToReverse = ""
  def FormNewString(string: String): String =
    // If the string is the same length as the original pass
    if (string.length == stringToReverse.length) string
    // Keep passing characters from the target string to our new string (moving left along aString)
    else FormNewString(string + stringToReverse.charAt(stringToReverse.length - 1 - string.length))
  def StringReverse(stringToReverse: String): String =
    // Set the string to reverse as to to the appropriate object field
    this.stringToReverse = stringToReverse
    // Initialise empty string
    val initialString = ""
    FormNewString(initialString)
}
