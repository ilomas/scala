package es.ilm.week3

object intsets {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(82); 
  val tree1 = new NonEmpty(3, Empty, Empty);System.out.println("""tree1  : es.ilm.week3.NonEmpty = """ + $show(tree1 ));$skip(24); 
  val t2 = tree1 incl 4;System.out.println("""t2  : es.ilm.week3.IntSet = """ + $show(t2 ));$skip(21); 
  val t3 = t2 incl 2;System.out.println("""t3  : es.ilm.week3.IntSet = """ + $show(t3 ));$skip(21); 
  val t4 = t3 incl 7;System.out.println("""t4  : es.ilm.week3.IntSet = """ + $show(t4 ));$skip(21); 
  val t5 = t4 incl 6;System.out.println("""t5  : es.ilm.week3.IntSet = """ + $show(t5 ));$skip(43); 

  val t6 = new NonEmpty(17, Empty, Empty);System.out.println("""t6  : es.ilm.week3.NonEmpty = """ + $show(t6 ));$skip(22); 
  val t7 = t6 incl 22;System.out.println("""t7  : es.ilm.week3.IntSet = """ + $show(t7 ));$skip(23); 
  val t8 = t5 union t7;System.out.println("""t8  : es.ilm.week3.IntSet = """ + $show(t8 ));$skip(21); val res$0 = 
  
  t8 contains(12);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(18); val res$1 = 
  t8.contains(17);System.out.println("""res1: Boolean = """ + $show(res$1))}
}
