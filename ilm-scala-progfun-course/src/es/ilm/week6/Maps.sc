package es.ilm.week6

object Maps {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val romanNumbers = Map("I" -> 1, "V" -> 5, "X" -> 10)
                                                  //> romanNumbers  : scala.collection.immutable.Map[String,Int] = Map(I -> 1, V -
                                                  //| > 5, X -> 10)
  val capitalOfCountry = Map("US" -> "Washington", "SP" -> "Madrid", "UK" -> "London")
                                                  //> capitalOfCountry  : scala.collection.immutable.Map[String,String] = Map(US -
                                                  //| > Washington, SP -> Madrid, UK -> London)
	capitalOfCountry("US")                    //> res0: String = Washington
	capitalOfCountry get "US"                 //> res1: Option[String] = Some(Washington)
	
	def showCapital(country: String) = capitalOfCountry.get(country) match{
		case Some(capital) => capital
		case None => "missing data"
	}                                         //> showCapital: (country: String)String
	
	showCapital("SP")                         //> res2: String = Madrid
}