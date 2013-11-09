package es.ilm.week6

object ListFunctions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(88); 
  println("Welcome to the Scala worksheet");$skip(44); 
  
  val nums = List(1, 2, -4, 5, 6, -8, 9);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(70); 
  val fruits = List("cucumber", "apple", "orange", "bananna", "pear")
  

	/*def posElems(xs: List[Int]): List[Int] = xs match {
		case Nil => xs
		case y::ys=> if(y>0) y::posElems(ys) else posElems(ys)
	}

  def squareList(xs: List[Int]): List[Int] = xs match {
    case Nil => Nil
    case y :: ys => y*y :: squareList(ys)
  }
  
  def squareList(xs: List[Int]): List[Int] =
    xs map (x::xs)
    
    
  abstract class List[t] {
    def map[U](f: T => U): List[U] = this match {
      case Nil => this
      case x :: xs => f(x) :: map(f)
    }*/
  };System.out.println("""fruits  : List[String] = """ + $show(fruits ));$skip(566); 
  
  def scaleList(xs: List[Double], factor: Double)=
    xs map (x=> x* factor);System.out.println("""scaleList: (xs: List[Double], factor: Double)List[Double]""")}
  }
}
