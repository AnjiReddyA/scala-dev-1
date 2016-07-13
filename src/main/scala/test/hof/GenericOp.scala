package test.hof

/**
 * @author edureka
 */
object GenericOp {

	def genericOp[T](f: (T, T) => T, op1: T, op2: T): T = {
		f(op1, op2)
	}

	def op(f: (Int, Int) => Int, op1: Int, op2: Int): Int = {
		f(op1, op2)
	}

	def multiply(x: Int, y: Int): Int = {
		x * y
	}

	def main(args: Array[String]): Unit = {

		// calling by name
		println(op(multiply, 2, 3))

		// using Function Literals/Anonymous Functions/Lambda functions
		println(op((x, y) => x * y, 2, 3))

		// calling with any numeric types
		println(genericOp[Float]((x, y) => x * y, 2.5f, .3f))
		// alternative syntax
		println(genericOp((x: Int, y: Int) => x * y, 2, 3))
	}

}