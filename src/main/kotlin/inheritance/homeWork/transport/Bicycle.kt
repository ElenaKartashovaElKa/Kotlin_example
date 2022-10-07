package inheritance.homeWork.transport

class Bicycle(override var name: String = "Велосипед"): Transport(name) {
    override fun drive() {
        println("Велосипед едет...")
    }
}