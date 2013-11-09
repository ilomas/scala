package funsets

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 * This class is a test suite for the methods in object FunSets. To run
 * the test suite, you can either:
 *  - run the "test" command in the SBT console
 *  - right-click the file in eclipse and chose "Run As" - "JUnit Test"
 */
@RunWith(classOf[JUnitRunner])
class FunSetSuite extends FunSuite {


  /**
   * Link to the scaladoc - very clear and detailed tutorial of FunSuite
   *
   * http://doc.scalatest.org/1.9.1/index.html#org.scalatest.FunSuite
   *
   * Operators
   *  - test
   *  - ignore
   *  - pending
   */

  /**
   * Tests are written using the "test" operator and the "assert" method.
   */
  test("string take") {
    val message = "hello, world"
    assert(message.take(5) == "hello")
  }

  /**
   * For ScalaTest tests, there exists a special equality operator "===" that
   * can be used inside "assert". If the assertion fails, the two values will
   * be printed in the error message. Otherwise, when using "==", the test
   * error message will only say "assertion failed", without showing the values.
   *
   * Try it out! Change the values so that the assertion fails, and look at the
   * error message.
   */
  test("adding ints") {
    assert(1 + 2 === 3)
  }

  
  import FunSets._

  test("contains is implemented") {
    assert(contains(x => true, 100))
  }
  
  /**
   * Returns the union of the two given sets,
   * the sets of all elements that are in either `s` or `t`.
   */
  //def union(s: Set, t: Set): Set = ???
  def union(s: Set, t: Set): Set = {elem: Int => contains(s,elem) || contains(t, elem)}
  
  /**
   * When writing tests, one would often like to re-use certain values for multiple
   * tests. For instance, we would like to create an Int-set and have multiple test
   * about it.
   * 
   * Instead of copy-pasting the code for creating the set into every test, we can
   * store it in the test class using a val:
   * 
   *   val s1 = singletonSet(1)
   * 
   * However, what happens if the method "singletonSet" has a bug and crashes? Then
   * the test methods are not even executed, because creating an instance of the
   * test class fails!
   * 
   * Therefore, we put the shared values into a separate trait (traits are like
   * abstract classes), and create an instance inside each test method.
   * 
   */

  trait TestSets {
    val s1 = singletonSet(1)
    val s2 = singletonSet(2)
    val s3 = singletonSet(3)
    val s4 = singletonSet(4)
    
    val s12 = union(s1,s2)
    val s23 = union(s2,s3)
    val s34 = union(s3,s4)
    val s234 = union(s23,s4)
    val s123 = union(s12,s3)
    val s1234 = union(s123,s4)
    val s124 = union(s12,s4)
    
    val impares = (x: Int) => x % 2 != 0 
    val pares = (x: Int) => x % 2 == 0 
    // [0, 100)
    val s0_49 = (x: Int) => x >= 0 && x < 50 
    // [0, 100]
    val s0_50 = (x: Int) => x >= 0 && x <= 50
  }

  /**
   * This test is currently disabled (by using "ignore") because the method
   * "singletonSet" is not yet implemented and the test would fail.
   * 
   * Once you finish your implementation of "singletonSet", exchange the
   * function "ignore" by "test".
   */
  test("singletonSet(1) contains 1") {
    
    /**
     * We create a new instance of the "TestSets" trait, this gives us access
     * to the values "s1" to "s3". 
     */
    new TestSets {
      /**
       * The string argument of "assert" is a message that is printed in case
       * the test fails. This helps identifying which assertion failed.
       */
      assert(contains(s1, 1), "Singleton")
      assert(!contains(s2, 1), "No contains")
    }
  }

  test("union contains all elements") {
    new TestSets {
      val s = union(s1, s2)
      assert(contains(s, 1), "Union 1")
      assert(contains(s, 2), "Union 2")
      assert(!contains(s, 3), "Union 3")
    }
  }
  
  test("intersect"){
    new TestSets{
      assert(contains(intersect(s12, s123), 2), "Intersect contine 2")
      assert(contains(intersect(s23, s124), 2), "Intersect contine 2")
      assert(!contains(intersect(s12, s123), 3), "Intersect no contiene 3")
    }  
  }
  
  test("diff"){
    new TestSets{   
      val dif1 = diff(s1234, s123)
      val dif2 = diff(s1234, s12)
      assert(!contains(dif1, 3), "diff no contiene 3")
      assert(contains(dif1, 4), "diff contine 4") 
      assert(contains(dif2, 3), "diff contiene 3")
      assert(contains(dif2, 4), "diff contiene 4")
      
    }  
  }
  
  test("filter"){
    new TestSets{   
      
      val fil1 = filter(s123, s1234)
      val fil2 = filter(s12, s1234)
      val fil3 = filter(s23, s124)
      
      assert(contains(fil1, 1), "fil1 contiene 1")
      assert(contains(fil1, 2), "fil1 contiene 2")
      assert(contains(fil1, 3), "fil1 contiene 3")
      assert(!contains(fil1, 4), "fil1 no contine 4") 
      
      assert(contains(fil2, 2), "fil2 no contiene 2")
      assert(!contains(fil2, 4), "fil1 no contiene 3")
      assert(!contains(fil2, 4), "fil2 no contine 4") 
      
      assert(contains(fil3, 2), "fil3 no contiene 2")
      assert(!contains(fil3, 1), "fil3 contiene 1")
      assert(!contains(fil3, 3), "fil3 contiene 3")
    }  
  }
  
  test("forall"){
    new TestSets{ 
      val f49 = (x: Int) => x < 50
      
      assert(forall(s12, s123), "s12 y s123")
      assert(forall(s123, s1234), "s123, s1234")
      assert(!forall(s1234, s123), "NO s1234, s123")
      assert(!forall(s23, s34), "NO s23, s34")
      assert(forall(s23, s234), "s23, s234")
      
      assert(forall(s0_49, f49), "s0_49 contiene los 49")
      assert(!forall(s0_50, f49), "s0_50 contiene 1 mas de 49")
    }
  }
  
  test("exists"){
    new TestSets{ 
      assert(exists(s12, s123), "Entre s12 y s123, 12 esta en 123")
      assert(exists(s123, s1234), "s123, s1234, 123 esta en 1234")
      assert(exists(s34, s1234), "s123, s1234, 123 esta en 1234")
      assert(!exists(s4, s23), "s1234, s123, 4 no esta en 23")
      assert(!exists(s1, s34), "s1, s34, 1 no esta en 34")
      assert(exists(((x: Int) => x == 2 || x == 3), s123), "23 esta en 123")
      assert(!exists(((x: Int) => x == 2 && x == 3 && x == 8), s1234), "238 no esta en 1234")
    }
  }
  
  test("map"){
    new TestSets{ 
      val por10 = (x: Int) => x * 10
      val div2 = (x: Int) => x / 2
      
      val mapPor = map(pares,por10)
      val mapDiv = map(pares,div2)
      
      assert(contains(mapPor, 20) && contains(mapPor, 40) 
          && contains(mapPor, 60) && contains(mapPor, 80), "s1234 por10")
      assert(contains(mapDiv, 1) && contains(mapDiv, 2) && contains(mapDiv, 3) 
          && contains(mapDiv, 4), "Pares div2")
    }
  }
  
}
