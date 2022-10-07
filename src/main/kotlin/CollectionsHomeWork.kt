import kotlin.random.Random

fun main() {
    println("------Создать коллекцию случайных чисел в диапазоне от 0 до 1000 с размером 1000 элементов------")
    val randomValues = List(100) { Random.nextInt(0, 100) }
    println(randomValues)
    val result = randomValues.filter { it % 5 == 0 || it % 3 == 0 }.map { it * it }.sortedDescending().map { "$it" }
    for (i in result) {
        println(i)
    }

//    println(randomValues)
//    println("------Оставить только те числа, которые без остатка делятся на 5 или на 3------")
//    val divisionOnFiveOreThree = randomValues.filter { it % 5 == 0 || it % 3 == 0 }
//    for (i in divisionOnFiveOreThree) {
//        println(i)
//    }
//    println("------Каждое число из полученной коллекции возведите в квадрат------")
//    val square = divisionOnFiveOreThree.map { it * it }
//    for (i in square) {
//        println(i)
//    }
//    println("------Полученную коллекцию отсортируйте по убыванию------")
//
//    val sortedArray = square.sortedDescending()
//    for (i in sortedArray) {
//        println(i)
//    }
//    println("------Преобразуйте в коллекцию элементов типа String------")
//    val arrayString = sortedArray.map { "Теперь коллекция типа String $it" }
//    for (i in arrayString) {
//        println(i)
//    }

}


