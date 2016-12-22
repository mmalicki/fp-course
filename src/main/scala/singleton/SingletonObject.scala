package singleton

object SingletonObject {
  var count = 0

  def currentCount(): Long = {
    count += 1
    count
  }
  def main(args: Array[String]): Unit = {
    println(SingletonObject.currentCount())
  }
}
