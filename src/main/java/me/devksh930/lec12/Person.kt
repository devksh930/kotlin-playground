package me.devksh930.lec12

class Person private constructor(
    val name: String,
    val age: Int
) {

    companion object Factory : Log {
        private const val MIN_AGE = 1

        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun lon() {
            println("나는 Person 클래스 동행 객체 Factory 에요")
        }
    }

}

object Singleton {
    var a: Int = 0
}

fun main() {
    println(Singleton.a)
    Singleton.a +=10
    println(Singleton.a)
}