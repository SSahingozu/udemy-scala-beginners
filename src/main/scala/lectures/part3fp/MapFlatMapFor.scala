package lectures.part3fp

object MapFlatMapFor extends App {

  val list = List(1,2,3)
  println(list.head)
  println(list.tail)

  println(list.map(_ + 1))
  println(list.map(_ + " is a number"))

  //filter
  println(list.filter(_ % 2 == 0))

  val toPair = (x: Int) => List(x, x+1)
  println(list.flatMap(toPair))

  val numbers = List(1,2,3,4)
  val chars = List("a", "b", "c", "d")
  val colours = List("black", "white")

  //iterations
  val pairing = numbers.flatMap(n => chars.flatMap(c => colours.map(colours => ""+c+n +colours)))
  println(pairing)

  //foreach
  list.foreach(println)

  //for comprehension

  val forCombinations = for {
    n <- numbers if n % 2 == 0
    c <- chars
    colour <- colours
  } yield "" + c + n + colour
  print(forCombinations)

  for {
    n <- numbers
  } println(n)

  //syntax overload
  list.map {x =>
    x*2
  }

  //test
}
