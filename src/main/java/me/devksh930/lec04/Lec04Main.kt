package me.devksh930.lec04

fun main() {
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)
    val money3 = JavaMoney(1_000L)
    val money4 = money1

    println(money1 === money4)
    println(money2 == money3)

    if (money1 > money2) {
        println("Money1이 Money2보다 금액이 큽니다")
    }

    val money11 = Money(1_000L)
    val money12 = Money(2_000L)

    println(money11+money12)
}