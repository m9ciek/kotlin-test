package scope_functions

fun printUpperCase(s: String) {
    println(s.toUpperCase())
}

fun printIfNonNull(s: String?) {
    println("printing: $s")

    s?.let {
        printUpperCase(s)
    }

}

//similiat to let but can be accesed by this and do some function
fun getNullableLength(s: String?) {
    println("For \"$s\":")

    s?.run {
        println("\tis empty? " + s.isEmpty())
        println("\tlength: ${s.length}")
    }
}

//apply handy for initializing objects
data class Lamp(var name: String, var age: Int, var price: Double) {
    constructor() : this("", 0, 0.0)

    fun turnOff(){
        println("Turning off!")
    }
}

//Extension functions, it makes it like turn ON is a member of LAMP
fun Lamp.turnOn(time: Float?): Boolean {
    return if (time != null) {
        println("Turning lamp on for: $time seconds")
        true
    } else {
        println("Please provide time")
        false
    }
}

fun String.lastElement() = get(this.length - 1)

fun describeLamp() {
    val lamp = Lamp()
    val description = lamp.apply {
        name = "Desk"
        age = 2
        price = 40.0
    }.toString()
    println("Lamp description: $description")
}

fun main() {
    val empty = "test123".let {
        printUpperCase(it)
        it.length
    }

    println("Length $empty")
    printIfNonNull(null)
    printIfNonNull("Twoja Stara")

    println("=========================")
    getNullableLength("")
    getNullableLength(null)
    getNullableLength("Twoja stara")

    println("=========================")
    describeLamp()

    println("=========================")
    val myLamp = Lamp()
    myLamp.turnOn(12f)
    myLamp.turnOff()
    val lastChar: Char = "literal".lastElement()
    print("$lastChar")
}