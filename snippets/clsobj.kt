package clsobj

trait Factory<T> { fun create(): T }

class Example() {
    class object : Factory<Example> {
        override fun create() = Example()
    }
}

val e1 = Example.create()

val factory : Factory<Example> = Example
val e2 : Example = factory.create()
