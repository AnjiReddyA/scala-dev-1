package test.classes

/**
 * Useful for 
 * 1. Data transfer objects which are immutable in nature.
 * 2. Pattern matching objects
 * 
 * Compiler automatically provides the following,
 * 1. Accessors for constructor params
 * 2. Class and companion object 
 * 3. apply method in object. This is a factory method for instantiating the case class.
 * 4. copy method in class. This returns a copy of the instance with any requested changes. 
 * 5. equals method in class. This returns true if every field in another instance match every field in this instance. 
 * Also invocable by the operator ==.
 * 6. hashCode method in class. This returns a hash code of the instance’s fields, useful for hash-based collections.
 * 7. toString method in class. This renders the class’s name and fields to a String .
 * 8. unapply method in object. This extracts the instance into a tuple of its fields, making it possible to use case 
 * class instances for pattern matching.
 */

case class TestCaseClass (name:String, age: Int)

object TestCaseClassDriver {
	def main(args: Array[String]) {
		val p1 = TestCaseClass("Prithviraj Bose", 18)
		val p2 = TestCaseClass("Adrian Robertson", 19)
		
		println(p1 == p2)
		
		val p3 = p1.copy(name = "Abigail Sterkin")
		
		val matchResult = p3 match {
			case TestCaseClass(n, a) => "Found Abigail Sterkin"
		}
		
		println(matchResult)
	}
}