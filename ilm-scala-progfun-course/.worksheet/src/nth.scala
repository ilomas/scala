import es.ilm.week4._

object nth {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(128); 
  def nth[T](n: Int, xs: List[T]): T =
    if (n == 0) xs.head
    else nth(n - 1, xs.trail);System.out.println("""nth: [T](n: Int, xs: es.ilm.week4.List[T])T""");$skip(61); 

  val list = new Cons(1, new Cons(2, new Cons(3, new Nil)));System.out.println("""list  : es.ilm.week4.Cons[Int] = """ + $show(list ));$skip(16); val res$0 = 

  nth(2, list);System.out.println("""res0: Int = """ + $show(res$0))}

}
