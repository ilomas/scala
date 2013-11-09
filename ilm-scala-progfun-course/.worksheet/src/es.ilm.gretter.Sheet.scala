package es.ilm.gretter

object Sheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(82); 
  println("Welcome to the Scala worksheet");$skip(13); 
  val x = 15;System.out.println("""x  : Int = """ + $show(x ));$skip(31); 
  def increase(i: Int) = i + 1;System.out.println("""increase: (i: Int)Int""");$skip(14); val res$0 = 
  increase(x);System.out.println("""res0: Int = """ + $show(res$0))}
}

// https://gist.github.com/samklr/3793333
// https://github.com/ardlema/scala-higher-order-functions/blob/master/src/main/scala/funsets/FunSets.scala
