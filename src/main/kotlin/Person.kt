package com.lannstark.lec09

import java.lang.IllegalArgumentException

/*
* Lec 09. 코틀린에서 클래스틑 다루는 방법
* - 코틀린에서는 필드를 만들면 getter와 (필요에 따라) setter가
*   자동으로 생긴다.
*   - 때문에 이를 프로퍼티라고 부른다.
* - 코틀린에서는 주생성자가 필수이다.
* - 코틀린에서는 constructor 키워드를 사용해 부생성자를 추가로
*   만들 수 있다.
*   - 단 , default parameter나 정적 팩토리 메소드를 추천한다.
* - 실제 메모리에 존재하는 것과 무관하게 custom getter와
*   custom setter를 만들 수 있다.
* - custom getter, custom setter에서 무한루프를 막기 위해
*   field라는 키워드를 사용한다.
*   - 이를 backing field라고 부른다.
* */
class Person(
    name: String,
    var age: Int
) {

    var name = name
        set(value) {
            field = value.uppercase()
        }

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }
    
    constructor(name: String) : this(name, 1) {
        println("첫 번째 부생성자")
    }
    
    constructor(): this("홍길동") {
        println("두 번째 부생성자")
    }

    //함수처럼 접근
    fun isAdultFun(): Boolean {
        return this.age >= 20
    }

    //프로퍼티처럼 접근
    val isAdult2: Boolean
        get() = this.age >= 20

    val isAdult: Boolean
        get() {
            return this.age >= 20
        }
    
}