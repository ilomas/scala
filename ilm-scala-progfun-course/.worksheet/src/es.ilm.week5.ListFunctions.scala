package es.ilm.week5

object ListFunctions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(88); 
  println("Welcome to the Scala worksheet");$skip(42); 

  val nums = List(1, 2, -4, 5, 6, -8, 9);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(70); 
  val fruits = List("cucumber", "apple", "orange", "bananna", "pear");System.out.println("""fruits  : List[String] = """ + $show(fruits ));$skip(28); val res$0 = 

  nums filter (x => x > 0);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(30); val res$1 = 
  nums filterNot (x => x > 0);System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(30); val res$2 = 
  nums partition (x => x > 0);System.out.println("""res2: (List[Int], List[Int]) = """ + $show(res$2));$skip(31); val res$3 = 

  nums takeWhile (x => x > 0);System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(30); val res$4 = 
  nums dropWhile (x => x > 0);System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(25); val res$5 = 
  nums span (x => x > 0);System.out.println("""res5: (List[Int], List[Int]) = """ + $show(res$5));$skip(64); 

  val data = List("a", "a", "a", "b", "b", "c", "c", "c", "a");System.out.println("""data  : List[String] = """ + $show(data ));$skip(174); 
  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x :: xs1 =>
      val (first, rest) = xs span (y => y == x)
      first :: pack(rest)
  };System.out.println("""pack: [T](xs: List[T])List[List[T]]""");$skip(89); 

	def encode[T](xs: List[T]): List[(T,Int)] =
		pack(xs) map (ys => (ys.head,ys.length));System.out.println("""encode: [T](xs: List[T])List[(T, Int)]""");$skip(14); val res$6 = 
	
	pack(data);System.out.println("""res6: List[List[String]] = """ + $show(res$6));$skip(16); val res$7 = 
	
	encode(data);System.out.println("""res7: List[(String, Int)] = """ + $show(res$7))}
	
	/*abstract class List[t] {
    def map[U](f: T => U): List[U] = this match {
      case Nil => this
      case x :: xs => f(x) :: map(f)
    }
  
	def reduceLeft(op: (T, T) => T): T = this match{
		case Nil=> throw new Error("Nil.reduceLeft")
		case x::xs => (xs foldLeft x)(op)
		
	}
	}
  def filter(p: T=> Boolean): List[T] = this match {
    case Nil => this
    case x :: xs => if (p(x)) x :: xs.filter(p) else filter(p)
  }

  def posElems(xs: List[Int]): List[Int] = xs match {
		case Nil => xs
		case y::ys=> if(y>0) y::posElems(ys) else posElems(ys)
	}

  def squareList(xs: List[Int]): List[Int] = xs match {
    case Nil => Nil
    case y :: ys => y*y :: squareList(ys)
  }
  
  def squareList(xs: List[Int]): List[Int] =
    xs map (x::xs)
  
  def scaleList(xs: List[Double], factor: Double)=
    xs map (x=> x* factor)
  }*/
}
