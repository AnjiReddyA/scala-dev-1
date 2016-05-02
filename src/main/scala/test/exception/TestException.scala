package test.exception

import scala.util.{Try, Success, Failure}

class TestException {
	def findElementIndex(e: Int, list: List[Int]): Int = {
		
		val index: Int = list.indexOf(e, 0)
		
		if (index == -1)
			throw new Exception("Element not found.")
		index
	}
}

object TestException {
	def main(args: Array[String]): Unit = {
	  
		val list = List(1, 2, 3, 4, 5)
		
		Try(new TestException().findElementIndex(3, list)) match {
			
			case Success(index) => println(s"Found element at index = $index")
			case Failure(exception) => println(exception.getMessage)
		}
	}
}