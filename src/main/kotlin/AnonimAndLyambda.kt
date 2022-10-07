fun main() {
    val sum: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    println(sum(2, 10))
/*
Создать переменную square, которая хранить в себе функцию.
Эта функция принимает число типа Int и возвращает это число в квадрате.
 */
    val square: (Int) -> Int = { it * it }
    println(square(5))
/*
Создать лямбда-выражения и сохранить их в переменные, а затем вызвать их.
1. Принимает две стороны прямоугольника в качестве параметра и возвращает его периметр.
2. Принимает имя в качестве параметра, выводит на экран строчку: "Привет, (ИМЯ)!", ничего не возвращает.
3. Принимает массив чисел в качестве параметра, возвращает массив, отсортированный по убыванию.
*/
    val perimeter: (Int, Int) -> Int = { a, b -> 2 * (a + b) }
    println(perimeter(4, 5))

    val sayHello: (String) -> Unit = { println("Привет, $it!") }
    sayHello("Наташа")

    val sort: (Array<Int>) -> Array<Int> = {
        for (i in it.size - 2 downTo 0) {
            for (j in 0..i) {
                if (it[j] < it[j + 1]) {
                    val temp = it[j]
                    it[j] = it[j + 1]
                    it[j + 1] = temp
                }
            }
        }
        it
    }
    val sortedArray = sort(arrayOf(5, 9, -8, 6, 85, 1))
    for (i in sortedArray) {
        println(i)
    }
}




