import es.ilm.week3._

object scratch {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  new Rational(1, 2)                              //> res0: es.ilm.week3.Rational = 1/2

  def error(msg: String) = throw new Error(msg)   //> error: (msg: String)Nothing

  //error("Error de Prueba")
  val x = null                                    //> x  : Null = null
  val y: String = x                               //> y  : String = null
  // da error -> val z: Int = null
  if(true) 1 else false                           //> res1: AnyVal = 1
}