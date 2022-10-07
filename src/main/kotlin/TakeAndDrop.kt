import kotlin.random.Random

fun main() {
    val array = (0..100).toList()
    val employees = array.map { "Employee №$it" }
    //получить первые 30 чисел из списка
    println("получить первые 30 чисел из списка")
    val first30 = employees.take(30)
    for (employee in first30) {
        println(employee)
    }
    //получить последние 10 чисел из списка
    println("получить последние 10 чисел из списка")
    val last30 = employees.takeLast(10)
    for (employee in last30) {
        println(employee)
    }
    //первые 30 чисел вырезать
    println("первые 30 чисел вырезать")
    val drop30 = employees.drop(30)
    for (employee in drop30) {
        println(employee)
    }
    //последние 30 чисел вырезать
    println("последние 30 чисел вырезать")
    val dropLast30 = employees.dropLast(30)
    for (employee in dropLast30) {
        println(employee)
    }

    //создадим бесконечный массив четных чисел и выведем первые 10
    println("создадим бесконечный массив четных чисел и выведем первые 10")
    val arrayGenerate = generateSequence(0) {
        println("Сгенерировано ${it + 2}")
        it + 2
    }
    val evenListTake = arrayGenerate.take(10) //вывести первые 10 чисел
    // val evenListDrop = arrayGenerate.drop(10) //удалить первые 10 чисел
    for (i in evenListTake) {
        println(i)
    }
//    for (i in evenListDrop) { //первые 10 удалятся, а дальше пойдет бесконечная генерация чисел
//        println(i)
//    }
    //генерировать можно все, что угодно
    println("генерировать можно все, что угодноНапример, символы")
    val generateChar = generateSequence('A') {
        println("Сгенерировано: ${it + 1}")
        it + 1
    }
    val evenCharTake = generateChar.take(10)
    for (i in evenCharTake) {
        println(i)
    }
    //генерация случайных чисел
    println("генерация случайных чисел")
    val numberRandom = generateSequence {
        Random.nextInt(100)
        //(Math.random() * 100).toInt()
    }
    val evenList = numberRandom.take(10)
    for (i in evenList) {
        println(i)
    }

    /* домашнее задание: Сгенерировать бесконечную последовательность строк:
    "Сотрудник №1", "Сотрудник №2"... Вывести на экран первые 100 элементов */
    println("Сотрудники от 1 до 100")
    val genString = generateSequence("Сотрудник №1") {
       val index = it.substring(11).toInt()
        "Сотрудник №${index + 1}"
    }
    val employee = genString.take(100)
    for (i in employee) {
        println(i)
    }
}