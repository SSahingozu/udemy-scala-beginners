package lectures.part2oop

object Objects extends App{

  object Person { //type + its only instance
    // "static"/"class" level functionality
    val N_Eyes = 2
    val canFly: Boolean = false

    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }

  class Person (val name: String) {
    //instance-level functionality
  }

  //println(Person.N_Eyes)
  //println(Person.canFly)

  //Scala object = single instance
  val mary = new Person("Mary")
  val john = new Person("John")
  println(mary == john)

  val person1 = Person
  val person2 = Person
  println(person1 == person2)

  val bobbie = Person(mary, john)

  println(bobbie)

  //Scala applications

}
