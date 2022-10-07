package oop.introduction

class User {
    var age: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
    var name: String? = null
        get() {
            return if (field == null) {
                ""
            } else {
                field
            }
        }
}