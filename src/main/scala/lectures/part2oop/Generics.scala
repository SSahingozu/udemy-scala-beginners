package lectures.part2oop

object Generics extends App {

  class MyList[+A] {

    def add[B >: A](element: B): MyList[B] = ???
  }

  class MyMap[Key, Value] {

  }

  val listOfIntergers = new MyList[Int]
  val listOfStrings = new MyList[String]

  //generics

  object MyList {
    def empty[A]: MyList[A] = ???
  }

  val emptyListOFIntegers = MyList.empty[Int]

  class Animal
  class Cat extends Animal
  class Dog extends Animal

  //yes, List[cat] extends list[Animal] = Covariance
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]

  // no this is invariance
  class InvariantList[A]
  //val invariantAnimalList: InvariantList[Animal] = new InvariantList[Cat] // comment this line out to test it

  //HELL NO Contravariance
  class Contravariance[-A]
  val contravariantList: Contravariance[Cat] = new Contravariance[Animal]

  //bounded types
  class Cage[A <: Animal](animal: A) // upper bounded
  val cage = new Cage(new Dog)

  //class Car
  //val newCage = new Cage(new Car) // this doesnt work as Car is not animal and is not extended by it



}
