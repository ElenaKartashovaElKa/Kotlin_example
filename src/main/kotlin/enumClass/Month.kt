package enumClass

enum class Month(val tempAverage: Int) {
    JANUARY(-15),
    FEBRUARY(-10),
    MARCH(-5),
    APRIL(10),
    MAY(20),
    JUNE(25),
    JULY(30),
    AUGUST(28),
    SEPTEMBER(15),
    OCTOBER(10),
    NOVEMBER(5),
    DECEMBER(-5)
}

/*
Вообще можно использовать либо константы, либо перечисления.
Константы работают быстрее, так как занимают меньший объем памяти.
Но иногда необходимо использовать именно перечисления enum, особенно если они принимают какие-то параметры
 */
