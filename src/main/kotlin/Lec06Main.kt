package com.lannstark.lec06

fun main() {
    /*
    * - for each 문에서 Java는 : Kotlin은 in을 사용한다.
    * - 전통적인 for문에서 Kotlin은 등차수열과 in을 사용한다.
    * - 그 외 for문 문법은 모두 동일하다.
    * - while문과 do while문은 더욱더 놀랍도록 동일하다.
    * */
    val numbers = listOf(1L, 2L, 3L)
    for (number in numbers) {
        println(number)
    }

    for (i in 1..3) {
        println(i)
    }

    for (i in 3 downTo 1) {
        println(i)
    }

    for (i in 1..5 step 2) {
        println(i)
    }
    var i = 1
    while (i <= 3) {
        println(i)
        i++
    }
}