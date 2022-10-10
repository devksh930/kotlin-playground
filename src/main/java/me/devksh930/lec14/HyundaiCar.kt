package me.devksh930.lec14


fun main() {
    handleCar(Avante())
}

fun handleCar(car: HyundaiCar) {
    when (car) {
        is Avante -> TODO()
        is Sonata -> TODO()
        is Grandeur -> TODO()
    }

}

sealed class HyundaiCar(
    val name: String,
    val price: Long
)

class Avante : HyundaiCar("아반떼", 1_500L)
class Sonata : HyundaiCar("소나타", 2_00L)
class Grandeur : HyundaiCar("그렌져", 3_00L)