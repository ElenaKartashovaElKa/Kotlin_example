package generic

interface MyList {
    fun get(index: Int): String
    fun add(string: String)
    fun remove(element: String)
    fun removeAt(index: Int)
    fun size(): Int
}