package com.ll

fun main() {
    println("== 명언 앱 ==")

    var lastId = 0

    while (true) {
        print("명언) ")

        val input = readlnOrNull()!!.trim() //절대 null일리가 없는 경우 !!

        if (input == "종료")
            break
        else if (input == "등록") {
            print("명언 : ")
            val content = readlnOrNull()!!.trim()

            print("작가 : ")
            val author = readlnOrNull()!!.trim()

            val id = ++lastId

            println("${id}번 명언이 등록되었습니다.")
        }
    }
}