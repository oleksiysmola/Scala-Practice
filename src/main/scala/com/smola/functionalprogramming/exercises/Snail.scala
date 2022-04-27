package com.smola.functionalprogramming.exercises

object Snail {
  def SnailPath(grid: List[List[Int]]): List[Int] = {
    // Obtain total grid points
    val numberOfGridPoints = grid.length*grid(0).length
    // Initialise list to add points visited to
    var pointsVisited = List[Int]()
    // Create array to track the current position and velocity of the snail along the grid
    val currentPosition = Array(0, -1)
    // Setup initial velocity
    val pi = Math.PI
    var angleOfTravel = 0.0
    val currentVelocity = Array(Math.sin(angleOfTravel).toInt, Math.cos(angleOfTravel).toInt)

    val snailPath = for {
      stepNumber <- 1 to numberOfGridPoints
    } yield {
      try {
        // Shift position
        currentPosition(0) += currentVelocity(0)
        currentPosition(1) += currentVelocity(1)
        // Checks if grid point has already been visited
        if (pointsVisited.contains(grid(currentPosition(0))(currentPosition(1)))) throw new Exception
        // Add position to grid
        pointsVisited = pointsVisited :+ grid(currentPosition(0))(currentPosition(1))
      } catch {
        case e: Exception => {
          // Return to bounds of grid before changing velocity
          currentPosition(0) -= currentVelocity(0)
          currentPosition(1) -= currentVelocity(1)
          // Rotate snail
          angleOfTravel += pi/2
          currentVelocity(0) = Math.sin(angleOfTravel).toInt
          currentVelocity(1) = Math.cos(angleOfTravel).toInt
          // Shift position
          currentPosition(0) += currentVelocity(0)
          currentPosition(1) += currentVelocity(1)
          // Add position to grid
          pointsVisited = pointsVisited :+ grid(currentPosition(0))(currentPosition(1))
        }
      }
    }
    pointsVisited
  }

}
