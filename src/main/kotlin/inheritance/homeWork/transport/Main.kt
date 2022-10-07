package inheritance.homeWork.transport

fun main() {
    val car: Transport = Car()
    val bicycle: Transport = Bicycle()

    if (car is Car) {    //smartCast - умное приведение типов
        car.name = "Машина2"
    }
    println(car.name)

    if (car !is Car) return   //smartCast
    car.name = "Машина3"
    println(car.name)

    if (car is Car && car.startEngine()) { //smartCast (вариантов много)
    }
    //пример анонимного класса, чтобы не создавать класс Автобус
    travel(object : Transport("Автобус") {
        override fun drive() {
            println("Автобус едет...")
        }
    })

}

fun travel(transport: Transport) {
    transport.drive()
}