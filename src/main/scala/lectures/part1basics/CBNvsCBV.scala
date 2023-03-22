package lectures.part1basics

object CBNvsCBV extends App {

  def calledByValue(x: Long): Unit ={
    println("by value: " + x)
    println("by value: " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
  }

  calledByValue(System.nanoTime())// calls system.nanottime first then does it
  calledByName(System.nanoTime()) // calls it as it is needed => delays the evaluation as used
  
  def infinte(): Int = 1 + infinte()
  def printFirst(x: Int, y: => Int) = println(x)
  
  printFirst(34, infinte())
  //printFirst(infinte(), 34)
}
