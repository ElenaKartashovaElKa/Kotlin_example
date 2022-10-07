package higherOrderFunctions
/*
Функции высшего порядка
 */
fun main() {
    val result = modifyString("Hello World!") { it.uppercase() }
    println(result)
}

fun modifyString(string: String, modify: (String) -> String): String {
    return modify(string)
}