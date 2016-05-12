package test.traits

class Dashboard[T] (s: T) extends Speedometer[T] {
	var speed: T = s
	
	def showSpeed: T = speed
	
	def accelerate(rate: T) = println(f"Accelerating at $rate")
	
	def decelerate(rate: T) = println(f"Decelerating at $rate")
}