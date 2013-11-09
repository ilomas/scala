package es.ilm.week6

object Maps {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(79); 
  println("Welcome to the Scala worksheet");$skip(56); 
  val romanNumbers = Map("I" -> 1, "V" -> 5, "X" -> 10);System.out.println("""romanNumbers  : scala.collection.immutable.Map[String,Int] = """ + $show(romanNumbers ));$skip(87); 
  val capitalOfCountry = Map("US" -> "Washington", "SP" -> "Madrid", "UK" -> "London");System.out.println("""capitalOfCountry  : scala.collection.immutable.Map[String,String] = """ + $show(capitalOfCountry ));$skip(24); val res$0 = 
	capitalOfCountry("US");System.out.println("""res0: String = """ + $show(res$0));$skip(27); val res$1 = 
	capitalOfCountry get "US";System.out.println("""res1: Option[String] = """ + $show(res$1));$skip(140); 
	
	def showCapital(country: String) = capitalOfCountry.get(country) match{
		case Some(capital) => capital
		case None => "missing data"
	};System.out.println("""showCapital: (country: String)String""");$skip(21); val res$2 = 
	
	showCapital("SP");System.out.println("""res2: String = """ + $show(res$2))}
}
