package lectures.part4

object AllThePatterns extends App {

  //1-constraints
  val x: Any = "Scala"
  val constants = x match {
    case 1 => "a number"
    case "Scala" => "THE Scala"
    case true => "The Truth"
    case AllThePatterns => "A singleton object"
  }
  //2-match anything
  //2.1 wildcard
  val matchAnything = x match {
    case _ =>
  }
  //2.2 variable
  val matchAVariable = x match {
    case something => s"I've found $something"
  }

  //3.tuples
  val aTuple = (1,2)
  val matchATuple = aTuple match {
    case (1,1) =>
    case (something,2) => s"I've found $something"
  }

  val nestedTuple = (1, (2,3))
  val matchNestedTuple = nestedTuple match {
    case (_,(2,v)) => s"I've found $v"
  }
  //pattern matching can be nested

  //4 - case classes - constructor pattern
  // PM can be nested with case classes as well

  //5 - list patterns
  val aStandardList = List(1,2,3,42)
  val standardListMatching = aStandardList match {
    case List(1,_,_,_) => //extractor - advanced
    case List(1, _*) => // list of arbitrary length
    case 1::List(_) => //infix pattern
    case List(1,2,3) :+ 42 => //infix pattern
  }

  //6-type specifiers
  val unknown: Any = 2
  val unknownMatch = unknown match {
    case list: List[Int] => // explicit type specifier
    case _ =>
  }

  //7- name binding

//  val nameBindingMatch = aList match {
//    case nonEmptyList @ Cons(_,_) => // name binding => use the name later(here)
//    case Cons(1, rest @ Cons(2, _)) => // name binding inside nested patterns
//  }

  //8 - multi patterns
//  val multipattern = aList match {
//    case Empty | Cons(0, _) => //compound pattern (multi pattern)
//  }

  // 9 - if guards
//  val secondElementSpecial = aList match {
//    case Cons(_, Cons(specialElement, _)) if specialElement %2 == 0 =>
//  }

  val numbers = List(1,2,3)
  val numbersMatch = numbers match {
    case listOfStrings: List[String] => "a list of strings"
    case listOfNumber: List[Int] => "a list of numbers"
    case _ => ""
  }

  println(numbersMatch) // prints the first one because no generics

}
