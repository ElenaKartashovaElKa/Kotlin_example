package flatMap

fun main() {
    val data = mapOf(
        //  Pair( "file1", listOf(15, 20, 45, 15, 12)) можно добавлять так тоже
        "file1" to listOf(15, 20, 45, 15, 12),
        "file2" to listOf(35, 20, 45, 15, 12),
        "file3" to listOf(15, 40, 45, 15, 72)
    )
    //flatMap - разворачивает коллекцию, сделает List<Int>. А map сделает лист листов List<List<Int>>
    val average = data.flatMap { it.value }.average()
    println(average)

    //допустим в коллекции есть ошибка в виде отрицательного числа, а нам надо посчитать средний возраст
    val data2 = mapOf(
        //  Pair( "file1", listOf(15, 20, 45, 15, 12)) можно добавлять так тоже
        "file1" to listOf(15, 20, 45, 15, 12),
        "file2" to listOf(35, -20, 45, 15, 12),
        "file3" to listOf(15, 40, 45, 15, 72)
    )
    val average2 = data2.filter { it.value.all { it >= 0 } }.flatMap { it.value }.average()
    println(average2)
}