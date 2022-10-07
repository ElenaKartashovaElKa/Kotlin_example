package inheritance.homeWork.anonymousClasses

import java.util.UUID

class Sportsman {

    fun invokeWaterBoy(waterBoy: WaterBoy) { //вызвать водоноса
        waterBoy.bringWater()
    }

   inline fun invokeWaterBoy(bringWater: () -> Unit) {
        bringWater()
    }
}