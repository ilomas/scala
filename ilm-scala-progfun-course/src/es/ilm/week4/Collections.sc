package es.ilm.week4

object Collections {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val aa = List(1, 2, 3, 4, 5)                    //> aa  : List[Int] = List(1, 2, 3, 4, 5)
  val bb = List(10, 11, 12, 13)                   //> bb  : List[Int] = List(10, 11, 12, 13)
  aa.reverse                                      //> res0: List[Int] = List(5, 4, 3, 2, 1)
  aa.last                                         //> res1: Int = 5
  aa.init                                         //> res2: List[Int] = List(1, 2, 3, 4)

  val cc = aa ++ bb                               //> cc  : List[Int] = List(1, 2, 3, 4, 5, 10, 11, 12, 13)
  cc updated (2, "X")                             //> res3: List[Any] = List(1, 2, X, 4, 5, 10, 11, 12, 13)

  cc indexOf (11)                                 //> res4: Int = 6
  cc indexOf (34)                                 //> res5: Int = -1
  cc contains (13)                                //> res6: Boolean = true

  def removeAt(n: Int, xs: List[Int]) = (xs take n) ::: (xs drop n + 1)
                                                  //> removeAt: (n: Int, xs: List[Int])List[Int]

  def isort(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case y :: ys => insert(y, isort(ys))
  }                                               //> isort: (xs: List[Int])List[Int]
  
  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys => if (x <= y) x:: xs else y :: insert(x, ys)
  }                                               //> insert: (x: Int, xs: List[Int])List[Int]

}