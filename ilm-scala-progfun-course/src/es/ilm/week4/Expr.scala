package es.ilm.week4

trait Expr {
  def isNumber: Boolean
  def isSum: Boolean
  def isProd: Boolean
  def isVar: Boolean
  def name: String
  def numValue: Int
  def leftOp: Expr
  def rightOp: Expr
}

class Number(n: Int) extends Expr {
  def isNumber: Boolean = true
  def isSum: Boolean = false
  def isProd: Boolean = false
  def isVar: Boolean = false
  def numValue: Int = n
  def name: String = throw new Error("Number.name")
  def leftOp: Expr = throw new Error("Number.leftOp")
  def rightOp: Expr = throw new Error("Number.rightOp")
}

class Sum(e1: Expr, e2: Expr) extends Expr {
  def isNumber: Boolean = false
  def isSum: Boolean = true
  def isProd: Boolean = false
  def isVar: Boolean = false
  def name: String = throw new Error("Number.name")
  def numValue: Int = throw new Error("Sum.numValue")
  def leftOp: Expr = e1
  def rightOp: Expr = e2
}

class Prod(e1: Expr, e2: Expr) extends Expr {
  def isNumber: Boolean = false
  def isSum: Boolean = false
  def isProd: Boolean = true
  def isVar: Boolean = false
  def name: String = throw new Error("Number.name")
  def numValue: Int = throw new Error("Prod.numValue")
  def leftOp: Expr = e1
  def rightOp: Expr = e2
}

class Var(x: String) extends Expr {
  def isNumber: Boolean = false
  def isSum: Boolean = false
  def isProd: Boolean = false
  def isVar: Boolean = true
  def name: String = x
  def numValue: Int = throw new Error("Var.numValue")
  def leftOp: Expr = throw new Error("Number.leftOp")
  def rightOp: Expr = throw new Error("Number.rightOp")
}