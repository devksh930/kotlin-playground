package me.devksh930.lec14


fun main() {
    val personDto = PersonDto("devksh930", 200)
    val personDto1 = PersonDto("devksh930", 100)
    println(personDto == personDto1)
}

data class PersonDto(
    val name: String,
    val age: Int
) {
}