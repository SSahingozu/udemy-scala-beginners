//package exercises
//
//import lectures.part2oop.Generics.MyList
//
//abstract class MyList[+A] {
//
//  def head: A
//  def tail: MyList[A]
//  def isEmpty: Boolean
//  def add[B >: A] (element: B): MyList[B]
//  def printElements: String
//
//  override def toString: String = "[" + printElements + "]"
//}
//
//object Empty extends MyList[Nothing]{
//  def head: Nothing = throw new NoSuchElementException
//  def tail: MyList[Nothing] = throw new NoSuchElementException
//  def isEmpty: Boolean = true
//  def add[B >: Nothing](element: B): MyList[B] = new Cons(element, Empty)
//  def printElements: String = ""
//}
//
////class Cons[+A](h: A, t: MyList[A]) extends MyList[A]{
////  def head: A = h
////  def tail: MyList[A] = t
////  def isEmpty: Boolean = false
////  def add[B >: A](element: B): MyList[B] = new Cons(element, this)
//  //def printElements: String =
//    //if(t.isEmpty) "" + h
//    //else h + " " + t.printElements
//}
//
//object ListTest extends App {
//  val list = new Cons(5, Empty)
//  println(list.head)
//
//  val lists: MyList[Int] = new Cons(1, new Cons(2, new Cons(3, Empty)))
//  println(lists.toString)
//
//}
