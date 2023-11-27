package com.lannstark.lec05

import java.lang.IllegalArgumentException

fun main(score: Int) {
    /*
    * - if / if - else / if -else if -else 모두 Java와 문법이 동일하다.
    * - 단 Kotlin에서는 Expression으로 취급된다.
    *   - 때문에 Kotlin에서는 삼항 연산자가 없다.
    * - Java의 Switch는 Kotlin에서 when으로 대체되었고,
    *   when은 더욱 강력한 기능을 갖는다.
    * */
    if (score < 0) {
        throw IllegalAccessException("${score}는 0보다 작을 수 없습니다.")
    }
    if (score !in 0..100) {
        throw IllegalArgumentException("score의 범위는 0부터 100입니다.")
    }
}

fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun getGradeWithSwitch1(score: Int): String {
    return when(score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startWith(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("어디서 많이 본 숫자입니다.")
        else -> println("1, 0, -1이 아닙니다.")
    }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
        else -> println("주어진 숫자는 홀수 입니다.")
    }
}
