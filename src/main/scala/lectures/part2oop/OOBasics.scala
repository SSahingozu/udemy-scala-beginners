package lectures.part2oop

object OOBasics extends App {

  val person = new Person("John", 26)
  println(person.age)
  person.greet("Jo")
  person.greet()

  val author = new Writer("Sevkan", "Sahingozu", 1997)
  val impostor  = new Writer("Sevkan", "Sahingozu", 1997)
  val novel = new Novel("Nope", 2009, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(impostor))

  val counter = new Counter(5)
  counter.inc.inc.inc.print
  counter.inc(10).print

}
// constructor
class Person (name: String, val age: Int) {
  //body defines the implementation of this class
  val x = 2
  println(1+2)

  // method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading
  def greet(): Unit = println(s"$name")

  //multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("john doe")
}

// class parameters are not fields to print age add val/var in front of parameters

/*
  Novel and a Writer

  Writer: first name, surname, year
    -method fullname

  Novel: name, year of release, author
    -authorAge
    -isWrittenBy
    -copy (new year of release) = new instance of Novel
*/
class Writer(firstName: String, surname: String, val year: Int){

  def fullName: String = firstName + " " + surname
}

class Novel(name: String, yearOfRelease: Int, author: Writer){

  def authorAge =  yearOfRelease - author.year
  def isWrittenBy(author: Writer) = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}
/*
  counter class
    -receives an int value
    -method current count
    -method to increment/decrement => new Counter
    -overload inc/dec to receive an amount
*/

class Counter(val count: Int){
  def inc = {
    println("incrementing")
    new Counter(count+1)
  }
  def dec = {
    println("decrementing")
    new Counter(count-1)
  }

  def inc(n: Int): Counter = {
    if(n <= 0) this
    else inc.inc(n-1)

  }
  def dec(n: Int): Counter = {
    if(n <= 0) this
    else dec.dec(n-1)
  }

  def print = println(count)
}