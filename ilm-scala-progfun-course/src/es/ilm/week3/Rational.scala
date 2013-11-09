package es.ilm.week3

class Rational(x: Int, y: Int) {
  require(y != 0, "denominator must be nonzero")
  //require(y > 0, "denominator must be positive")

  def this(x: Int) = this(x, 1)

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  private val g = gcd(x, y)
  def numer = x / g
  def denom = y / g

  // 2 formas de hacer less: less y <
  def less(that: Rational) = numer * that.denom < that.numer * denom
  def <(that: Rational) = numer * that.denom < that.numer * denom

  def max(that: Rational) = if (this < that) that else this

  // 2 formas de hacer add: add y +
  def add(that: Rational) =
    new Rational(numer * that.denom + that.numer * denom, denom * that.denom)

  def +(that: Rational) =
    new Rational(numer * that.denom + that.numer * denom, denom * that.denom)

  override def toString = numer + "/" + denom

  // 2 formas de hacer la negacio: neg y unary_-
  def neg: Rational = new Rational(-numer, denom)
  def unary_- : Rational = new Rational(-numer, denom)

  // 2 formas de hacer sub: sub y -
  def sub(that: Rational): Rational = {
    if (that.denom == denom) {
      new Rational(numer - that.numer, denom)
    } else
      new Rational(numer * that.denom - that.numer * denom, denom * that.denom)
  }

  def *(that: Rational) = new Rational(numer * that.numer, denom * that.denom)

  def -(that: Rational) = this + that.neg

  def ^(potencia: Integer): Rational = if (potencia == 1) this else this * this ^ (potencia - 1)
}