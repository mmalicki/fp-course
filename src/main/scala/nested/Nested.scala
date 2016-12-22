package nested

object Nested {
  def tailRecursion(list: List[Int]): Int = {
    def tailRecursion(list: List[Int], result: Int): Int = {
      if (list.nonEmpty)
        tailRecursion(list.tail, result + 1)
      else result
    }
    tailRecursion(list, 0)
  }

  def main(args: Array[String]): Unit = {
    println(tailRecursion(List(1, 2, 3, 4, 5)))
  }
}
