package lectures.part1basics

import scala.annotation.tailrec
import scala.jdk.Accumulator

object Recursion extends App {

  def factorial(number: Int): Int = {
    if (number <= 1) 1
    else number * factorial(number - 1)
  }
  println(factorial(4))


  def anotherFactorial(n: Int): BigInt = {
    def factHelper(x: Int, accumulator: BigInt): BigInt = {
      if(x <= 1) accumulator
      else factHelper(x-1, x * accumulator) // Tail recursion
    }
    factHelper(n,1)
  }

  def concatenateString(aString: String, times: Int, accumulator: String): String = {
      if (times <= 1) accumulator
      else concatenateString(aString, times-1, aString + accumulator)
  }

  def isPrimeTailRec(number: Int): Boolean = {
    def isPrimeUntil(t: Int, accumulator: Boolean): Boolean = {
      if (!accumulator) false
      else if (t <= 1) true
      else isPrimeUntil(t-1, number % t != 0 && accumulator)
    }
    isPrimeTailRec(number / 2)
  }

  
  def fibbonaci(number: Int): Int = {
    def fibboTail(i: Int, acc: Int, acc2: Int): Int = {
      if (i >= number) acc
      else fibboTail(i+1, acc + acc2, acc)
    }
    if (number<=2) 1
    else fibboTail(2,1,1)
  }

  println(fibbonaci(8))
}
