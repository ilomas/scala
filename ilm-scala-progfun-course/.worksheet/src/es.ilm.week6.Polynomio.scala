package es.ilm.week6

object Polynomio {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(84); 
  println("Welcome to the Scala worksheet")

  class Poly(val terms0: Map[Int, Double]) {
  	def this(bindings: (Int,Double)*) = this(bindings.toMap)
    val terms = terms0 withDefaultValue 0.0
    def +(other: Poly) = new Poly((other.terms foldLeft terms)(addTerm))
    def addTerm(terms: Map[Int, Double], term: (Int, Double)): Map[Int, Double] = {
      val (exp, coeff) = term
      terms + (exp -> (coeff + terms(exp)))
    }

    override def toString =
      (for ((exp, coeff) <- terms.toList.sorted.reverse) yield coeff + "x^" + exp) mkString " + "
  };$skip(569); 

  val p1 = new Poly(1 -> 2.0, 3 -> 4.0, 5 -> 6.2);System.out.println("""p1  : es.ilm.week6.Polynomio.Poly = """ + $show(p1 ));$skip(45); 
  val p2 = new Poly(Map(0 -> 3.0, 3 -> 7.0));System.out.println("""p2  : es.ilm.week6.Polynomio.Poly = """ + $show(p2 ));$skip(20); 
  val sum = p1 + p2;System.out.println("""sum  : es.ilm.week6.Polynomio.Poly = """ + $show(sum ));$skip(14); val res$0 = 
  p1.terms(7);System.out.println("""res0: Double = """ + $show(res$0))}
}
