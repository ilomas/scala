package es.ilm.week2

object Loops {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val aa = List(1, 2, 3, 4, 5)                    //> aa  : List[Int] = List(1, 2, 3, 4, 5)
  val bb = List(10, 11, 12, 13)                   //> bb  : List[Int] = List(10, 11, 12, 13)
  val c1 = "hola"                                 //> c1  : String = hola
  val c2 = "como"                                 //> c2  : String = como
  val c3 = "estas"                                //> c3  : String = estas
  val c: List[String] = List(c1, c2, c3)          //> c  : List[String] = List(hola, como, estas)

  for (elem <- c) {
    println("elemento: " + elem)                  //> elemento: hola
                                                  //| elemento: como
                                                  //| elemento: estas
  }

  for (i <- 1 until 5) println("Interacion del Bucle " + i)
                                                  //> Interacion del Bucle 1
                                                  //| Interacion del Bucle 2
                                                  //| Interacion del Bucle 3
                                                  //| Interacion del Bucle 4
  for (i <- 1 until 3; j <- "abc") println(i + " " + j)
                                                  //> 1 a
                                                  //| 1 b
                                                  //| 1 c
                                                  //| 2 a
                                                  //| 2 b
                                                  //| 2 c

  (1 until 3) foreach (i => "abc" foreach (j => println(i + " " + j)))
                                                  //> 1 a
                                                  //| 1 b
                                                  //| 1 c
                                                  //| 2 a
                                                  //| 2 b
                                                  //| 2 c

}