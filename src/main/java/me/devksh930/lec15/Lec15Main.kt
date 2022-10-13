package me.devksh930.lec15

import java.util.*

fun main() {
    val array = arrayOf(100, 200)
    for (i in array.indices) {
        println("${i} ${array[i]}")
    }
    array.plus(300)
    for ((idx, value) in array.withIndex()) {
        println("${idx} ${value}")
    }

    val numbers = listOf(100, 200)
    val emptyList = emptyList<Int>()

    println(numbers[0])

    for (number in numbers) {
        println(numbers)
    }


    val mutableListOf = mutableListOf(100, 200)
//    printNumber(emptyList())


    val numbersSet = setOf(100, 200)

    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }
}

//private fun printNumber(number: List<Int>) {
//    TODO()
//}
//
