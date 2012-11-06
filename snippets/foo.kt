package user

public class User(val firstName: String,
                  val lastName: String,
                  val age: Int) {
    fun toString() = "$firstName $lastName, age $age"
}

fun main(args: Array<String>) {
    println(User("John", "Doe", 30))
}
