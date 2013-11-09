package es.ilm.week6

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 
  println("Welcome to the Scala worksheet");$skip(34); 
  val xs = Array(1, 2, 4, 7, 445);System.out.println("""xs  : Array[Int] = """ + $show(xs ));$skip(22); val res$0 = 
  xs map (x => x * 2);System.out.println("""res0: Array[Int] = """ + $show(res$0));$skip(42); 

  val s = "HHOLLello worLSldsdfasdf ZZ";System.out.println("""s  : String = """ + $show(s ));$skip(41); 
  val abc = "abcdefghijklmnopqrstuvwxyz";System.out.println("""abc  : String = """ + $show(abc ));$skip(28); val res$1 = 
  s filter (c => c.isUpper);System.out.println("""res1: String = """ + $show(res$1));$skip(32); val res$2 = 
  s filter (c => c.isSpaceChar);System.out.println("""res2: String = """ + $show(res$2));$skip(28); val res$3 = 
  s exists (c => c.isUpper);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(28); val res$4 = 
  s forall (c => c.isUpper);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(26); 

  val r: Range = 1 to 5;System.out.println("""r  : Range = """ + $show(r ));$skip(34); 
  val r2: Range = 0 until 50 by 5;System.out.println("""r2  : Range = """ + $show(r2 ));$skip(41); 
  val pair = List(1, 2, 3, 4, 5) zip abc;System.out.println("""pair  : List[(Int, Char)] = """ + $show(pair ));$skip(13); val res$5 = 
  pair.unzip;System.out.println("""res5: (List[Int], List[Char]) = """ + $show(res$5));$skip(36); val res$6 = 

  abc flatMap (c => List('.', c));System.out.println("""res6: String = """ + $show(res$6));$skip(11); val res$7 = 

  xs max;System.out.println("""res7: Int = """ + $show(res$7));$skip(72); 

  def isPrime(n: Int): Boolean = (2 until n) forall (d => n % d != 0);System.out.println("""isPrime: (n: Int)Boolean""");$skip(16); val res$8 = 

  isPrime(13);System.out.println("""res8: Boolean = """ + $show(res$8));$skip(16); val res$9 = 

  isPrime(23);System.out.println("""res9: Boolean = """ + $show(res$9))}
}
