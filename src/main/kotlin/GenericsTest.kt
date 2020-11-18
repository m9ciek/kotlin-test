fun <T> testGenericsReturnMiddleElement(vararg elements: T): T {
    val values = elements.toMutableList()
    val indexOfMiddle = elements.size / 2
    return elements[indexOfMiddle]
}