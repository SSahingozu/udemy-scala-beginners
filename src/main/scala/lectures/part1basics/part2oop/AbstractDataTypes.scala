package lectures.part1basics.part2oop

object AbstractDataTypes extends App {

  // abstract
  abstract class Animal {
    val creatureType: String = "wild"
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"

    override def eat: Unit = println("nomnom")
  }

  // Traits
  trait Carnivore {
    def eat(animal: Animal): Unit
    val prefferedMeal: String = "meat"
  }

  class Crocodile extends Animal with Carnivore{
    override val creatureType: String = "croc"
    def eat: Unit = println("crunch crunch")
    def eat(animal: Animal): Unit = println(s"Im a croc and Im eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

}
