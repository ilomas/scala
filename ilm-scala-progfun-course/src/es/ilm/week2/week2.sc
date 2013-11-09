import math.abs

object week2 {
  println("Welcome to the Scala worksheet for Week2")
                                                  //> Welcome to the Scala worksheet for Week2


def sum(f: Int => Int, a:Int, b:Int):Int = {
	def loop(a:Int, accumulate:Int):Int =
		if (a>b) accumulate
		else loop(a+1,f(a) + accumulate)
		loop(a,0)
}                                                 //> sum: (f: Int => Int, a: Int, b: Int)Int
sum(x=> x*x, 1,2)                                 //> res0: Int = 5
sum(x=> x*x, 3,5)                                 //> res1: Int = 50


def product(f:Int=>Int)(a:Int,b:Int): Int = {
	if (a>b) 1
	else f(a) * product(f)(a+1,b)
}                                                 //> product: (f: Int => Int)(a: Int, b: Int)Int
product(x=>x*x)(3, 4)                             //> res2: Int = 144

def fact(n: Int) = product(x=>x)(1, n)            //> fact: (n: Int)Int
fact(4)                                           //> res3: Int = 24

def mapReduce(f: Int => Int, combine:(Int, Int) => Int, zero:Int)(a: Int, b: Int): Int =
	if (a>b) zero
	else combine(f(a), mapReduce(f, combine, zero)(a+1, b))
                                                  //> mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b:
                                                  //|  Int)Int
def product2(f:Int=>Int)(a:Int,b:Int): Int = mapReduce(f, (x,y) => x*y, 1)(a, b)
                                                  //> product2: (f: Int => Int)(a: Int, b: Int)Int
product2(x=>x*x)(3, 4)                            //> res4: Int = 144


val tolerance = 0.0001                            //> tolerance  : Double = 1.0E-4

def isCloseEnough(x: Double, y: Double) =
	abs((x-y) / x) /x < tolerance             //> isCloseEnough: (x: Double, y: Double)Boolean
def fixedPoint(f: Double => Double)(firstGuess: Double) = {
	def iterate(guess: Double): Double = {
		val next = f(guess)
		if( isCloseEnough(guess, next)) next
		else iterate(next)
	}
	iterate(firstGuess)
}                                                 //> fixedPoint: (f: Double => Double)(firstGuess: Double)Double
fixedPoint(x=>1+x/2)(1)                           //> res5: Double = 1.999755859375

def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2
                                                  //> averageDamp: (f: Double => Double)(x: Double)Double

def sqrtIncitial(x: Double) = fixedPoint(y => (y+x/y) / 2)(1)
                                                  //> sqrtIncitial: (x: Double)Double
sqrtIncitial(2)                                   //> res6: Double = 1.4142135623746899

def sqrt(x: Double) =
	fixedPoint(averageDamp(y=>x/y))(1)        //> sqrt: (x: Double)Double
                
sqrt(2)                                           //> res7: Double = 1.4142135623746899

}