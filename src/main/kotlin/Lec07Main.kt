package com.lannstark.lec07

import kotlin.IllegalArgumentException

/*
*  Lec 07. 코틀린에서 예외를 다루는 방법
*  - try caych finally 구문은 문법적으로 완전히 동일하다.
*   - Kotlin에서는 try catch가 expression이다.
*  - Kolitn에서 모든 예외는 Unchecked Exception이다.
*  - Kotlin에서는 try with resource 구문이 없다. 대신 코틀린의
*    언어적 특징을 활용해 close를 호출해준다.
* */
fun main() {
    val str = "1234"
    parseIntOtThrow(str)
    parseIntOrThrowV2(str)
}

fun parseIntOtThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다")
    }
}

fun parseIntOrThrowV2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다.")
    }
}


