package higherOrderFunctions.filterAndMap

fun main() {
    //.map
    val numbers = (0..100).toList()
    val doubledNumbers = numbers.map { it * 2 } // it, если один параметр
    for (i in doubledNumbers) {
        println(i)
    }

    val number = (0..100).toList()
    val employees = number.map { "Employee №$it" } // теперь eployee стал List<String>
    for (employee in employees)
        println(employee)

    //.sorted
    val array = arrayOf(8, 5, -7, 55, 51)
    val sortedArray = array.sortedDescending() //по убыванию, или можно просто .sorted
    for (i in sortedArray) {
        println(i)
    }
    array.set(3, 2)
    for (i in array) {
        println(i)
    }

}