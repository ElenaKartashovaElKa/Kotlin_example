package companionObject.homeWork

import kotlin.random.Random
/*
Создайте класс MyRandom, в котором будут следующие статические методы:
1) Возвращает случайное целое число в переданном диапазоне
2) Возвращает случайное значение типа Boolean (true или false)
3) Возвращает случайный день недели (название)
 */
class MyRandom {

    companion object {
        
        //можно использовать класс enum
        private const val MONDAY = "Понедельник"
        private const val TUESDAY = "Вторник"
        private const val WEDNESDAY = "Среда"
        private const val THURSDAY = "Четверг"
        private const val FRIDAY = "Пятница"
        private const val SATURDAY = "Суббота"
        private const val SUNDAY = "Воскресенье"

        fun randomInt(from: Int, to: Int) = Random.nextInt(to - from + 1) + from
        fun randomBoolean() = randomInt(0, 1) > 0
        fun randomDayOfWeek(): String {
            return when (Random.nextInt(1, 7)) {
                1 -> MONDAY
                2 -> TUESDAY
                3 -> WEDNESDAY
                4 -> THURSDAY
                5 -> FRIDAY
                6 -> SATURDAY
                else -> SUNDAY
            }
        }
    }
}