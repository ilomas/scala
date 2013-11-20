package es.ilm.week2

object Loops {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 
  println("Welcome to the Scala worksheet");$skip(31); 
  val aa = List(1, 2, 3, 4, 5);System.out.println("""aa  : List[Int] = """ + $show(aa ));$skip(32); 
  val bb = List(10, 11, 12, 13);System.out.println("""bb  : List[Int] = """ + $show(bb ));$skip(57); 
  for(i<-1 until 5) println("Interacion del Bucle " + i);$skip(51); 
  for(i<-1 until 3; j<-"abc") println(i + " " + j);$skip(70); 
  
  (1 until 3) foreach(i=> "abc" foreach(j=> println(i + " " + j)))}
  
}
