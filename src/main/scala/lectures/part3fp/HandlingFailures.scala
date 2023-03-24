package lectures.part3fp

import scala.util.{Failure, Success, Try}

object HandlingFailures extends App {

  //create success and failure
  val aSuccess = Success(3)
  val aFailure = Failure(new RuntimeException("SUPER FAILURE"))

  println(aSuccess)
  println(aFailure)

  def unsafeMethod(): String = throw new RuntimeException("No String for you")

  val potentialFailure = Try(unsafeMethod())
  println(potentialFailure)

  //syntax sugar
  val potFailure = Try{
    //code that might throw
  }

  //utilities
  println(potentialFailure.isSuccess)

  def backupMethod(): String = "A valid result"
  val fallbackTry = Try(unsafeMethod()).orElse(Try(backupMethod()))
  println(fallbackTry)

  //IF you design the api

  def betterUnsafeMethod(): Try[String] = Failure(new RuntimeException)
  def betterBackup(): Try[String] = Success("A valid result")
  val betterFallBack = betterUnsafeMethod() orElse betterBackup()

  //map, flatmap,filter

  println(aSuccess.map(_* 2))
  println(aSuccess.flatMap(x => Success(x*10)))
  println(aSuccess.filter(_ >10))



}
