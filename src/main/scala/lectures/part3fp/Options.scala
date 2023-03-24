package lectures.part3fp

object Options extends App{

  val myFirstOption: Option[Int] = Some(4)
  val noOption: Option[Int] = None

  println(myFirstOption)
  println(noOption)

  // unsafe APIs
  def unsafeMethod(): String = null

  //val result = Some(unsafeMethod())//wrong you might get some with null
  val result = Option(unsafeMethod())//some or none

  //chained methods
  def backupMethod(): String = "A valid result"
  val chainedResult = Option(unsafeMethod()).orElse(Option(backupMethod()))

  //design unsafe api
  def betterUnsafeMethod(): Option[String] = None
  def betterBackupMethod(): Option[String] = Some("A valid result")

  val betterChainedResult = betterUnsafeMethod() orElse betterBackupMethod()

  //functions on options
  println(myFirstOption.isEmpty)
  println(myFirstOption.get) // unsafe

  //map, flatmap, filter
  println(myFirstOption.map(_ * 2))
  println(myFirstOption.filter(x => x> 10))
  println(myFirstOption.flatMap(x => Option(x*10)))

}
