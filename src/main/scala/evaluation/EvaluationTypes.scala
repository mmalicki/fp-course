package evaluation

object EvaluationTypes {
  def callByNameFun(x: => Int) = 10
  def callByValueFun(x: Int) = 10
  def loop(): Int = 10 + loop

  def resourceConsumingFunction() = {
    println("I'm querying CM objects, that could take a while")
    10
  }

  def getMOsByValue(objectsCount: Int) = {
    println("Objects from query: " + objectsCount)
    println("Objects from query: " + objectsCount)
  }

  def getMOsByName(objectsCount: => Int) = {
    println("Objects from query: " + objectsCount)
    println("Objects from query: " + objectsCount)
  }

  def main(args: Array[String]): Unit = {
    println(callByNameFun(loop()))
    //println(callByValueFun(loop())) // stackOverflow exception

    getMOsByValue(resourceConsumingFunction)
    getMOsByName(resourceConsumingFunction)
  }
}


