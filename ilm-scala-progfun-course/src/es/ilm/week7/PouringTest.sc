package es.ilm.week7

object PouringTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val problem = new Pouring(Vector(4, 7, 9,19))   //> problem  : es.ilm.week7.Pouring = es.ilm.week7.Pouring@4760a26f
  problem.moves                                   //> res0: scala.collection.immutable.IndexedSeq[Product with Serializable with e
                                                  //| s.ilm.week7.PouringTest.problem.Move] = Vector(Empty(0), Empty(1), Empty(2),
                                                  //|  Empty(3), Fill(0), Fill(1), Fill(2), Fill(3), Pour(0,1), Pour(0,2), Pour(0,
                                                  //| 3), Pour(1,0), Pour(1,2), Pour(1,3), Pour(2,0), Pour(2,1), Pour(2,3), Pour(3
                                                  //| ,0), Pour(3,1), Pour(3,2))
  problem.solution(17)                            //> res1: Stream[es.ilm.week7.PouringTest.problem.Path] = Stream(Fill(3) Fill(1)
                                                  //|  Pour(1,2) Pour(3,2)-->Vector(0, 0, 9, 17), ?)
}