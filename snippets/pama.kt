package pama

trait Expr
class Number(val value: Int): Expr
class Sum(val left: Expr, val right: Expr): Expr
class Mult(val left: Expr, val right: Expr): Expr

fun eval(e: Expr): Int = when(e) {
    is Number -> e.value
    is Sum -> eval(e.left) + eval(e.right)
    is Mult -> eval(e.left) + eval(e.right)
    else -> throw IllegalArgumentException("Unknown expression: $e")
}
