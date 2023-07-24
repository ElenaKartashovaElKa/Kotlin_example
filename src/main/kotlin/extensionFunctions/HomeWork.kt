package extensionFunctions

/*
написать extension function у типа Int, которая возвращает значение, является ли число простым
простое число делится на себя или на единицу
 */

fun main() {
    println(28.simpleNumber())
    println("Pianomania".lastChar())
}

fun Int.simpleNumber(): Boolean {
    if (this <= 3) return true
    for (i in 2 until this) {
        if (this % i == 0) return false
    }
    return true
}
fun String.lastChar(): Char = get(length-1)