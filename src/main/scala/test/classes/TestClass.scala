package test.classes

/**
 * Example of an immutable class.
 */
class TestClass(n: String, a: Int) {
	private var name: String = n
	private var age: Int = a

	def getName = name
	def getAge = age
	
	override def toString: String = name + "/" + age
}

object TestClassDriver {
	def main(args: Array[String]) {
		var p: TestClass = new TestClass("Prithviraj Bose", 18)
		
		println(p.toString)
		println(p.getName + "/" + p.getAge)
		
		println(TestCaseClassDriver.toString)
	}
	
	override def toString: String = getClass.getName
}
