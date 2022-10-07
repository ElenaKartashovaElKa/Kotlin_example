package inheritance.homeWork.transport

abstract class Transport(open val name: String) { /*можно переопределять не только методы, но и поля,
                                                   пометив их open в родительском классе и override в дочернем */
    abstract fun drive()
}