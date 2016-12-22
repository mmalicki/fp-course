package traits

trait Shape {
  val width: Int
  val height: Int
  val area: Int = width * height
}
class Rectangular(val width: Int, val height: Int) extends Shape


class Traits {
  def main(args: Array[String]): Unit = {
    val shape = new Rectangular(10, 20)
    println(shape.area)
  }
}
