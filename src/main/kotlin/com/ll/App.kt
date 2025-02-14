package com.ll

class App {
    fun run() {
        println("== 명언 앱 ==")

        var lastId = 0
        val wiseSayings = mutableListOf<WiseSaying>();

        while (true) {
            print("명령) ")

            val input = readlnOrNull()!!.trim() //절대 null일리가 없는 경우 !!

            if (input == "종료")
                break
            else if (input == "등록") {
                print("명언 : ")
                val content = readlnOrNull()!!.trim()

                print("작가 : ")
                val author = readlnOrNull()!!.trim()

                val id = ++lastId
                val wiseSaying = WiseSaying(id, content, author)

                wiseSayings.add(wiseSaying)

                println("${id}번 명언이 등록되었습니다.")
            } else if (input == "목록") {
                if (wiseSayings.isEmpty()) {
                    println("등록된 명언이 없습니다.")
                    continue
                }

                println("번호 / 작가 / 명언")
                println("----------------------")

                wiseSayings.forEach {
                    println("${it.id} / ${it.author} / ${it.content}")
                }
            }
        }
    }
}