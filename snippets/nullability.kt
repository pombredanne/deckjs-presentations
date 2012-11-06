package nullability

import java.io.File

fun foo() {
val f = File("readme.txt")
println("$f has ${f.listFiles().size} children")
}

fun bar() {
val f = File("readme.txt")
val files = f.listFiles()
if (files != null) {
    println("$f has ${files.size} children")
}
}

