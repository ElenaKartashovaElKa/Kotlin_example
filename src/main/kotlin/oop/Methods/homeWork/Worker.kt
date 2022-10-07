package oop.Methods.homeWork

import java.util.*

class Worker(val name: String, val position: String, val startYear: Int) {
    val experience: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - startYear

    fun work() {
        println("Работаю")
    }

}