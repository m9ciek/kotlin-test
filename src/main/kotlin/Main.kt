//normal classes
//constructor without parameters
class Customer

//parametrized constructor
class Contact(val id: Long, var name: String)

//data class
data class User(val id: Int, var name: String)

//generics
class MutableStack<T>(vararg items: T) {
    private val elements = items.toMutableList()

    fun push(element: T) = elements.add(element)
    fun pop(): T = elements.removeAt(elements.size - 1)
    fun peek(): T = elements.last()
    fun returnSizeAsInteger(): Int = elements.size
    override fun toString() = "Mutable Stack Of ${elements.joinToString()}"
}

fun <T> mutableStackOf(vararg elements: T) = MutableStack(*elements)

//function with vararg
fun sayInfo(vararg message: String, prefix: String = "Info") {
    for (m in message) {
        println(prefix + m)
    }

    //adding ? at the end means that it can be null
    var notNull: String?
    notNull = null
}

fun returnAnFloat(): Float {
    return 78.0f
}

fun operateOnUser() {
    val user = User(1, "Janush")
    val copiedUser = user.copy()
    println("user == copiedUser? -> ${user == copiedUser}")

    val newUser = user.copy(2, "Adam")
    println("user == newUser? -> ${user == newUser}")
}


fun main() {
    sayInfo(
        "Hello it's my message", "Testing vararg", "Testing 123", "Domain 4321",
        prefix = "TestPrefix: "
    )

    println("============================")
    val a: Int = 23
    println("${returnAnFloat()} adding $a equals ${returnAnFloat() + a}")

    println("============================")
    operateOnUser()

    println("============================")
    val stack = mutableStackOf(0.62, 3.14, 2.7, 7.8)
    println(stack)
    println("Stack size: ${stack.returnSizeAsInteger()}")
    println(testGenericsReturnMiddleElement("Hejo", "Elo", "Siema", "Wujo"))
    println(testGenericsReturnMiddleElement(1, 2, 3, 4))

    println("============================")
    val dog: Dog = York()
    dog.sayHello()


}