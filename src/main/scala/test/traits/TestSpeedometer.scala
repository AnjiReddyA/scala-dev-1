package test.traits

object TestSpeedometer {
  def main(args: Array[String]): Unit = {
    var speedometer: Speedometer = new Dashboard(25)
    
    println("Initial speed = " + speedometer.showSpeed)
    
    speedometer.accelerate(10)
    
    speedometer.decelerate(5)
  }
}