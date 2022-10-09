package me.devksh930.lec13

//class House(
//    val address: String,
//    val livingRoom: LivingRoom
//) {
//    class LivingRoom(
//        private val area: Double
//    )
//}

class House(
    val address: String,
    val livingRoom: LivingRoom
) {
    inner class LivingRoom(
        private val area: Double
    ) {
        val address: String
            get() = this@House.address
    }
}