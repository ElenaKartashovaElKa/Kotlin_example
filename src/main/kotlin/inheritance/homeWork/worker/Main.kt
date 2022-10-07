package inheritance.homeWork.worker
/*
Операторы is и as. При помощи is мы можем проверять, является ли объект типом какого-то класса.
Если надо явно привести объект к типу какого-то класса, то используется as.
 */

fun main() {

    val workers = mutableListOf<Worker>()
    workers.add(Programmer("Вася", 23, "Kotlin"))
    workers.add(Director("Петя", 25))
    workers.add(Seller("Валя", 45))
    workers.add(Seller("Люба", 49))
    workers.add(Programmer("Лена", 35, "Kotlin"))
    workers.add(Programmer("Арсений", 38, "Java"))

    for (worker in workers) {
        worker.work()
        if (worker is Programmer) { //автоматическое приведение типов, через условие, (SmartCast) к классу Программистов
            println(worker.language)
        }
        if (worker is Cleaner) { //автоматическое приведение типов, через условие, (SmartCast) к классу Cleaner
            worker.clean()
        }

//        worker as Cleaner /* Явное приведение типов. Когда дойдем до директора, получим ошибку,
//                        т.к. директор не может быть приведен к типу cleaner */
//        worker.clean()
    }

    /* Задание: из коллекции работников получите коллекцию уборщиков.
    Т.е. на вход приходит List<Worker>, на выходе List<Cleaner>
     */
    println("List Cleaners")
    val cleaners = workers.filter { it is Cleaner }.map { it as Cleaner }
    for (cleaner in cleaners) {
        cleaner.clean()
    }

}