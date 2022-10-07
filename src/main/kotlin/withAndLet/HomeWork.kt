package withAndLet

import kotlin.random.Random

/*
1. За пределами метода higherOrderFunctions.filterAndMap.higherOrderFunctions.filterAndMap.main() создайте нулабельную коллекцию чисел.
2. Внутри метода higherOrderFunctions.filterAndMap.higherOrderFunctions.filterAndMap.main(), используя функцию with(), заполните ее 1000-ю случайными значениями.
3. Выведите на экран первые 100 четных чисел коллекции (внутри функции with).
* При возникновении ошибок из-за нулабельности коллекции используйте let
 */

var list: MutableList<Int>? = mutableListOf()

fun main() {
    list?.let {
        with(it) {
            for (i in 0 until 100) {
                add(Random.nextInt(100))
            }
            val result = filter { it % 2 == 0 }.take(10)
            for (i in result) {
                println(i)
            }
        }
    }
}



