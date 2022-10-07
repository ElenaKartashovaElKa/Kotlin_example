package inheritance.homeWork.anonymousClasses

import java.util.Objects

fun main() {
    val sportsman = Sportsman()
//    sportsman.invokeWaterBoy(object : WaterBoy {
//        override fun bringWater() {
//            println("Вода принесена")
//        }
//    })

    sportsman.invokeWaterBoy { println("Вода принесена") }
}
