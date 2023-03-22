package lectures.part3fp

object WhatsAFunction extends App{

  // use functions as first class elements
  // problem oop

  val superFunctoion = new MyFunction[Int, Int] {
    override def apply(x: Int): Int = x * 2
  }

  println(superFunctoion(2))

  val stringToInt =  new MyFunction[String, Int] {
    override def apply(x: String): Int = x.toInt
  }

  println(stringToInt("3") + 4)

  val adder = new Function2[Int, Int, Int] {
    override def apply(a: Int, b: Int): Int = a+ b
  }


}

trait MyFunction[A, B] {
  def apply(x: A): B
}
