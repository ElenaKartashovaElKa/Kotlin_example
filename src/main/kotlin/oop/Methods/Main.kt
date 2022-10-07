package oop.Methods

fun main() {
    val cat = Cat("Барсик", 12, 3f)
    // cat.printInfo()
    println(cat.isOld)
    cat.age = 10
    println(cat.isOld)
}

