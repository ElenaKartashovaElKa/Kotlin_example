package oop.Methods.homeWork

fun main() {
    val programmer = Worker("Petrov", "Engineer", 2017)
    programmer.printInfo()
}

fun Worker.printInfo() {
    println("Имя: $name Должность: $position Год устройства: $startYear Стаж: $experience")
}