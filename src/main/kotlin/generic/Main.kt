package generic

fun main() {

    val list: MyList = MyArrayList()
    for (i in 0..100) {
        list.add("$i")
    }
    for (i in 0..90) {
        list.removeAt(0)
    }
    for (i in 0 until list.size()) {
        println(list.get(i))
    }

}