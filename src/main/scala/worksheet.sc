class Animal
class Dog extends Animal
class Cat extends Animal

val animal = new Cat()

animal match {
  case dog: Dog => println("This is a dog!")
  case cat: Cat => println("This is a cat!")
}

val onlyElementList = List("One")
val multiElementList = List("One", "Two", "Three")

def check(list: List[String]): String = {
  list match {
    case head :: Nil =>  head + ", no more elements"
    case head :: xs => head + ", " + check(xs)
  }
}
trait Function1[A, B] {
  def apply(x: A): B
}
(x: Int) => x * x
check(onlyElementList)
check(multiElementList)
{
  class AnonFun extends Function1[Int, Int] {
    def apply(x: Int) = x * x
  }
  new AnonFun
}

new Function1[Int, Int] {
  def apply(x: Int) = x * x
}
def sum3(f: Int => Int)(a: Int, b: Int): Int = if (a > b) 0 else f(a) + sum3(f)(a + 1, b)
val curr = sum3(x => x)(1, 5)
