package test.traits

class Dashboard[T] (var speed: T) extends Speedometer[T] {
	
	def showSpeed: T = speed
	
	def accelerate(rate: T) = println(f"Accelerating at $rate")
	
	def decelerate(rate: T) = println(f"Decelerating at $rate")
}