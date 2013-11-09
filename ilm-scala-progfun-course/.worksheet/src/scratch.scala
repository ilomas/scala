import es.ilm.week3._

object scratch {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(83); 
  println("Welcome to the Scala worksheet");$skip(21); val res$0 = 
  new Rational(1, 2);System.out.println("""res0: es.ilm.week3.Rational = """ + $show(res$0));$skip(49); 

  def error(msg: String) = throw new Error(msg);System.out.println("""error: (msg: String)Nothing""");$skip(45); 

  //error("Error de Prueba")
  val x = null;System.out.println("""x  : Null = """ + $show(x ));$skip(20); 
  val y: String = x;System.out.println("""y  : String = """ + $show(y ));$skip(59); val res$1 = 
  // da error -> val z: Int = null
  if(true) 1 else false;System.out.println("""res1: AnyVal = """ + $show(res$1))}
}
