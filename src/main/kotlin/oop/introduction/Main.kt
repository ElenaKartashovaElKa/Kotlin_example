package oop

import oop.introduction.User

fun main() {
    val user = User();
    user.name = null
    user.age = 47
    println("Имя: ${user.name} Возраст: ${user.age}")

}