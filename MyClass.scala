```scala
class MyClass(val x: Int) {
  def this(s: String) = this(s.toInt)
  def this() = this(0) 
}

val myObject = new MyClass()
println(myObject.x) //Prints 0

val myObject2 = new MyClass("10")
println(myObject2.x) //Prints 10

val myObject3 = new MyClass(20)
println(myObject3.x) //Prints 20

val myObject4 = new MyClass { override def toString():String = "CustomString" }
println(myObject4.x) //Prints 0
```