import math.abs

object week2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(85); 
  println("Welcome to the Scala worksheet for Week2");$skip(157); 


def sum(f: Int => Int, a:Int, b:Int):Int = {
	def loop(a:Int, accumulate:Int):Int =
		if (a>b) accumulate
		else loop(a+1,f(a) + accumulate)
		loop(a,0)
};System.out.println("""sum: (f: Int => Int, a: Int, b: Int)Int""");$skip(18); val res$0 = 
sum(x=> x*x, 1,2);System.out.println("""res0: Int = """ + $show(res$0));$skip(18); val res$1 = 
sum(x=> x*x, 3,5);System.out.println("""res1: Int = """ + $show(res$1));$skip(93); 


def product(f:Int=>Int)(a:Int,b:Int): Int = {
	if (a>b) 1
	else f(a) * product(f)(a+1,b)
};System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(22); val res$2 = 
product(x=>x*x)(3, 4);System.out.println("""res2: Int = """ + $show(res$2));$skip(40); 

def fact(n: Int) = product(x=>x)(1, n);System.out.println("""fact: (n: Int)Int""");$skip(8); val res$3 = 
fact(4);System.out.println("""res3: Int = """ + $show(res$3));$skip(162); 

def mapReduce(f: Int => Int, combine:(Int, Int) => Int, zero:Int)(a: Int, b: Int): Int =
	if (a>b) zero
	else combine(f(a), mapReduce(f, combine, zero)(a+1, b));System.out.println("""mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int)Int""");$skip(81); 
def product2(f:Int=>Int)(a:Int,b:Int): Int = mapReduce(f, (x,y) => x*y, 1)(a, b);System.out.println("""product2: (f: Int => Int)(a: Int, b: Int)Int""");$skip(23); val res$4 = 
product2(x=>x*x)(3, 4);System.out.println("""res4: Int = """ + $show(res$4));$skip(25); 


val tolerance = 0.0001;System.out.println("""tolerance  : Double = """ + $show(tolerance ));$skip(74); 

def isCloseEnough(x: Double, y: Double) =
	abs((x-y) / x) /x < tolerance;System.out.println("""isCloseEnough: (x: Double, y: Double)Boolean""");$skip(208); 
def fixedPoint(f: Double => Double)(firstGuess: Double) = {
	def iterate(guess: Double): Double = {
		val next = f(guess)
		if( isCloseEnough(guess, next)) next
		else iterate(next)
	}
	iterate(firstGuess)
};System.out.println("""fixedPoint: (f: Double => Double)(firstGuess: Double)Double""");$skip(24); val res$5 = 
fixedPoint(x=>1+x/2)(1);System.out.println("""res5: Double = """ + $show(res$5));$skip(66); 

def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2;System.out.println("""averageDamp: (f: Double => Double)(x: Double)Double""");$skip(63); 

def sqrtIncitial(x: Double) = fixedPoint(y => (y+x/y) / 2)(1);System.out.println("""sqrtIncitial: (x: Double)Double""");$skip(16); val res$6 = 
sqrtIncitial(2);System.out.println("""res6: Double = """ + $show(res$6));$skip(59); 

def sqrt(x: Double) =
	fixedPoint(averageDamp(y=>x/y))(1);System.out.println("""sqrt: (x: Double)Double""");$skip(25); val res$7 = 
                
sqrt(2);System.out.println("""res7: Double = """ + $show(res$7))}

}
