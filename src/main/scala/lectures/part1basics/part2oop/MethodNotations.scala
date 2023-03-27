package lectures.part1basics.part2oop

import scala.language.postfixOps

object MethodNotations extends App {

  class Person(val name: String, favouriteMovie: String, val age: Int) {
    def likes(movie: String): Boolean = movie == favouriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(nickname: String): Person = new Person(s"$name ($nickname)", favouriteMovie, age)
    def unary_! : String = s"$name, what the heck?!"
    def unary_+ : Person = new Person(name, favouriteMovie, age + 1)
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favouriteMovie"
    def apply(n: Int): String = s"$name watched $favouriteMovie $n times"
    def learns(subject: String): String = s"$name learns $subject"
  }

  val mary = new Person("Mary", "Inception",19)

  println(mary.likes("Inception"))
  println(mary likes "Inception") // infix notation = operator notation

  val tom = new Person("Tom", "Fight Club",18)
  println(mary + tom) // println( mary.+(tom))

  println(5 + 5)
  println("bob" + ' ' + "noob")

  //all operators are methods

  // prefix notation
  val x = -1
  val y = 1.unary_-

  println(y)
  println(!mary)

  //postfix
  println(mary.isAlive)
  println(mary isAlive)

  //apply
  println(mary.apply())
  println(mary())//equivalent

  println((mary + "the rockstar")())
  println((+mary).age)

  println(mary learns "piano")
  println(mary apply(2))
}

// unary_ p
