package es.ilm.week4

object Decomposition {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  trait Expr
    case class Number(n: Int) extends Expr
    case class Sum(l: Expr, r: Expr) extends Expr
  
  
  def show(e: Expr): String = e match {
    case Number(x) => x.toString
    case Sum(l, r) => show(l) + " + " + show(r)
  }                                               //> show: (e: es.ilm.week4.Decomposition.Expr)String

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
  }

  /*def eval(e: Expr2): Int =
    if (e.isInstanceOf[Number])
      e.asInstanceOf[Number].value
    else if (e.isInstanceOf[Sum])
      eval(e.asInstanceOf[Sum].leftOp) + eval(e.asInstanceOf[Sum].rightOp)
    else throw throw new Error("eval.unknown expression" + e)
*/
  val num1 = new Number(1)                        //> num1  : es.ilm.week4.Decomposition.Number = Number(1)
  val num2 = new Number(2)                        //> num2  : es.ilm.week4.Decomposition.Number = Number(2)
  //eval(num2)
  //eval(new Sum(num1, num2))

  val num3 = new Number2(3)                       //> num3  : es.ilm.week4.Decomposition.Number2 = es.ilm.week4.Decomposition$$an
                                                  //| onfun$main$1$Number2$1@21a80a69
  val num4 = new Number2(4)                       //> num4  : es.ilm.week4.Decomposition.Number2 = es.ilm.week4.Decomposition$$an
                                                  //| onfun$main$1$Number2$1@1f4384c2

  val sum = new Sum2(num3, num4).eval             //> sum  : Int = 7
  println(sum)                                    //> 7

}