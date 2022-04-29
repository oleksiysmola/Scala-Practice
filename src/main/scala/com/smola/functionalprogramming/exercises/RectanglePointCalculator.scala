package com.smola.functionalprogramming.exercises

object RectanglePointCalculator {
  def CountPoints(a: Int, b: Int): Int = {
    // Setup define points of rectangle before rotation
    val point1 = List((a/2).toDouble, (b/2).toDouble)
    val point2 = List((a/2).toDouble, -(b/2).toDouble)
    val point3 = List(-(a/2).toDouble, -(b/2).toDouble)
    val point4 = List(-(a/2).toDouble, (b/2).toDouble)
    // Retrieve pi for rotations
    val pi = Math.PI

    // Rotate points
    val rotatedPoint1 = List(point1(0)*Math.cos(pi/4) - point1(1)*Math.sin(pi/4),
      point1(0)*Math.sin(pi/4) + point1(1)*Math.cos(pi/4))
    val rotatedPoint2 = List(point2(0)*Math.cos(pi/4) - point2(1)*Math.sin(pi/4),
      point2(0)*Math.sin(pi/4) + point2(1)*Math.cos(pi/4))
    val rotatedPoint3 = List(point3(0)*Math.cos(pi/4) - point3(1)*Math.sin(pi/4),
      point3(0)*Math.sin(pi/4) + point3(1)*Math.cos(pi/4))
    val rotatedPoint4 = List(point4(0)*Math.cos(pi/4) - point4(1)*Math.sin(pi/4),
      point4(0)*Math.sin(pi/4) + point4(1)*Math.cos(pi/4))

    println(rotatedPoint1)
    println(rotatedPoint2)
    println(rotatedPoint3)
    println(rotatedPoint4)

    // Compute lines of rectangle
    val gradient1 = (rotatedPoint1(1) - rotatedPoint2(1))/(rotatedPoint1(0) - rotatedPoint2(0))
    val intercept1 = rotatedPoint1(1) - gradient1*rotatedPoint1(0)
    def line1(x: Double): Double = gradient1*x + intercept1
    val gradient2 = (rotatedPoint2(1) - rotatedPoint3(1))/(rotatedPoint2(0) - rotatedPoint3(0))
    val intercept2 = rotatedPoint2(1) - gradient2*rotatedPoint2(0)
    def line2(x: Double): Double = gradient2*x + intercept2
    val gradient3 = (rotatedPoint3(1) - rotatedPoint4(1))/(rotatedPoint3(0) - rotatedPoint4(0))
    val intercept3 = rotatedPoint3(1) - gradient3*rotatedPoint3(0)
    def line3(x: Double): Double = gradient3*x + intercept3
    val gradient4 = (rotatedPoint1(1) - rotatedPoint4(1))/(rotatedPoint1(0) - rotatedPoint4(0))
    val intercept4 = rotatedPoint4(1) - gradient4*rotatedPoint4(0)
    def line4(x: Double): Double = gradient4*x + intercept4
    println(gradient1)
    println(gradient2)
    println(gradient3)
    println(gradient4)



    // Variable to track the number of integer points in the grid
    var pointsInRectangle = 0

    // Max length
    val maxLength = List(a, b).max

    val findPointsInGrid = for {
      x <- -math.ceil((maxLength/2).toDouble).toInt to math.ceil((maxLength/2).toDouble).toInt
      y <- -math.ceil((maxLength/2).toDouble).toInt to math.ceil((maxLength/2).toDouble).toInt
    } yield {
        if (y.toDouble < line1(x.toDouble) && y.toDouble > line2(x.toDouble) && y.toDouble > line3(x.toDouble)
        && y.toDouble < line4(x.toDouble) ) {
          pointsInRectangle += 1
          true
        }
    }
    pointsInRectangle
  }

}
