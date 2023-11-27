package com.lannstark.lec01

fun main() {
    /*
    * Lec 01. 코틀린에서 변수를 다루는 방법
    * - 모든 변수는 var / val을 붙여 주어야 한다.
    *   - var : 변경 가능하다./ val : 변경 불가능하다(read-only)
    * - 타입을 명시적으로 작성하지 않아도, 타입이 추론된다.
    * - Primitive Type과 reference Type을 구분하지 않아도 된다.
    * - Null이 들어갈 수 있는 변수는 타입 뒤에 ?를 붙여주어야 한다.
    *   - 아예 다른 타입으로 간주된다.
    * - 객체를 인스턴스화 할 때 new를 붙이지 않아야 한다.
    * */
    var number1: Long = 10L
    number1 = 5L
    val number2 = 10L
    // number2 = 5L

    var number3: Long = 10L
    val number4: Long = 10L

    var number5 = 10L
    val number6 = 1_000L

    var number7: Long? = 1_000L
    number7 = null

    var person = Person("김우현")
}
