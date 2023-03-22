package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x: Int = 42
  println(x)

  // VALS ARE IMMUTABLE
  // types of vals are optional, don't have to specify it, compiler can infer types

  val aString: String = "Hello";
  // ; is used if code is written on the same line
  val anotherString = "Goodbye"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 5273985273895237L
  val aFloat: Float = 2.0F
  val aDouble: Double = 3.141

  // variables
  var aVariable: Int = 4

  aVariable = 5 // side effects

}
