fun main() {
    val revenueByWeek = listOf(
        listOf(8, 6, 5, 1, 2),
        listOf(4, 7, 5, 8, 2),
        listOf(8, 7, 5, 1, 2),
        listOf(8, 5, 5, 1, 2),
    )
    // так делается через map
//    val total = mutableListOf<Int>()
//    revenueByWeek.map{
//        for (i in it) {
//            total.add(i)
//        }
//    }
    //а вот так короче и лучше. Мы из массива массивов делаем просто массив чисел
    val total = revenueByWeek.flatten()
    val average = total.average()
    println(average)
}