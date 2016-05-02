package test.classes

abstract class MyAbstractFile {
	def open(filename: String)
	def save(filename: String)
}

class MyFile extends MyAbstractFile {
	override def open(filename: String) = {
		println("MyFile.open method called...")
	}

	override def save(filename: String) = {
		println("MyFile.save method called...")
	}
}

class MyCompressedFile extends MyFile {
	override def save(filename: String) = {
		println("MyCompressedFile.save method called...")
		println(">>> Implementing compression logic")
		println(">>> Calling the immediate base save method now...")
		super.save(filename)
	}
}

object TestInhertanceDriver {
	def main(args: Array[String]) {
		var f = new MyFile()
		
		println("*** Testing MyFile ***")

		f.open(null)
		f.save(null)
		
		println("*** Testing MyCompressedFile ***")

		f = new MyCompressedFile()
		f.open(null)
		f.save(null)
	}
}