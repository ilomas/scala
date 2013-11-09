package es.ilm.week3

object rationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(84); 
  println("Welcome to the Scala worksheet");$skip(30); 

  val x = new Rational(1, 3);System.out.println("""x  : es.ilm.week3.Rational = """ + $show(x ));$skip(29); 
  val y = new Rational(5, 7);System.out.println("""y  : es.ilm.week3.Rational = """ + $show(y ));$skip(29); 
  val z = new Rational(3, 2);System.out.println("""z  : es.ilm.week3.Rational = """ + $show(z ));$skip(139); 

  def addRational(r: Rational, s: Rational): Rational = {
    new Rational(r.numer * s.denom + s.numer * r.denom, r.denom * s.denom)

  };System.out.println("""addRational: (r: es.ilm.week3.Rational, s: es.ilm.week3.Rational)es.ilm.week3.Rational""");$skip(56); 
  def makeString(r: Rational) = r.numer + "/" + r.denom;System.out.println("""makeString: (r: es.ilm.week3.Rational)String""");$skip(67); val res$0 = 

  makeString(addRational(new Rational(1, 2), new Rational(2, 3)));System.out.println("""res0: String = """ + $show(res$0));$skip(24); 

  val suma1 = x.add(y);System.out.println("""suma1  : es.ilm.week3.Rational = """ + $show(suma1 ));$skip(20); 
  val suma2 = x + y;System.out.println("""suma2  : es.ilm.week3.Rational = """ + $show(suma2 ));$skip(15); val res$1 = 
  x.toString();System.out.println("""res1: String = """ + $show(res$1));$skip(19); val res$2 = 
  suma2.toString();System.out.println("""res2: String = """ + $show(res$2));$skip(32); 

  val resta1 = x.sub(y).sub(z);System.out.println("""resta1  : es.ilm.week3.Rational = """ + $show(resta1 ));$skip(25); 
  val resta2 = x - y - z;System.out.println("""resta2  : es.ilm.week3.Rational = """ + $show(resta2 ));$skip(11); val res$3 = 
  y.add(y);System.out.println("""res3: es.ilm.week3.Rational = """ + $show(res$3));$skip(8); val res$4 = 
  y + y;System.out.println("""res4: es.ilm.week3.Rational = """ + $show(res$4));$skip(17); val res$5 = 
  resta1 + y.neg;System.out.println("""res5: es.ilm.week3.Rational = """ + $show(res$5));$skip(14); val res$6 = 
  resta1 + -y;System.out.println("""res6: es.ilm.week3.Rational = """ + $show(res$6));$skip(92); 
  /*val strange = new Rational(1,0)
  strange.add(strange) */

  val cons = new Rational(2);System.out.println("""cons  : es.ilm.week3.Rational = """ + $show(cons ));$skip(38); 

  val aaa = new Rational(4, 5).numer;System.out.println("""aaa  : Int = """ + $show(aaa ));$skip(54); 
  val bbb = new Rational(1, 2) < (new Rational(2, 3));System.out.println("""bbb  : Boolean = """ + $show(bbb ));$skip(29); 
  val vx = new Rational(2,3);System.out.println("""vx  : es.ilm.week3.Rational = """ + $show(vx ));$skip(21); 
  val mult = vx * vx;System.out.println("""mult  : es.ilm.week3.Rational = """ + $show(mult ));$skip(22); 
  val pot2 = vx ^ (2);System.out.println("""pot2  : es.ilm.week3.Rational = """ + $show(pot2 ));$skip(22); 
  val pot3 = vx ^ (3);System.out.println("""pot3  : es.ilm.week3.Rational = """ + $show(pot3 ));$skip(22); 
  val pot5 = vx ^ (5);System.out.println("""pot5  : es.ilm.week3.Rational = """ + $show(pot5 ))}
  
  //val expression = ((a+b)^(c^d)) < ((a==>b)|c)
}
