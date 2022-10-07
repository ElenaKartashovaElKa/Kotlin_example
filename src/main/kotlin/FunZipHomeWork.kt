fun main() {
    /*
   1. Создайте массив строк и заполните значениями "Фамилия Имя"
   2. Создайте коллекцию объектов Pair, в которых first - фамилия, а second - имя
    */
    val fullNames = mutableListOf<String>() //mutableList<String>
    fullNames.add("Литвинова Рената")
    fullNames.add("Рамазанова Земфира")
    fullNames.add("Jackson Michael")
    fullNames.add("Mercury Freddie")
    fullNames.add("John Elton")
    for (i in fullNames) {
        println(i)
    }
    val names = fullNames.map { it.substringAfter(" ") }
    val lastNames = fullNames.map { it.substringBefore(" ") }

    println("-------Имена-------")
    for (name in names) {
        println(name)
    }
    println("-------Фамилии-------")
    for (surname in lastNames) {
        println(surname)
    }
    println("-------resultPair-------")
    val users = names.zip(lastNames) //создали list<Pair<String, String>>
    for (i in users) {
        println("Имя: ${i.first} Фамилия: ${i.second}")
    }

    //или так:
    println("-------или так:-------")
    val users2 = fullNames.map { Pair(it.substringBefore(" "), it.substringAfter(" ")) }
    for (user in users2) {
        println("Имя: ${user.first} Фамилия: ${user.second}")
    }

}