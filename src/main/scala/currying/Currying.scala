package currying

object Currying {

  def fact(n: Int): Int = if (n == 0) 1 else n * fact(n - 1)
  def sum2(f: Int => Int, a: Int, b: Int): Int =
    if (a == b)
      f(a)
    else
      f(a) + sum2(f, a + 1, b)
  def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int =
      if (a > b) 0
      else f(a) + sumF(a + 1, b)
    sumF
  }

  def sum3(f: Int => Int)(a: Int, b: Int): Int = if (a > b) 0 else f(a) + sum3(f)(a + 1, b)
  def sumInts = sum(x => x)
  def sumCubes = sum(x => x * x * x)
  def sumFactorials = sum(fact)
  def main(args: Array[String]): Unit = {
    println(sumInts(1, 4))
    sum (x => x * x * x) (1, 10)
    val curr = sum3(x => x)
    curr()
  }
}
