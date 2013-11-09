package es.ilm.week6

import scala.io.Source

object phoneNumbers {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(111); 
  println("Welcome to the Scala worksheet");$skip(112); 
  val in = Source.fromURL("http://lamp.epfl.ch/files/content/sites/lamp/files/teaching/progfun/linuxwords.txt");System.out.println("""in  : scala.io.BufferedSource = """ + $show(in ));$skip(84); 
  val words = in.getLines.toList filter (word => word forall (chr => chr.isLetter));System.out.println("""words  : List[String] = """ + $show(words ));$skip(135); 

  val mnem = Map('2' -> "ABC", '3' -> "DEF", '4' -> "GHI", '5' -> "JKL",
    '6' -> "MNO", '7' -> "PQR", '8' -> "STV", '9' -> "WXYZ");System.out.println("""mnem  : scala.collection.immutable.Map[Char,String] = """ + $show(mnem ));$skip(97); 

  val charCode: Map[Char, Char] =
    for ((digit, str) <- mnem; ltr <- str) yield ltr -> digit;System.out.println("""charCode  : Map[Char,Char] = """ + $show(charCode ));$skip(73); 
  def wordCode(word: String): String =
    word.toUpperCase map charCode;System.out.println("""wordCode: (word: String)String""");$skip(20); val res$0 = 

  wordCode("Java");System.out.println("""res0: String = """ + $show(res$0));$skip(97); 

  val wordsForNum: Map[String, Seq[String]] =
    words groupBy wordCode withDefaultValue Seq();System.out.println("""wordsForNum  : Map[String,Seq[String]] = """ + $show(wordsForNum ));$skip(382); 
    
  def encode(number: String): Set[List[String]] =
          if (number.isEmpty) Set(List())
          else {
                  for {
                          split <- 1 to number.length
                          word <- wordsForNum(number take split)
                          rest <- encode(number drop split)
                  } yield word :: rest
                  }.toSet;System.out.println("""encode: (number: String)Set[List[String]]""");$skip(93); 
 
 def translate(number: String): Set[String] =
         encode(number) map (_ mkString " ");System.out.println("""translate: (number: String)Set[String]""");$skip(43); val res$1 = 
         
         translate("7069739522");System.out.println("""res1: Set[String] = """ + $show(res$1));$skip(33); val res$2 = 
         translate("7069739545");System.out.println("""res2: Set[String] = """ + $show(res$2));$skip(30); val res$3 = 
         translate("9739522");System.out.println("""res3: Set[String] = """ + $show(res$3));$skip(30); val res$4 = 
         translate("9739545");System.out.println("""res4: Set[String] = """ + $show(res$4));$skip(33); val res$5 = 
         translate("7225247386");System.out.println("""res5: Set[String] = """ + $show(res$5));$skip(33); val res$6 = 
         translate("7068643226");System.out.println("""res6: Set[String] = """ + $show(res$6));$skip(30); val res$7 = 
         translate("8643226");System.out.println("""res7: Set[String] = """ + $show(res$7))}
}
