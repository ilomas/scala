package es.ilm.week1

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(79); 
  println("Welcome to the Scala worksheet");$skip(70); 

  val f: PartialFunction[String, String] = { case "ping" => "pong" };System.out.println("""f  : PartialFunction[String,String] = """ + $show(f ));$skip(13); val res$0 = 

  f("ping");System.out.println("""res0: String = """ + $show(res$0));$skip(24); val res$1 = 
  f.isDefinedAt("pong");System.out.println("""res1: Boolean = """ + $show(res$1));$skip(147); 

  val f2: PartialFunction[List[Int], String] = {
    case Nil => "one"
    case x :: rest =>
    	rest match {
    		case Nil => "two"
    	}
  };System.out.println("""f2  : PartialFunction[List[Int],String] = """ + $show(f2 ));$skip(32); val res$2 = 
  f2.isDefinedAt(List(1, 2, 3));System.out.println("""res2: Boolean = """ + $show(res$2))}

}
