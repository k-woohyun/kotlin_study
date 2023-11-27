package com.lannstark.lec03

/*
* Lec 03. 코틀린에서 Type을 다루는 방법
* - 코틀린의 변수는 초기값을 보고 타입을 추론하며, 기본타입들 간의
*   변환은 명시적으로 이루어진다.
* - 코틀린에서는 is,!is, as, as?를 이용해 타입을 확인하고 캐스팅한다.
* - 코틀린의 Any는 Java의 Object와 같은 최상위 타입이다.
* - 코틀린의 Unit은 Java의 void와 동일하다.
* - 코틀린에 있는 Nothing은 정상적으로 끝나지 않는 함수의 반환을
*   의미한다.
* - 문자열을 가공할때 ${변수}와 """ """를 사용하면 깔끔한 코딩이
*   가능하다.
* - 문자열에서 문자를 가져올때의 Java의 배열처럼 []를 사용한다.
* */
fun main() {
    val number1 = 3
    val number2: Long = number1.toLong()

    printAgeIfPerson2(Person("", 100))

    val person = Person("김우현", 100)
    val name = "김우현"
    println("이름 : ${person.name}")
    println("이름 : $name")

    val str = """
        ABC
        EFG
        $name
        ${person.name}
    """.trimIndent()
    println(str)

    val str1 = "ABC"
    println(str1[1])
}

fun printAgeIfPerson(obj: Any) {
    /*
    Java의 instancsOf 와 같은 의미의 Kotlin은 is
    : instanceof : 변수가 주어진 타입이면 true, 그렇지 않으명 false
     */
    if (obj is Person) {
        // 스마트 캐스트
        println(obj.age)
    }
}

fun printAgeIfPerson2(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}
