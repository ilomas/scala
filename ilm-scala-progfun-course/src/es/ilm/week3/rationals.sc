package es.ilm.week3

object rationals {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val x = new Rational(1, 3)                      //> x  : es.ilm.week3.Rational = 1/3
  val y = new Rational(5, 7)                      //> y  : es.ilm.week3.Rational = 5/7
  val z = new Rational(3, 2)                      //> z  : es.ilm.week3.Rational = 3/2

  def addRational(r: Rational, s: Rational): Rational = {
    new Rational(r.numer * s.denom + s.numer * r.denom, r.denom * s.denom)

  }                                               //> addRational: (r: es.ilm.week3.Rational, s: es.ilm.week3.Rational)es.ilm.week
                                                  //| 3.Rational
  def makeString(r: Rational) = r.numer + "/" + r.denom
                                                  //> makeString: (r: es.ilm.week3.Rational)String

  makeString(addRational(new Rational(1, 2), new Rational(2, 3)))
                                                  //> res0: String = 7/6

  val suma1 = x.add(y)                            //> suma1  : es.ilm.week3.Rational = 22/21
  val suma2 = x + y                               //> suma2  : es.ilm.week3.Rational = 22/21
  x.toString()                                    //> res1: String = 1/3
  suma2.toString()                                //> res2: String = 22/21

  val resta1 = x.sub(y).sub(z)                    //> resta1  : es.ilm.week3.Rational = -79/42
  val resta2 = x - y - z                          //> resta2  : es.ilm.week3.Rational = -79/42
  y.add(y)                                        //> res3: es.ilm.week3.Rational = 10/7
  y + y                                           //> res4: es.ilm.week3.Rational = 10/7
  resta1 + y.neg                                  //> res5: es.ilm.week3.Rational = -109/42
  resta1 + -y                                     //> res6: es.ilm.week3.Rational = -109/42
  /*val strange = new Rational(1,0)
  strange.add(strange) */

  val cons = new Rational(2)                      //> cons  : es.ilm.week3.Rational = 2/1

  val aaa = new Rational(4, 5).numer              //> aaa  : Int = 4
  val bbb = new Rational(1, 2) < (new Rational(2, 3))
                                                  //> bbb  : Boolean = true
  val vx = new Rational(2,3)                      //> vx  : es.ilm.week3.Rational = 2/3
  val mult = vx * vx                              //> mult  : es.ilm.week3.Rational = 4/9
  val pot2 = vx ^ (2)                             //> pot2  : es.ilm.week3.Rational = 4/9
  val pot3 = vx ^ (3)                             //> pot3  : es.ilm.week3.Rational = 16/81
  val pot5 = vx ^ (5)                             //> pot5  : es.ilm.week3.Rational = 65536/43046721
  
  //val expression = ((a+b)^(c^d)) < ((a==>b)|c)
}