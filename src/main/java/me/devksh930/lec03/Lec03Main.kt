package me.devksh930.lec03

import kotlin.concurrent.timer

fun main() {

    val number1 = 3    //INT
    val number2 = 3L   //Long
    val number3 = 3.0f //float
    val number4 = 3.0  //double

    val n1: Int = 4
    val n2: Long = n1.toLong()
    val person = Person("devksh930",100)
    val log = "사람의 이름은 ${person.name} 이고 나이는 ${person.age} 세 입니다."
    val name: String = person.name
    val age: Int = person.age
    val log2 = "사람의 이름은 $name 이고 나이는 $age 세 입니다."
    val trimIndent = """
        ABC
        DEF
        $name
    """.trimIndent()

    println(log)
    println(log2)
    println(trimIndent)

    val str = "ABC"
    println(str[0])
    println(str[1])
    println(str[2])
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        val person = obj as Person
        println(person.age)
    }
}


fun printAgeIfPerson2(obj: Any?) {
    if (obj is Person) {
        val person= obj as? Person
        println(person?.age)
    }
}