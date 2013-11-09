package es.ilm.week5
import math.Ordering

object mergesort {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(105); 
  println("Welcome to the Scala worksheet");$skip(283); 

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

    };System.out.println("""merge: (xs: List[Int], ys: List[Int])List[Int]""");$skip(441); 

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
  };System.out.println("""msort1: (xs: List[Int])List[Int]""");$skip(466); 

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

  };System.out.println("""msort: [T](xs: List[T])(lt: (T, T) => Boolean)List[T]""");$skip(479); 

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

  };System.out.println("""msort2: [T](xs: List[T])(implicit ord: scala.math.Ordering[T])List[T]""");$skip(469); 

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

  };System.out.println("""msort3: [T](xs: List[T])(implicit ord: scala.math.Ordering[T])List[T]""");$skip(41); 
  val nums = List(1, 2, -4, 5, 6, -8, 9);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(70); 
  val fruits = List("cucumber", "apple", "orange", "bananna", "pear");System.out.println("""fruits  : List[String] = """ + $show(fruits ));$skip(18); val res$0 = 
  
  msort1(nums);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(41); val res$1 = 
  msort(nums)((x: Int, y: Int) => x < y);System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(31); val res$2 = 
  msort(nums)((x, y) => x < y);System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(29); val res$3 = 
  msort2(nums)(Ordering.Int);System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(15); val res$4 = 
  msort3(nums);System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(62); val res$5 = 
  msort(fruits)((x: String, y: String) => x.compareTo(y) < 0);System.out.println("""res5: List[String] = """ + $show(res$5));$skip(34); val res$6 = 
  msort2(fruits)(Ordering.String);System.out.println("""res6: List[String] = """ + $show(res$6));$skip(17); val res$7 = 
  msort3(fruits);System.out.println("""res7: List[String] = """ + $show(res$7))}
}
