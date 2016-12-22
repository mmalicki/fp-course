package patternmatch

object PatternMatch {
  val onlyElementList = List("One")
  val multiElementList = List("One", "Two", "Three")

  def check(list: List[String]): String = {
    list match {
      case head :: Nil =>  head + ", no more elements"
      case head :: xs => head + ", " + check(xs)
      case Nil => "Empty list"
    }
  }

  def checkCount(list: List[String]): String = {
    list match {
      case _ :: _ => "Non empty list"
      case _ => "Empty list"
    }
  }


  def main(args: Array[String]): Unit = {
    check(onlyElementList)
    check(multiElementList)

    println(checkCount(List("One", "Two", "Three")))
    println(checkCount(List()))

    val number = 1

    number match {
      case 0 => println("Off")
      case 1 => println("On")
    }
  }
}
