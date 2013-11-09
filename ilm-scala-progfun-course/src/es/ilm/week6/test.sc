package es.ilm.week6

object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val xs = Array(1, 2, 4, 7, 445)                 //> xs  : Array[Int] = Array(1, 2, 4, 7, 445)
  xs map (x => x * 2)                             //> res0: Array[Int] = Array(2, 4, 8, 14, 890)

  val s = "HHOLLello worLSldsdfasdf ZZ"           //> s  : String = HHOLLello worLSldsdfasdf ZZ
  val abc = "abcdefghijklmnopqrstuvwxyz"          //> abc  : String = abcdefghijklmnopqrstuvwxyz
  s filter (c => c.isUpper)                       //> res1: String = HHOLLLSZZ
  s filter (c => c.isSpaceChar)                   //> res2: String = "  "
  s exists (c => c.isUpper)                       //> res3: Boolean = true
  s forall (c => c.isUpper)                       //> res4: Boolean = false

  val r: Range = 1 to 5                           //> r  : Range = Range(1, 2, 3, 4, 5)
  val r2: Range = 0 until 50 by 5                 //> r2  : Range = Range(0, 5, 10, 15, 20, 25, 30, 35, 40, 45)
  val pair = List(1, 2, 3, 4, 5) zip abc          //> pair  : List[(Int, Char)] = List((1,a), (2,b), (3,c), (4,d), (5,e))
  pair.unzip                                      //> res5: (List[Int], List[Char]) = (List(1, 2, 3, 4, 5),List(a, b, c, d, e))

  abc flatMap (c => List('.', c))                 //> res6: String = .a.b.c.d.e.f.g.h.i.j.k.l.m.n.o.p.q.r.s.t.u.v.w.x.y.z

  xs max                                          //> res7: Int = 445

  def isPrime(n: Int): Boolean = (2 until n) forall (d => n % d != 0)
                                                  //> isPrime: (n: Int)Boolean

  isPrime(13)                                     //> res8: Boolean = true

  isPrime(23)                                     //> res9: Boolean = true
}