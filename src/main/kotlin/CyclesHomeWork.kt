/*
1. Создайте массив чисел от 300 до 600
2. Выведите на экран в порядке убывания все значения массива, которые без остатка делятся на 5
В итоге в консоли должны быть значения: 600, 595, 590...
Подсказка: withIndex() можно вызывать у диапазонов, например, (0..100.withIndex)
 */

fun main(){
    val array = arrayOfNulls<Int?>(301)
    for ((index, i) in (300..600).withIndex()) {
        array[index] = i
    }
    for (i in array.size -1 downTo 0 step 5) {
        println(array[i])
    }

}