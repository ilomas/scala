package es.ilm.week1

object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val f: PartialFunction[String, String] = { case "ping" => "pong" }
                                                  //> f  : PartialFunction[String,String] = <function1>

  f("ping")                                       //> res0: String = pong
  f.isDefinedAt("pong")                           //> res1: Boolean = false

  val f2: PartialFunction[List[Int], String] = {
    case Nil => "one"
    case x :: rest =>
    	rest match {
    		case Nil => "two"
    	}
  }                                               //> f2  : PartialFunction[List[Int],String] = <function1>
  f2.isDefinedAt(List(1, 2, 3))                   //> res2: Boolean = true

}