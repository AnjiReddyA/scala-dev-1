package test.classes

import scala.collection.mutable.ArrayBuffer

class Instance {
  Instance.instanceCount += 1
}

object Instance {
  private var instanceCount: Int = 0

  def getInstanceCount(): Int = {
    instanceCount
  }
  
  def apply(): Instance = {
    new Instance()
  }
}

object TestCompanionDriver {
  def main(args: Array[String]) {
    for (i <- 1 to 5)
      Instance()
      
      println(s"Total instances = ${Instance.getInstanceCount}")
  }
}
