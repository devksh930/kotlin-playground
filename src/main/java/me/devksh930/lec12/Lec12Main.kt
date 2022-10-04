package me.devksh930.lec12

fun main() {
    moveSomething(object : Movable {
        override fun move() {
            println("무브무브")
        }

        override fun fly() {
            println("날다날다")
        }
    })
}

private fun moveSomething(movable: Movable) {
    movable.fly()
    movable.move()
}