package com.smola.functionalprogramming.exercises

object ArrayDifference {
  def ArrayDifference(firstSequence: Seq[Int], secondSequence: Seq[Int]): Seq[Int] = {
    var outputList = List[Int]()
    for {
      entry <- firstSequence
    } yield if (!secondSequence.contains(entry)) {
      outputList = outputList :+ entry
    }
    outputList.toSeq
  }
}
