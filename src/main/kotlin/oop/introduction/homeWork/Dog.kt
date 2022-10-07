package oop.introduction.homeWork

class Dog {
    var name = ""
        get() = field.lowercase().capitalize()

    var age: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }

    var width: Float = 0f
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
}