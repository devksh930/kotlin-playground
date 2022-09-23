package me.devksh930.lec02

fun main() {

    val str: String? = "ABC"
    println(str?.length)

    val str1: String? = null
    println(str1?.length ?: 0)
}

fun startsWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null이 들어 왔습니다")
    }
    return str.startsWith("A")

} //1 들어오는 arg가 null일경우 메서드내에서 null체크

fun startsWithA1LikeKotlin(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어 왔습니다")
}


fun startsWithA2(str: String?): Boolean? {
    if (str == null) {
        return null
    }
    return str.startsWith("A")
} //2 return인 null이 있을경우 Boolean?

fun startsWithA2LikeKotlin(str: String?): Boolean? {
    return str?.startsWith("A")
}


fun startWithA3(str: String?): Boolean {
    if (str == null) {
        return false
    }
    return str.startsWith("A")
}//3 null이 들어왔을경우 false


fun startWithA3LikeKotlin(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
}