package lectures.part3fp

import java.util
import scala.util.Random

object Sequences extends App {

  //Seq
  val aSequence = Seq(1,2,3,4)
  println(aSequence)
  println(aSequence.reverse)
  println(aSequence(2))
  println(aSequence ++ Seq(7,6,5))
  println(aSequence.sorted)

  //ranges
  val aRange: Seq[Int] = 1 to 10
  aRange.foreach(println)
  (1 to 10).foreach(println)
  (1 to 10).foreach(x => println("Hello"))

  //lists
  val aList = List(1,2,3)
  val prepended = 42 :: aList // can also use +: instead of :: // only use :: it adding 1 item in
  val appended = aList :+ 89 // can also use :+ instead of ::
  println(prepended)
  println(appended)

  val apples5 = List.fill(5)("apples")
  println(apples5)

  println(aList.mkString("-|-"))

  // arrays

  val numbers = Array(1,2,3,4)
  val threeElements = Array.ofDim[Int](3)
  println(numbers)
  println(threeElements)
  threeElements.foreach(println)

  //mutation
  numbers(2) = 5
  println(numbers.mkString(" "))

  //arrays and seq
  val numbersSeq: Seq[Int] = numbers // implicit conversion
  println(numbersSeq)

  // vectors
  val vector: Vector[Int] = Vector(1,2,3)
  println(vector)

  //vector vs list
  val maxRuns = 1000
  val maxCapacity = 1000000
  def getWriteTime(collection: Seq[Int]): Double = {
    val r = new Random
    val times = for {
      it <- 1 to maxRuns
    } yield {
      val currentTime = System.nanoTime()
      collection.updated(r.nextInt(maxCapacity), r.nextInt())
      System.nanoTime() - currentTime
    }
    times.sum * 1.0 / maxRuns
  }

  val numbersList = (1 to maxCapacity).toList
  val numbersVector = (1 to maxCapacity).toVector

  // keeps reference to tail
  // updating an element in the middle takes long
  println(getWriteTime(numbersList))// speeds 6142854.3ns
  //depth of the tree is small
  //it needs to replace an entire 32 element chunk
  println(getWriteTime(numbersVector))//speed 2133.4ns
}
