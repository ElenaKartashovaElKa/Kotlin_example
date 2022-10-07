package enumClass

import enumClass.Month.*
import enumClass.Season.*


fun main() {
    val season = when (SEPTEMBER) {
        DECEMBER, JANUARY, FEBRUARY -> WINTER
        MARCH, APRIL, MAY -> SPRING
        JUNE, JULY, AUGUST -> SUMMER
        SEPTEMBER, OCTOBER, NOVEMBER -> AUTUMN
    }

    println(SEPTEMBER.tempAverage)
    println(season)
}