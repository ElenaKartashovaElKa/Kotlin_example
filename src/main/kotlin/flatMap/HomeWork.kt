package flatMap

import java.util.Collections.*

fun main() {
    val data = mapOf(
        "Январь" to listOf(100, 100, 100, 100),
        "Февраль" to listOf(200, 200, -190, 200),
        "Март" to listOf(300, 180, 300, 100),
        "Апрель" to listOf(250, -250, 100, 300),
        "Май" to listOf(200, 100, 400, 300),
        "Июнь" to listOf(200, 100, 300, 300)
    )
    printInfo(data)
    example(data)
}

fun printInfo(data: Map<String, List<Int>>) {
    val validDate = data.filterNot { it.value.any { it < 0 } }
    val averageWeek = validDate.flatMap { it.value }.average()
    println("Средняя выручка в неделю: $averageWeek")

    val averegeMonth = validDate.map { it.value.sum() }.average()
    println("Средняя выручка в месяц: $averegeMonth")

    val listOfSum = validDate.map { it.value.sum() }
    val max = listOfSum.maxOrNull()
    val min = listOfSum.minOrNull()
    val maxMonths = validDate.filter { it.value.sum() == max }.keys
    val minMonths = validDate.filter { it.value.sum() == min }.keys
    println("Максимальная выручка в месяц: $max")
    print("Была в следующих месяцах: ")
    for (month in maxMonths) {
        println("$month")
    }
    println("Минимальная выручка в месяц: $min")
    print("Была в следующих месяцах: ")
    for (month in minMonths) {
        println("$month")
    }
    val invalidDate = data.filter { it.value.any { it < 0 } }
    val errorMonths = invalidDate.keys
    print("Ошибки произошли в следующих месяцах: ")
    for (month in errorMonths) {
        print("$month ")
    }
    println()
}

//моё решение
fun example(data: Map<String, List<Int>>) {
    println("--------моё решение----------")
    val myExample = data.filterNot { it.value.any { it < 0 } }
    println(myExample)
    println("Средняя выручка в неделю: ${myExample.flatMap { it.value }.average()}")
    println("Средняя выручка в месяц: ${myExample.map { it.value.sum() }.average()}")
    println(
        "Максимальная выручка в месяц: ${max(myExample.map { it.value.sum() })} " + "\n" +
                "Была в следующих месяцах: "
    )
    println(
        "Минимальная выручка в месяц: ${min(myExample.map { it.value.sum() })} " + "\n" +
                "Была в следующих месяцах:"
    )
    println("Ошибки произошли в следующих месяцах: ${data.filter { it.value.any { it < 0 } }.keys}")

}
