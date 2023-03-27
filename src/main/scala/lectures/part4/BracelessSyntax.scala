package lectures.part4

object BracelessSyntax {

  //if - expressions
  val anIfExpression = if (2 > 3) "bigger" else "smaller"

  // java style
  val anIfExpressionV2 =
    if (2>3) {
      "bigger"
    } else {
      "smaller"
    }

    //compact style
  val anIfExpressionV3 =
      if (2>3) "bigger"
      else "smaller"

    //scala 3
  val anIfExpressionV4 =
      if (2>3) then
        "bigger" // must have a higher indentation than else and if
      else
        "smaller"

  val anIfExpressionV5 =
      if (2>3) then
        val result = "bigger"
        result
      else
        val result = "smaller"
        result

  val anIfExpressionV6 = if 2 > 3 then "bigger" else "smaller"

  //for comprehensions
  val aForComprehension = for {
    n <- List(1,2,3)
    s <- List("black", "white")
  } yield s"$n$s"

  //scala 3 style
  val aForComprehensionV2 =
    for
      n <- List(1, 2, 3)
      s <- List("black", "white")
    yield s"$n$s"

  //pattern matching
  val meaningOfLife = 42
  val aPatternMatch = meaningOfLife match {
    case 1 => "the one"
    case 2 => "dpuble or nothing"
    case _ => "something else"
  }

  //scala 3
  val aPatternMatchV2 = meaningOfLife match
    case 1 => "the one"
    case 2 => "dpuble or nothing"
    case _ => "something else"

  //methods without braces
  def computeMeaningOfLife(arg: Int): Int = {
    val partialResult = 40



    partialResult+2
  }

  def computeMeaningOfLifeV2(arg: Int): Int =
    val partialResult = 40


    partialResult + 2

  //class definition with significant indentation (Same for traits, objects, enums etc)
  class Animal {
    def eat(): Unit =
      println("I'm eating")
  }

  class AnimalV2:
    def eat(): Unit =
      println("I'm eating")

    def grow(): Unit =
      println("I'm growing")

  end AnimalV2

  //anonymous classes
  val aSpecialAnimal = new Animal:
    override def eat(): Unit = println("I'm special")

  //indentation  = strictly larger indentation
  // 3 spaces + 2tabs > 2 spaces + 2 tabs
  // 3 spaces + 2 tabs > 3 spaces + 1 tab
  // 3 tabs + 2 spaces ??? 2 tabs + 3 spaces

  def main(args: Array[String]): Unit = {
    println(computeMeaningOfLifeV2(78))
  }

}
