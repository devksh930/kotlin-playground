package me.devksh930.lec09


fun main() {
////    val person = Person("Devksh930", 100)
//    val person = JavaPerson("Devksh930", 100)
//    println(person.name)
//    person.age = 10
//
//    println(person.age)
    Person()

}

public class Person(
     name: String,
    var age: Int
) {
//
//    val name = name
//        get() = field.uppercase()

//    fun getUppercaseName(): String {
//        return this.name.uppercase()
//    }

    val uppercaseName: String
        get() = this.name.uppercase()

    var name = name
        set(value) {
            field = value.uppercase()
        }

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이느 ${age} 일 수 없습니다")
        }
        println("초기화 블록")
    }

    constructor(name: String) : this(name, 1) {
        println("첫번째 부 생성자")
    }

    constructor() : this("ksh930") {
        println("두번째 부 생성자")
    }

    val isAdult: Boolean
        get() = this.age >= 20
}