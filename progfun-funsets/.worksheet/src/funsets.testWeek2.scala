package funsets

object testWeek2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(79); 
  println("Welcome to the Scala worksheet")
  type Set = Int => Boolean;$skip(98); 
  
  def singletonSet(elem: Int): Set = {elem2: Int => elem == elem2};System.out.println("""singletonSet: (elem: Int)Int => Boolean""");$skip(21); val res$0 = 
  
  singletonSet(1);System.out.println("""res0: Int => Boolean = """ + $show(res$0));$skip(19); val res$1 = 
  singletonSet(-2);System.out.println("""res1: Int => Boolean = """ + $show(res$1));$skip(56); 
  
  def contains(s: Set, elem: Int): Boolean = s(elem);System.out.println("""contains: (s: Int => Boolean, elem: Int)Boolean""");$skip(91); 
  
  def union(s: Set, t: Set): Set = {elem: Int => contains(s,elem) || contains(t, elem)};System.out.println("""union: (s: Int => Boolean, t: Int => Boolean)Int => Boolean""");$skip(32); 
  
    val s1 = singletonSet(1);System.out.println("""s1  : Int => Boolean = """ + $show(s1 ));$skip(29); 
    val s2 = singletonSet(2);System.out.println("""s2  : Int => Boolean = """ + $show(s2 ));$skip(29); 
    val s3 = singletonSet(3);System.out.println("""s3  : Int => Boolean = """ + $show(s3 ));$skip(20); val res$2 = 
  
  contains(s1,1);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(23); 
  val u = union(s1,s2);System.out.println("""u  : Int => Boolean = """ + $show(u ));$skip(20); val res$3 = 
  
  contains(u, 2);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(17); val res$4 = 
  contains(u, 3);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(30); 
  
  val i1 = singletonSet(1);System.out.println("""i1  : Int => Boolean = """ + $show(i1 ));$skip(27); 
  val i2 = singletonSet(2);System.out.println("""i2  : Int => Boolean = """ + $show(i2 ));$skip(27); 
  val i3 = singletonSet(3);System.out.println("""i3  : Int => Boolean = """ + $show(i3 ));$skip(27); 
  val i4 = singletonSet(4);System.out.println("""i4  : Int => Boolean = """ + $show(i4 ));$skip(32); 
      
  val u12 = union(i1,i2);System.out.println("""u12  : Int => Boolean = """ + $show(u12 ));$skip(89); 
  
  /**
   * The bounds for `forall` and `exists` are +/- 1000.
   */
  val bound = 100;System.out.println("""bound  : Int = """ + $show(bound ));$skip(187); 
  
  /**
   * Displays the contents of a set
   */
  def toString(s: Set): String = {
    val xs = for (i <- -bound to bound if contains(s, i)) yield i
    xs.mkString("{", ",", "}")
  };System.out.println("""toString: (s: Int => Boolean)String""");$skip(117); 

  /**
   * Prints the contents of a set on the console.
   */
  def printSet(s: Set) {
    println(toString(s))
  };System.out.println("""printSet: (s: Int => Boolean)Unit""");$skip(51); 
  
  // Odd Set
	val oddS = (x: Int) => x % 2 != 0;System.out.println("""oddS  : Int => Boolean = """ + $show(oddS ));$skip(49); 
	// Even Set
	val evenS = (x: Int) => x % 2 == 0;System.out.println("""evenS  : Int => Boolean = """ + $show(evenS ));$skip(54); 
	// [0, 25)
	val s0_24 = (x: Int) => x >= 0 && x < 25;System.out.println("""s0_24  : Int => Boolean = """ + $show(s0_24 ));$skip(55); 
	// [0, 25]
	val s0_25 = (x: Int) => x >= 0 && x <= 25;System.out.println("""s0_25  : Int => Boolean = """ + $show(s0_25 ));$skip(16); 
	printSet(oddS);$skip(17); 
	printSet(evenS);$skip(17); 
	printSet(s0_24);$skip(17); 
	printSet(s0_25)}
}
