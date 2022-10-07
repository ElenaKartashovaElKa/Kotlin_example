package higherOrderFunctions.filterAndMap

fun main() {
    //.filter
    val listOfNumbers = mutableListOf<Int>()
    for (i in 0..99) {
        listOfNumbers.add(i)
    }
    val listOfEvenNumbers = listOfNumbers.filter { it % 2 == 0 }
    for (i in listOfEvenNumbers) {
        println(i)
    }

    /*
    1. Создать коллекцию имен
    2. Из первой коллекции оставить только те имена, которые начинаются с буквы "А" и добавить их в новую коллекцию
     */
    val names =
        listOf("Natasha", "Andrey", "Lena", "Lida", "Arseniy", "Alexey", "Michael", "Zemfira", "Alena", "Renata")
    val namesStartsFromA = names.filter { it.startsWith("A") }
    for (name in namesStartsFromA)
        println(name)

}