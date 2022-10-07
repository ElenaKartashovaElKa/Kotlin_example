package withAndLet

//let и with - функции высшего порядка, которые управляют другими функциями

var name: String? = "qwerty"
fun main() { //внутри этого блока мы можем быть уверенными, что переменна name не будет равна null
    name?.let {
        if (it.length > 5) {
            println("длина строки больше 5 - $it")
        }
    }
}
