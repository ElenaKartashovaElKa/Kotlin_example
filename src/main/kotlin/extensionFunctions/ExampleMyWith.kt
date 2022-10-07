package extensionFunctions

fun main() {
    val obj = mutableMapOf<String, String>()
    myWith(obj) {
        keys
        values
    }
}

//Параметризированный тип или дженерик
//Если ф-ция в качестве параметра принимает другоую ф-цию, то желательно сделать её inline
inline fun <T, R> myWith(obj: T, operation: T.() -> R): R {
    return obj.operation()
}