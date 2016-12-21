package higherorder

object Functions {

  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a == b)
      f(a)
    else
      f(a) + sum(f, a + 1, b)

  def main(args: Array[String]): Unit = {
    println(sum(x => x * x, 1, 3))

    val numbers = List(1, 2, 3, 4, 5)

    //filter only even numbers
    println(numbers.filter(num => num % 2 == 0))

    //get sum of list
    println(numbers.reduce((x, y) => x + y))
    println(numbers.foldLeft(0)((x, y) => x + y))

    //duplicate each number
    println(numbers.flatMap(x => List(x, x)))

  }
}
