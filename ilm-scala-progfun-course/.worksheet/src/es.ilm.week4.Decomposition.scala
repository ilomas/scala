package es.ilm.week4

object Decomposition {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(89); 
  println("Welcome to the Scala worksheet")

  trait Expr
    case class Number(n: Int) extends Expr
    case class Sum(l: Expr, r: Expr) extends Expr;$skip(241); 
  
  
  def show(e: Expr): String = e match {
    case Number(x) => x.toString
    case Sum(l, r) => show(l) + " + " + show(r)
  }

  trait Expr2 {
    def eval: Int
    def show: String
  }

  class Number2(n: Int) extends Expr2 {
    def eval: Int = n
    def show: String = n.toString()
  }

  class Sum2(e1: Expr2, e2: Expr2) extends Expr2 {
    def eval: Int = e1.eval + e2.eval
    def show: String = e1.eval.toString() + e2.eval.toString()
  };System.out.println("""show: (e: es.ilm.week4.Decomposition.Expr)String""");$skip(623); 

  /*def eval(e: Expr2): Int =
    if (e.isInstanceOf[Number])
      e.asInstanceOf[Number].value
    else if (e.isInstanceOf[Sum])
      eval(e.asInstanceOf[Sum].leftOp) + eval(e.asInstanceOf[Sum].rightOp)
    else throw throw new Error("eval.unknown expression" + e)
*/
  val num1 = new Number(1);System.out.println("""num1  : es.ilm.week4.Decomposition.Number = """ + $show(num1 ));$skip(27); 
  val num2 = new Number(2);System.out.println("""num2  : es.ilm.week4.Decomposition.Number = """ + $show(num2 ));$skip(75); 
  //eval(num2)
  //eval(new Sum(num1, num2))

  val num3 = new Number2(3);System.out.println("""num3  : es.ilm.week4.Decomposition.Number2 = """ + $show(num3 ));$skip(28); 
  val num4 = new Number2(4);System.out.println("""num4  : es.ilm.week4.Decomposition.Number2 = """ + $show(num4 ));$skip(40); 

  val sum = new Sum2(num3, num4).eval;System.out.println("""sum  : Int = """ + $show(sum ));$skip(15); 
  println(sum)}

}
