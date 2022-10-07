fun main() {
    val array = arrayOfNulls<Int?>(101)
    for (i in 0..100) {
        array[i] = i
    }
    for (i in array) {
        println(i)
    }

    for ((index: Int, i: Int?) in array.withIndex()) {
        array[index] = i?.times(2)
    }
    for (i in array) {
        println(i)
    }


    for (i in 100 downTo 0 step 2) {
        println(i)
    }

}