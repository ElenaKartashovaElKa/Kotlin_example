package inheritance

/*
По умолчанию все классы в Kotlin public и final-нельзя наследоваться от такого класса.
Чтобы можно было наследоваться от класса, класс должен быть open.
 */
open class Animal(val name: String, var weight: Float, val habitat: String) {
    open fun eat() {
        println("Кушать еду")
    }

    open fun run() {
        println("Бегу")
    }
}