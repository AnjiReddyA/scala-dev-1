package test.traits

class Dashboard (s: Float) extends Speedometer {
	var speed: Float = s
	
	def showSpeed: Float = speed
	
	def accelerate(rate: Float) = println(f"Accelerating at $rate")
	
	def decelerate(rate: Float) = println(f"Decelerating at $rate")
}