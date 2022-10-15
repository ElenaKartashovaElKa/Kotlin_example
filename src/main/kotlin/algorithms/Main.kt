package algorithms

//Бинарный поиск
fun main() {
    val list = mutableListOf<Int>()
    for (i in 1 until 100) {
        list.add(i)
    }

    println(binarySearch(list, 38))
}

fun binarySearch(list: List<Int>, item: Int): Int? {
    var low = 0
    var high = list.size
    var j = 1

    if (item !in 1..100) {
        return null
    }

    while (low <= high) {
        println("Шаг ${j++}")
        val middle = (low + high) / 2
        val guess = list[middle]

        if (guess == item) {
            return middle
        } else
            if (guess > item) {
                high = middle
            } else
                if (middle < item) {
                    low = middle
                }
    }
    return null
}