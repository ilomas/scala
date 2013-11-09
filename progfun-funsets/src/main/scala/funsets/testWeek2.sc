package funsets

object testWeek2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  type Set = Int => Boolean
  
  def singletonSet(elem: Int): Set = {elem2: Int => elem == elem2}
                                                  //> singletonSet: (elem: Int)Int => Boolean
  
  singletonSet(1)                                 //> res0: Int => Boolean = <function1>
  singletonSet(-2)                                //> res1: Int => Boolean = <function1>
  
  def contains(s: Set, elem: Int): Boolean = s(elem)
                                                  //> contains: (s: Int => Boolean, elem: Int)Boolean
  
  def union(s: Set, t: Set): Set = {elem: Int => contains(s,elem) || contains(t, elem)}
                                                  //> union: (s: Int => Boolean, t: Int => Boolean)Int => Boolean
  
    val s1 = singletonSet(1)                      //> s1  : Int => Boolean = <function1>
    val s2 = singletonSet(2)                      //> s2  : Int => Boolean = <function1>
    val s3 = singletonSet(3)                      //> s3  : Int => Boolean = <function1>
  
  contains(s1,1)                                  //> res2: Boolean = true
  val u = union(s1,s2)                            //> u  : Int => Boolean = <function1>
  
  contains(u, 2)                                  //> res3: Boolean = true
  contains(u, 3)                                  //> res4: Boolean = false
  
  val i1 = singletonSet(1)                        //> i1  : Int => Boolean = <function1>
  val i2 = singletonSet(2)                        //> i2  : Int => Boolean = <function1>
  val i3 = singletonSet(3)                        //> i3  : Int => Boolean = <function1>
  val i4 = singletonSet(4)                        //> i4  : Int => Boolean = <function1>
      
  val u12 = union(i1,i2)                          //> u12  : Int => Boolean = <function1>
  
  /**
   * The bounds for `forall` and `exists` are +/- 1000.
   */
  val bound = 100                                 //> bound  : Int = 100
  
  /**
   * Displays the contents of a set
   */
  def toString(s: Set): String = {
    val xs = for (i <- -bound to bound if contains(s, i)) yield i
    xs.mkString("{", ",", "}")
  }                                               //> toString: (s: Int => Boolean)String

  /**
   * Prints the contents of a set on the console.
   */
  def printSet(s: Set) {
    println(toString(s))
  }                                               //> printSet: (s: Int => Boolean)Unit
  
  // Odd Set
	val oddS = (x: Int) => x % 2 != 0         //> oddS  : Int => Boolean = <function1>
	// Even Set
	val evenS = (x: Int) => x % 2 == 0        //> evenS  : Int => Boolean = <function1>
	// [0, 25)
	val s0_24 = (x: Int) => x >= 0 && x < 25  //> s0_24  : Int => Boolean = <function1>
	// [0, 25]
	val s0_25 = (x: Int) => x >= 0 && x <= 25 //> s0_25  : Int => Boolean = <function1>
	printSet(oddS)                            //> {-99,-97,-95,-93,-91,-89,-87,-85,-83,-81,-79,-77,-75,-73,-71,-69,-67,-65,-6
                                                  //| 3,-61,-59,-57,-55,-53,-51,-49,-47,-45,-43,-41,-39,-37,-35,-33,-31,-29,-27,-
                                                  //| 25,-23,-21,-19,-17,-15,-13,-11,-9,-7,-5,-3,-1,1,3,5,7,9,11,13,15,17,19,21,2
                                                  //| 3,25,27,29,31,33,35,37,39,41,43,45,47,49,51,53,55,57,59,61,63,65,67,69,71,7
                                                  //| 3,75,77,79,81,83,85,87,89,91,93,95,97,99}
	printSet(evenS)                           //> {-100,-98,-96,-94,-92,-90,-88,-86,-84,-82,-80,-78,-76,-74,-72,-70,-68,-66,-
                                                  //| 64,-62,-60,-58,-56,-54,-52,-50,-48,-46,-44,-42,-40,-38,-36,-34,-32,-30,-28,
                                                  //| -26,-24,-22,-20,-18,-16,-14,-12,-10,-8,-6,-4,-2,0,2,4,6,8,10,12,14,16,18,20
                                                  //| ,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50,52,54,56,58,60,62,64,66,68,70
                                                  //| ,72,74,76,78,80,82,84,86,88,90,92,94,96,98,100}
	printSet(s0_24)                           //> {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24}
	printSet(s0_25)                           //> {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25}
}