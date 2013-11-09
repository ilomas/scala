package es.ilm.week7

object PouringTest {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(86); 
  println("Welcome to the Scala worksheet");$skip(48); 
  val problem = new Pouring(Vector(4, 7, 9,19));System.out.println("""problem  : es.ilm.week7.Pouring = """ + $show(problem ));$skip(16); val res$0 = 
  problem.moves;System.out.println("""res0: scala.collection.immutable.IndexedSeq[Product with Serializable with es.ilm.week7.PouringTest.problem.Move] = """ + $show(res$0));$skip(23); val res$1 = 
  problem.solution(17);System.out.println("""res1: Stream[es.ilm.week7.PouringTest.problem.Path] = """ + $show(res$1))}
}
