package test.traits

object TestSpeedometer {
  def main(args: Array[String]): Unit = {
    val speedometer1: Speedometer[Double] = new Dashboard(25.1)
    println("Initial speed = " + speedometer1.showSpeed)
    speedometer1.accelerate(10.6)
    speedometer1.decelerate(5.9)
    
    val speedometer2: Speedometer[Int] = new Dashboard(5)
    println("Initial speed = " + speedometer2.showSpeed)
    speedometer2.accelerate(6)
    speedometer2.decelerate(9)
  }
}