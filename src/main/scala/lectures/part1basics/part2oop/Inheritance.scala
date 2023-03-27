package lectures.part1basics.part2oop

object Inheritance extends App {

  class Animal {
    val creatureType = "wild"
    protected def eat = println("nomnomnomnom")
  }

  class Cat extends Animal{
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.crunch

  // constructors

  class Person (name: String, age: Int){
    def this(name: String) = this(name, 0)
  }

  class Adult (name: String, age: Int, idCard: String) extends Person(name)

  //overriding
  class Dog(override val creatureType: String) extends Animal{
    override def eat = {
      super.eat
      def eat = "nom"
      println("bork bork")
    }
    //override val creatureType = "house pet"
  }

  val dog = new Dog("domestic")
  dog.eat
  println(dog.creatureType)

  // polymorphsism
  val unknownAnimal: Animal = new Dog("K9")
  //unknownAnimal.eat
}
