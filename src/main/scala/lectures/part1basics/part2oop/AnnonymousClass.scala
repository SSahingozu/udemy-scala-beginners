package lectures.part1basics.part2oop

object AnnonymousClass extends App {

  abstract class Animal {
    def eat: Unit
  }

  // annonymous class
  val funnyAnimal = new Animal {
    override def eat: Unit = println("ahhahahahahahaha")
  }
  /*
  equivalent with

  class annonymousClass$$anon$1 extends Animal {
    override def eat: Unit = println("ahahahahahaha")
  }
  val funnyAnimal: Animal = new annonymousClass$$anon$1
  */

  println(funnyAnimal.getClass)

  class Person(name: String) {
    def sayHi: Unit = println(s"Hi, my name is $name, how can I help")
  }

  val jim = new Person("Jim"){
    override def sayHi: Unit = println(s"Hi, my name is Jim, I dont even work here")
  }

  println(jim.sayHi)
}

