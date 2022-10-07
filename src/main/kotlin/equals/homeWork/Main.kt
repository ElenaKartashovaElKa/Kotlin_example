package equals.homeWork

fun main() {
    val address1 = Address("Москва", "Тверская", 5)
    val address2 = address1.copy()

    println(address1)
    println(address2)
    println(address1.hashCode())
    println(address2.hashCode())
    println(address1 == address2)

    //деструктор
    val (city, street, house) = address1
    println(city)
    println(street)
    println(house)

}