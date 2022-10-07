package extensionFunctions

fun main() {
    val age = 15
    val name = ""
    if (age in 12..100) { // Так писать громоздко. Если, например, нужно изменить условие,
        // то менять придется везде, а можно в одном месте - в одном методе
        println("Valid")
    }
    if (age in 12..100) {
        println("Valid too")
    }
    if (age in 12..100) {
        println("Valid too")
    }
    if (isAgeValid(age)) {
        println("Valid too")
    }
    if (age.isValid()) {
        println("Valid too - вот так красиво. мы вызываем метод у переменной")
    }
    if (age.isPositive2()) {
        println("Вот так тоже можно")
    }
    println(age.isPositive())

    if (name.isNotEmpty()) {
        println("Привет")
    }

}

fun isAgeValid(age: Int) = age in 7..100 //сюда передаем переменную
fun Int.isValid() = this in 7..100 // вот так красивее
fun Int.isPositive() = this >= 0
fun Int.isPositive2() = isValid()