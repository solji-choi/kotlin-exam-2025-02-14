package com.ll

fun main() {
    println("== 명언 앱 ==")

    while (true) {
        print("명언) ")

        val input = readlnOrNull()!!.trim() //절대 null일리가 없는 경우 !!

        if (input == "종료")
            break
    }
}