package es.ilm.scala.prueba.week4

object Decomposition {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(102); 
  println("Welcome to the Scala worksheet");$skip(115); 

 


	def show(e: Expr) = e match{
		case Number(n) => n.toString
		case Sum(l,r) => show(l) + " + " + show(r)
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
  };System.out.println("""show: (e: <error>)<error>""");$skip(593); 

  def eval(e: Expr): Int =
    if (e.isInstanceOf[Number])
      e.asInstanceOf[Number].numValue
    else if (e.isInstanceOf[Sum])
      eval(e.asInstanceOf[Sum].leftOp) + eval(e.asInstanceOf[Sum].rightOp)
    else throw throw new Error("eval.unknown expression" + e);System.out.println("""eval: (e: <error>)Int""");$skip(29); 

  val num1 = new Number(1);System.out.println("""num1  : <error> = """ + $show(num1 ));$skip(27); 
  val num2 = new Number(2);System.out.println("""num2  : <error> = """ + $show(num2 ));$skip(13); val res$0 = 
  eval(num2);System.out.println("""res0: Int = """ + $show(res$0));$skip(28); val res$1 = 
  eval(new Sum(num1, num2));System.out.println("""res1: <error> = """ + $show(res$1));$skip(31); 
  
  val num3 = new Number2(3);System.out.println("""num3  : es.ilm.scala.prueba.week4.Decomposition.Number2 = """ + $show(num3 ));$skip(28); 
  val num4 = new Number2(4);System.out.println("""num4  : es.ilm.scala.prueba.week4.Decomposition.Number2 = """ + $show(num4 ));$skip(40); 
  
  val sum = new Sum2(num3,num4).eval;System.out.println("""sum  : Int = """ + $show(sum ));$skip(15); 
  println(sum);$skip(107); val res$2 = 
  
  Sum(Number(1), Number(2)) match{
  	case Number(n) => n
  	case Sum(e1,e2) => eval(e1) + eval(e2)
  };System.out.println("""res2: <error> = """ + $show(res$2))}

}
