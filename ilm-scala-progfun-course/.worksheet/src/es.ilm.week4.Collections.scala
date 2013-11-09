package es.ilm.week4

object Collections {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(86); 
  println("Welcome to the Scala worksheet");$skip(32); 

  val aa = List(1, 2, 3, 4, 5);System.out.println("""aa  : List[Int] = """ + $show(aa ));$skip(32); 
  val bb = List(10, 11, 12, 13);System.out.println("""bb  : List[Int] = """ + $show(bb ));$skip(13); val res$0 = 
  aa.reverse;System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(10); val res$1 = 
  aa.last;System.out.println("""res1: Int = """ + $show(res$1));$skip(10); val res$2 = 
  aa.init;System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(21); 

  val cc = aa ++ bb;System.out.println("""cc  : List[Int] = """ + $show(cc ));$skip(22); val res$3 = 
  cc updated (2, "X");System.out.println("""res3: List[Any] = """ + $show(res$3));$skip(19); val res$4 = 

  cc indexOf (11);System.out.println("""res4: Int = """ + $show(res$4));$skip(18); val res$5 = 
  cc indexOf (34);System.out.println("""res5: Int = """ + $show(res$5));$skip(19); val res$6 = 
  cc contains (13);System.out.println("""res6: Boolean = """ + $show(res$6));$skip(73); 

  def removeAt(n: Int, xs: List[Int]) = (xs take n) ::: (xs drop n + 1);System.out.println("""removeAt: (n: Int, xs: List[Int])List[Int]""");$skip(123); 

  def isort(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case y :: ys => insert(y, isort(ys))
  };System.out.println("""isort: (xs: List[Int])List[Int]""");$skip(157); 
  
  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys => if (x <= y) x:: xs else y :: insert(x, ys)
  };System.out.println("""insert: (x: Int, xs: List[Int])List[Int]""")}

}
