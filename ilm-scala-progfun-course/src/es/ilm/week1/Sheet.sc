package es.ilm.gretter

object Sheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val x = 15                                      //> x  : Int = 15
  def increase(i: Int) = i + 1                    //> increase: (i: Int)Int
  increase(x)                                     //> res0: Int = 16
}

// https://gist.github.com/samklr/3793333
// https://github.com/ardlema/scala-higher-order-functions/blob/master/src/main/scala/funsets/FunSets.scala