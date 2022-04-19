package com.smola.exceptions

object Exceptions extends App{
  // Try catch blocks
  try {
    // Code that throws
    val x: String = null
    x.length
  } catch {
    case e: Exception => "Null strings have no length"
    println(e)
  } finally {
    // Finally to execute code regardless of any thrown exceptions
    println("This will always run")
  }

}
