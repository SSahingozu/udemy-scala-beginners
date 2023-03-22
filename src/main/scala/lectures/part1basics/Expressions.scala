package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // Expression
  println(x)

  println(2 + 3 * 4) // Follows BODMAS

  println(1 == x)

  println(!(1 == x)) // logical negation ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /=
  println(aVariable)

  // Instructions (Do this do that) vs Expressions (VALUE)

  // IF expression
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3 // if expression
  println(aCondition)
  println(if(aCondition) 5 else 3)

  var j = 0
  while (j < 10){
    println(j)
    j+=1
  }

  // NEVER USE WHILE LOOPS

  // EVERYTHING IN SCALA IS AN EXPRESSION

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning

  //code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  //val anotherValue = z + 1 // doesnt run because z is inside a code block

}
