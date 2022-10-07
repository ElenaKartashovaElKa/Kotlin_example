import kotlin.random.Random

fun main() {
    /*
    Создать два массива: Имена и Телефона. Два массива объединить в один
     */
    val names = mutableListOf<String>()
    val phones = mutableListOf<Long>()
    for (i in 0..10) {
        names.add("Имя_$i")
        phones.add(79_000_000_000 + Random.nextInt() * 1_000_000_000)
    }
    val users = names.zip(phones)
    for (user in users) {
        println("Имя: ${user.first} Телефон: ${user.second}")
    }

}