package withAndLet

import kotlin.random.Random

fun main() {
    val list = mutableListOf<Int>()
    with(list) {
        for (i in 0 until 1000) {
            add(Random.nextInt(100))
        }
        println(sum())
        println(maxOrNull())
        println(minOrNull())
        println(average())
        println(first())
        println(last())
    }

    printResult(list)
}
//так громоздко
fun printResult(list: List<Int>) {
    val sum = list.sum()
    println("Сумма чисел: $sum")
    val maxNumber = list.maxOrNull()
    println("Максимальное число: $maxNumber")
    val minOfNumber = list.minOrNull()
    println("Минимальное число: $minOfNumber")
    val averageNumber = list.average()
    println("Среднее число: $averageNumber")
    val firstNumber = list.first()
    println("Первое число: $firstNumber")
    val lastNumber = list.last()
    println("Последнее число: $lastNumber")
}