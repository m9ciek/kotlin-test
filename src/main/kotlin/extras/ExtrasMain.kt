package extras

//nullable types
fun calculate(number: Int?): Int {
    return number?.inc() ?: 0
}

fun String?.isEmptyOrNull(): Boolean {
    return this == null || this.isEmpty()
}

fun main() {
    println(calculate(null))
    println(calculate(12))
}