package com.lannstark.lec04

import Money
/*
* Lec 04. 코틀린에서 연산자를 다루는 방법
* - 단항연산자, 산술연산자, 산술대입연산자 Java와 똑같다~
* - 비교 연산자 사용법도 Java와 똑같다~
*   - 단, 객체끼리도 자동 호출되는 compareTo를 이용해
*     비교 연산자를 사용할 수 있다.
* - in, !in / a..b / a[i] / a[i] = b와 같이 코틀린에서 새로
*   생긴 연산자도 있다.
* - 객체끼리의 연산자를 직접 정의할 수 있다.
* */

fun main() {
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)
    val money3 = JavaMoney(1_000L)
    val money4 = money2
    if (money1 > money2) {
        println("Money1이 Money2보다 금액이 큽니다.")
    }
    println(money2 === money4)
    println(money2 === money3)
    println(money2 == money3)

    if (fun1() || fun2()) {
        println("본문")
    }

    if (fun2() && fun1()) {
        println("본문2")
    }

    if (fun1() && fun2()) {
        println("본문3")
    }

    val money5 = Money(1_000L)
    val money6 = Money(1_000L)

    println(money5 + money6)
    println(money5.plus(money6))

}

fun fun1(): Boolean {
    println("fun 1")
    return true
}

fun fun2(): Boolean {
    println("fun 2")
    return false
}
