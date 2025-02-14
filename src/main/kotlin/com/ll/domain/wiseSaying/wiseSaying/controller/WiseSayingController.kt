package com.ll.domain.wiseSaying.wiseSaying.controller

import com.ll.Rq
import com.ll.domain.wiseSaying.wiseSaying.entity.WiseSaying

class WiseSayingController {
    var lastId = 0
    val wiseSayings = mutableListOf<WiseSaying>();

    fun actionWrite(rq: Rq) {
        print("명언 : ")
        val content = readlnOrNull()!!.trim()

        print("작가 : ")
        val author = readlnOrNull()!!.trim()

        val id = ++lastId
        val wiseSaying = WiseSaying(id, content, author)

        wiseSayings.add(wiseSaying)

        println("${id}번 명언이 등록되었습니다.")
    }

    fun actionList(rq: Rq) {
        if (wiseSayings.isEmpty()) {
            println("등록된 명언이 없습니다.")
            return
        }

        println("번호 / 작가 / 명언")
        println("----------------------")

        wiseSayings.forEach {
            println("${it.id} / ${it.author} / ${it.content}")
        }
    }

    fun actionDelete(rq: Rq) {
        val id = rq.getParamValueAsInt("id", 0)

        if (id == 0) {
            println("id를 정확히 입력해주세요.")
            return
        }

        val wiseSaying = wiseSayings.firstOrNull { it.id == id }

        if (wiseSaying == null) {
            println("${id}번 명언은 존재하지 않습니다.")
        }

        wiseSayings.remove(wiseSaying)

        println("${id}번 명언을 삭제하였습니다.")
    }
}