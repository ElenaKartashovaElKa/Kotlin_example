package inheritance.homeWork.worker

class Director(name: String, age:Int): Worker(name, age) {
    override fun work() {
        println("Управляю процессом")
    }
}