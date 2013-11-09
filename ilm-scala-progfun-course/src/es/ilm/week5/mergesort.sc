package es.ilm.week5
import math.Ordering

object mergesort {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def merge(xs: List[Int], ys: List[Int]): List[Int] =
    xs match {
      case Nil => ys
      case x :: xs1 =>
        ys match {
          case Nil => xs
          case y :: ys1 =>
            if (x < y) x :: merge(xs1, ys)
            else y :: merge(xs, xs1)
        }

    }                                             //> merge: (xs: List[Int], ys: List[Int])List[Int]

  def msort1(xs: List[Int]): List[Int] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[Int], ys: List[Int]): List[Int] = (xs, ys) match {
        case (Nil, ys) => ys
        case (xs, Nil) => xs
        case (x :: xs1, y :: ys1) =>
          if (x < y) x :: merge(xs1, ys)
          else y :: merge(xs, ys1)

      }

      val (fst, snd) = xs splitAt n
      merge(msort1(fst), msort1(snd))
    }
  }                                               //> msort1: (xs: List[Int])List[Int]

  def msort[T](xs: List[T])(lt: (T, T) => Boolean): List[T] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[T], ys: List[T]): List[T] = (xs, ys) match {
        case (Nil, ys) => ys
        case (xs, Nil) => xs
        case (x :: xs1, y :: ys1) =>
          if (lt(x, y)) x :: merge(xs1, ys)
          else y :: merge(xs, ys1)

      }

      val (fst, snd) = xs splitAt n
      merge(msort(fst)(lt), msort(snd)(lt))
    }

  }                                               //> msort: [T](xs: List[T])(lt: (T, T) => Boolean)List[T]

  def msort2[T](xs: List[T])(implicit ord: Ordering[T]): List[T] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[T], ys: List[T]): List[T] = (xs, ys) match {
        case (Nil, ys) => ys
        case (xs, Nil) => xs
        case (x :: xs1, y :: ys1) =>
          if (ord.lt(x, y)) x :: merge(xs1, ys)
          else y :: merge(xs, ys1)

      }

      val (fst, snd) = xs splitAt n
      merge(msort2(fst)(ord), msort2(snd)(ord))
    }

  }                                               //> msort2: [T](xs: List[T])(implicit ord: scala.math.Ordering[T])List[T]

  def msort3[T](xs: List[T])(implicit ord: Ordering[T]): List[T] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[T], ys: List[T]): List[T] = (xs, ys) match {
        case (Nil, ys) => ys
        case (xs, Nil) => xs
        case (x :: xs1, y :: ys1) =>
          if (ord.lt(x, y)) x :: merge(xs1, ys)
          else y :: merge(xs, ys1)

      }

      val (fst, snd) = xs splitAt n
      merge(msort3(fst), msort3(snd))
    }

  }                                               //> msort3: [T](xs: List[T])(implicit ord: scala.math.Ordering[T])List[T]
  val nums = List(1, 2, -4, 5, 6, -8, 9)          //> nums  : List[Int] = List(1, 2, -4, 5, 6, -8, 9)
  val fruits = List("cucumber", "apple", "orange", "bananna", "pear")
                                                  //> fruits  : List[String] = List(cucumber, apple, orange, bananna, pear)
  
  msort1(nums)                                    //> res0: List[Int] = List(-8, -4, 1, 2, 5, 6, 9)
  msort(nums)((x: Int, y: Int) => x < y)          //> res1: List[Int] = List(-8, -4, 1, 2, 5, 6, 9)
  msort(nums)((x, y) => x < y)                    //> res2: List[Int] = List(-8, -4, 1, 2, 5, 6, 9)
  msort2(nums)(Ordering.Int)                      //> res3: List[Int] = List(-8, -4, 1, 2, 5, 6, 9)
  msort3(nums)                                    //> res4: List[Int] = List(-8, -4, 1, 2, 5, 6, 9)
  msort(fruits)((x: String, y: String) => x.compareTo(y) < 0)
                                                  //> res5: List[String] = List(apple, bananna, cucumber, orange, pear)
  msort2(fruits)(Ordering.String)                 //> res6: List[String] = List(apple, bananna, cucumber, orange, pear)
  msort3(fruits)                                  //> res7: List[String] = List(apple, bananna, cucumber, orange, pear)
}