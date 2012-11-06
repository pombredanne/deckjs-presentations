package extfunc

fun String.iterator() = StringIterator(this)

fun main(args: Array<String>) {
    for (c in "abcd") {
        println(c)
    }
}

class StringIterator(val s : String) : Iterator<Char> {
    private var i = 0
    public override fun next() : Char = s[i++]
    public override val hasNext : Boolean
        get() = i < s.size
}
