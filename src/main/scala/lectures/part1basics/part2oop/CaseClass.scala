package lectures.part1basics.part2oop

object CaseClass extends App {

  case class Person(name: String, age: Int)
  // class parameters are fields

  val jim = new Person("jim", 25)
  println(jim.name)

  //sensible toString
  // println(instance) would automatically be println(instance.toString)
  println(jim.toString)

  // equals and hashcode implemented out of the box
  val jim2 = new Person("jim", 25)
  println(jim == jim2)

  // case classes have handy copy methods
  val jim3 = jim.copy(age = 45)
  println(jim3)

  //case classes have companion objects
  val thePerson = Person
  val mary = Person("Mary", 24)

  // case classes are serializable
  // akka framework

  //case classes have extractor patterns == case classes can be used in pattern matching

  case object UnitedKingdom {
    def name: String = "The Uk of GB and NI"
  }

}
