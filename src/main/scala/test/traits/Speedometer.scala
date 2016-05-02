package test.traits

/**
 * Simple speedometer specification.
 */
trait Speedometer {
	protected var speed: Float
	def showSpeed: Float
	def accelerate(rate: Float)
	def decelerate(rate: Float)
}