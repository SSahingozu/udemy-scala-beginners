package lectures.part2oop

object Exceptions extends App {

  val x: String = null
  //println(x.length) // this will crash with a NPE

  // 1.throwing and catching exceptions

  //val aWeirdValue: String = throw new NullPointerException

  // throwable classes extend the Throwable class
  // Exception and Error are the major Throwable subtypes

  // 2. how to catch the exception

  def getInt(withExceptions: Boolean): Int =
    if (withExceptions) throw new RuntimeException("No int for you!")
    else 42

  val potentialFail = try {
    //code that might throw
    getInt(true)
  } catch {
    case e: RuntimeException => println("caught a Runtime exception")
  } finally {
    // code that will get executed no matter what
    // optional
    // does not influence the return type of this expression
    // use finally only for side effects
    println("finally")
  }

  // 3. how to define your own exception
//  class MyException extends Exception
//  val exception = new MyException
//
//  throw exception

  /*
  1. Crash your program with an OutOfMemoryError
  2. Crash with SOError
  3. PocketCalculator
      -add(x,y)
      -subtract
      -multiply
      -divide

      Throw
        -OverflowException if add exceeds Int.Max_Value
        -UnderflowException if subtract exceeds int.min_value
        -MathCalculationException for division by 0
  */

  //1
  //val array = Array.ofDim[Int](Int.MaxValue)

//  //2
//  def infinity: Int = 1+ infinity
//  val noLimit = infinity

  //3

  class OverflowException extends Exception
  class UnderflowException extends Exception
  class MathCalculationException extends RuntimeException("tried to divide by 0")

  object PocketCalculator {
    def add(x: Int, y: Int) = {
      val result = x + y
      if (x > 0 && y > 0 && result < 0) throw new OverflowException
      else if (x < 0 && y < 0 && result > 0) throw new UnderflowException

      else result
    }
    def subtract(x: Int, y:Int) = {
      val result = x - y
      if (x > 0 && y < 0 && result < 0) throw new OverflowException
      else if (x < 0 && y > 0 && result > 0) throw new UnderflowException
      else result
    }
    def multiply(x: Int, y: Int) = {
      val result = x * y
      if(x > 0 && y > 0 && result < 0) throw new OverflowException
      else if(x < 0 && y < 0 && result < 0) throw new OverflowException
      else if(x > 0 && y < 0 && result > 0) throw new UnderflowException
      else if(x < 0 && y > 0 && result > 0) throw new UnderflowException
      else result
    }
    def divide(x: Int, y: Int) = {
      if (y == 0) throw new MathCalculationException
      else x/y
    }
  }

  println(PocketCalculator.divide(2,0))
}
