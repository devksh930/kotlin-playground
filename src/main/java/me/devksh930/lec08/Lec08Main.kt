package me.devksh930.lec08

fun max(a: Int, b: Int): Int = if (a > b) a else b


fun repeate(
    str: String,
    num: Int = 3,
    newLine: Boolean = true
) {
    for (i in 1..num) {
        if (newLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun main() {
//    repeate("Hello World", newLine = false)
    printNameAndGender(gender = "FEMALE", name = "Devksh930")
    printAll("A", "B", "C")
    val arrayOf = arrayOf("A", "B", "C")
    printAll(*arrayOf)
}


fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}