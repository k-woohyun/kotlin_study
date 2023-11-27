package com.lannstark.lec02

/*
* Lec 02. 코틀린에서 null을 다루는 방법
* - 코틀린에서 null이 들어갈 수 있는 타입은 완전히 다르게 간주된다.
*   - 한번 null검사를 하면 non-null임을 컴파일러가 알 수 있다.
* - null이 아닌 경우에만 호출되는 Safe Call(?:)가 있다.
* - null인 경우에만 호출되는 Elvis 연산자 (?:)가 있다.
* - null이 절대 아닐때 사용할 수 있는 널 아님 단언(!!)이 있다.
* - Kotlin에서 Java코드를 사용할 때 플랫폼 타입 사용에 유의해야 한다.
*   - Java코드를 읽으며 널 가능성 확인 / Kotlin으로 wrapping
* */
fun main() {
    val str: String? = null
    println(startsWith4("ABC"))
    println(startsWithA2(str))
    println(startsWithA3(str))
    // println(startsWith4(null))
    // println(startsWithA1(str))
    println()
    val person = Person(null)
    startWithA5(person.name)
}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalAccessException("null이 들어왔습니다.")
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWith4(str: String?): Boolean {
    return str!!.startsWith("A")
}

fun startWithA5(str: String): Boolean {
    return str.startsWith("A")
}
