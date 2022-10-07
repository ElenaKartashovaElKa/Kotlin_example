fun main() {
    println(max(5, 10))

    println(returnString("NOWARNOWAR"))
}

fun max(a: Int, b: Int) = if (a > b) a else b

fun returnString(a: String) = a.substring(0,Math.min(5, a.length))
