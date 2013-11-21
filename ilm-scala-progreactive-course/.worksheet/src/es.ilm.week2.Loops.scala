package es.ilm.week2

object Loops {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 
  println("Welcome to the Scala worksheet");$skip(31); 
  val aa = List(1, 2, 3, 4, 5);System.out.println("""aa  : List[Int] = """ + $show(aa ));$skip(32); 
  val bb = List(10, 11, 12, 13);System.out.println("""bb  : List[Int] = """ + $show(bb ));$skip(18); 
  val c1 = "hola";System.out.println("""c1  : String = """ + $show(c1 ));$skip(18); 
  val c2 = "como";System.out.println("""c2  : String = """ + $show(c2 ));$skip(19); 
  val c3 = "estas";System.out.println("""c3  : String = """ + $show(c3 ));$skip(41); 
  val c: List[String] = List(c1, c2, c3);System.out.println("""c  : List[String] = """ + $show(c ));$skip(54); 

  for (elem <- c) {
    println("elemento: " + elem)
  };$skip(65); 

  for (i <- 1 until 5) println("Interacion del Bucle " + i);$skip(56); 
  for (i <- 1 until 3; j <- "abc") println(i + " " + j);$skip(72); 

  (1 until 3) foreach (i => "abc" foreach (j => println(i + " " + j)))}

}
