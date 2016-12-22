package singleton

class CompanionObject(foo: String)

object CompanionObject {
  def apply(value: String) = new CompanionObject(value)
  val withoutNew = CompanionObject("str")
}
