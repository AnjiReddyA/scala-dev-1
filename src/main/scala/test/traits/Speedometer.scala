package test.traits

/**
 * Simple speedometer specification.
 */
trait Speedometer[T] {
	protected var speed: T
	def showSpeed: T
	def accelerate(rate: T)
	def decelerate(rate: T)
}