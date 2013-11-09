package es.ilm.week5

object ListFunctions {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val nums = List(1, 2, -4, 5, 6, -8, 9)          //> nums  : List[Int] = List(1, 2, -4, 5, 6, -8, 9)
  val fruits = List("cucumber", "apple", "orange", "bananna", "pear")
                                                  //> fruits  : List[String] = List(cucumber, apple, orange, bananna, pear)

  nums filter (x => x > 0)                        //> res0: List[Int] = List(1, 2, 5, 6, 9)
  nums filterNot (x => x > 0)                     //> res1: List[Int] = List(-4, -8)
  nums partition (x => x > 0)                     //> res2: (List[Int], List[Int]) = (List(1, 2, 5, 6, 9),List(-4, -8))

  nums takeWhile (x => x > 0)                     //> res3: List[Int] = List(1, 2)
  nums dropWhile (x => x > 0)                     //> res4: List[Int] = List(-4, 5, 6, -8, 9)
  nums span (x => x > 0)                          //> res5: (List[Int], List[Int]) = (List(1, 2),List(-4, 5, 6, -8, 9))

  val data = List("a", "a", "a", "b", "b", "c", "c", "c", "a")
                                                  //> data  : List[String] = List(a, a, a, b, b, c, c, c, a)
  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x :: xs1 =>
      val (first, rest) = xs span (y => y == x)
      first :: pack(rest)
  }                                               //> pack: [T](xs: List[T])List[List[T]]

	def encode[T](xs: List[T]): List[(T,Int)] =
		pack(xs) map (ys => (ys.head,ys.length))
                                                  //> encode: [T](xs: List[T])List[(T, Int)]
	
	pack(data)                                //> res6: List[List[String]] = List(List(a, a, a), List(b, b), List(c, c, c), Li
                                                  //| st(a))
	
	encode(data)                              //> res7: List[(String, Int)] = List((a,3), (b,2), (c,3), (a,1))
	
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