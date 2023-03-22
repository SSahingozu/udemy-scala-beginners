package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }
  println(aFunction("hello", 3))


  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello",3))

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a+b

    aSmallerFunction(n, n-1)
  }


  def greetingMessage(name: String, age: Int) = {
    println("Hi, my name is " + name + " and I am " + age + " years old.")
  }
  greetingMessage("Sevkan", 25)

  def factorial(number: Int): Int ={
    if (number <= 0) 1
    else number * factorial(number - 1)
  }
  println(factorial(4))

  def fibbonaci(number: Int): Int ={
    if (number <= 2) 1
    else fibbonaci(number - 1) + fibbonaci(number - 2)
  }
  println(fibbonaci(8))

  def isPrime(number: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean ={
      if (t <= 1) true
      else number % t != 0 && isPrimeUntil(t-1)
    }
    isPrimeUntil(number/2)
  }

  println(isPrime(2000))
}