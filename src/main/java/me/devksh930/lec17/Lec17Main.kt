package me.devksh930.lec17

import java.util.function.BinaryOperator

fun main() {
    val fruits = listOf(
        Fruit("사과", 1000),
        Fruit("사과", 1200),
        Fruit("사과", 1000),
        Fruit("사과", 1500),
        Fruit("바나나", 3000),
        Fruit("바나나", 3200),
        Fruit("바나나", 2500),
        Fruit("수박", 10000),
    )
//
    //람다를 만드는 방법 1
    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }
    //람다를 만드는 방법 2
    val isApple2 = { fruit: Fruit -> fruit.name == "사과" }

    filterFruits(fruits) { it.name == "사과" }
}
//    //람다를 직접 호출하는 방법1
//    isApple(fruits[0])
//    //람다를 직접 호출하는 방법2
//    isApple.invoke(fruits[0])

private fun filterFruits(
    fruits: List<Fruit>,
    filter: (Fruit) -> Boolean
): List<Fruit> {
    val result = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit))
            result.add(fruit)
    }
    return result

}