package smartcasts

trait Expr
class Number(val value: Int): Expr
class Sum(val left: Expr, val right: Expr): Expr
class Mult(val left: Expr, val right: Expr): Expr

fun eval(e: Expr): Int {
    if (e is Number)
        return e.value

    if (e is Sum)
        return eval(e.left) + eval(e.right)

    throw IllegalArgumentException(
        "Unknown expression: $e")
}
