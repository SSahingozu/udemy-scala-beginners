package lectures.part3fp

object TuplesAndMaps extends App {

  val aTuple = (2, "hello, scala")

  println(aTuple._1)
  println(aTuple.copy(_2 = "goodbye Java"))
  println(aTuple.swap) //

  //maps - Keys -> values
  val aMap: Map[String, Int] = Map()

  val phonebook = Map(("Jim", 555), "Daniel" -> 789).withDefaultValue(-1)
  //a -> b syntatic sugar for tuple a,b
  println(phonebook)

  println(phonebook.contains("Jim"))
  println(phonebook("Mary"))

  //add a pairing
  val newPairing = "Mary" -> 678
  val newPhonebook = phonebook + newPairing
  println(newPhonebook)

  //functionals on maps
  //map, flatmap, filter

  println(newPhonebook.map(pair => pair._1.toLowerCase -> pair._2))

  //filterKeys
  println(phonebook.view.filterKeys(x => x.startsWith("J")))// only show inputs with J at the start

  //mapValues

  println(phonebook.view.mapValues(number => number*10))// multiplies the int by 10
  println(phonebook.view.mapValues(number => "0245-" + number))

  //conversions to other collections
  println(phonebook.toList)
  println(List(("Daniel", 555)).toMap)
  val names = List("Bob", "James", "Angela", "Mary", "Daniel", "Jim")
  println(names.groupBy(name => name.charAt(0)))


  val phonebook2 = Map(("Jim", 555), "Daniel" -> 789, "JIM" -> 243).withDefaultValue(-1)
  println(phonebook2.map(pair => pair._1.toLowerCase -> pair._2))

}
