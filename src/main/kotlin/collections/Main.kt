package collections

val firstList: MutableList<Int> = mutableListOf(1, 2, 3)        // 1
val copyList: List<Int> = firstList                              // 2

fun addFirstList(newUser: Int) {                                 // 3
    firstList.add(newUser)
}

fun getCopy(): List<Int> {                                  // 4
    return copyList
}

fun main() {
    addFirstList(4)                                      // 5
    println("Tot sudoers: ${getCopy().size}")               // 6
    getCopy().forEach {                                     // 7
            i -> println("Some useful info on user $i")
    }
    // getCopy().add(5) <- Error!                           // 8
}


