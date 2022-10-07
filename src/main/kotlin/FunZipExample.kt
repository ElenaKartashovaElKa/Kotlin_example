fun main() {
    println("--------------------------")
    val array = mutableMapOf<String, String>()
    for (i in 1..10) {
        array.put("Фамилия_$i ", " Имя_$i")
    }
    for (i in array) {
        println(i)
    }
    val name = mutableListOf<String>()
    for (names in array.values) {
        name.add(names)
    }
    for (names in name) {
        println(names)
    }
    val surname = mutableListOf<String>()
    for (surnames in array.keys) {
        surname.add(surnames)
    }
    for (surnames in surname) {
        println(surnames)
    }
    val users = surname.zip(name)
    for (user in users) {
        println("Фамилия_${user.first} Имя_${user.second}")
    }

}