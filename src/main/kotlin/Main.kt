

fun main() {
    val a: String? = null;
    val b: String? = "42342";
    val c: String? = "";

    val result: Int = (a?.length?: 0) + (b?.length?: 0) + (c?.length?: 0);
    println(result)
}