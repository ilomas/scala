package es.ilm.week6

import scala.io.Source

object phoneNumbers {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val in = Source.fromURL("http://lamp.epfl.ch/files/content/sites/lamp/files/teaching/progfun/linuxwords.txt")
                                                  //> in  : scala.io.BufferedSource = non-empty iterator
  val words = in.getLines.toList filter (word => word forall (chr => chr.isLetter))
                                                  //> words  : List[String] = List()

  val mnem = Map('2' -> "ABC", '3' -> "DEF", '4' -> "GHI", '5' -> "JKL",
    '6' -> "MNO", '7' -> "PQR", '8' -> "STV", '9' -> "WXYZ")
                                                  //> mnem  : scala.collection.immutable.Map[Char,String] = Map(8 -> STV, 4 -> GHI
                                                  //| , 9 -> WXYZ, 5 -> JKL, 6 -> MNO, 2 -> ABC, 7 -> PQR, 3 -> DEF)

  val charCode: Map[Char, Char] =
    for ((digit, str) <- mnem; ltr <- str) yield ltr -> digit
                                                  //> charCode  : Map[Char,Char] = Map(E -> 3, X -> 9, N -> 6, T -> 8, Y -> 9, J -
                                                  //| > 5, F -> 3, A -> 2, M -> 6, I -> 4, G -> 4, V -> 8, Q -> 7, L -> 5, B -> 2,
                                                  //|  P -> 7, C -> 2, H -> 4, W -> 9, K -> 5, R -> 7, O -> 6, D -> 3, Z -> 9, S -
                                                  //| > 8)
  def wordCode(word: String): String =
    word.toUpperCase map charCode                 //> wordCode: (word: String)String

  wordCode("Java")                                //> res0: String = 5282

  val wordsForNum: Map[String, Seq[String]] =
    words groupBy wordCode withDefaultValue Seq() //> wordsForNum  : Map[String,Seq[String]] = Map()
    
  def encode(number: String): Set[List[String]] =
          if (number.isEmpty) Set(List())
          else {
                  for {
                          split <- 1 to number.length
                          word <- wordsForNum(number take split)
                          rest <- encode(number drop split)
                  } yield word :: rest
                  }.toSet                         //> encode: (number: String)Set[List[String]]
 
 def translate(number: String): Set[String] =
         encode(number) map (_ mkString " ")      //> translate: (number: String)Set[String]
         
         translate("7069739522")                  //> res1: Set[String] = Set()
         translate("7069739545")                  //> res2: Set[String] = Set()
         translate("9739522")                     //> res3: Set[String] = Set()
         translate("9739545")                     //> res4: Set[String] = Set()
         translate("7225247386")                  //> res5: Set[String] = Set()
         translate("7068643226")                  //> res6: Set[String] = Set()
         translate("8643226")                     //> res7: Set[String] = Set()
}