package test.classes

/**
 * Can't have constructor params...
 */
object Singleton {
	private var id: Int = 0

	def getId() = {
		id += 1
		id
	}
	
	def main(args: Array[String]): Unit = {
	  for (i <- 1 to 5)
	 	  println(">>> Generated Ids: " + Singleton.getId())
	}
}