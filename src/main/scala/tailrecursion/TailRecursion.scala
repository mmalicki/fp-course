package tailrecursion

object TailRecursion {

  def standardRecursion(list: List[Int]): Int = {
    if (list.nonEmpty)
      1 + standardRecursion(list.tail)
    else 0
  }

  def tailRecursion(list: List[Int], result: Int): Int = {
    if (list.nonEmpty)
      tailRecursion(list.tail, result + 1)
    else result
  }

  def main(args: Array[String]): Unit = {
    val list = (1 to 1000000).toList
//    println(standardRecursion(list)) stack overflow exception
    println(tailRecursion(list, 0))
  }
}
