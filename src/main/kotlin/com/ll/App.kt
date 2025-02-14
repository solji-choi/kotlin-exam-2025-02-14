package com.ll

import com.ll.domain.system.system.controller.SystemController
import com.ll.domain.wiseSaying.wiseSaying.controller.WiseSayingController

class App {
    fun run() {
        val wiseSayingController = WiseSayingController()
        val systemController = SystemController()

        println("== 명언 앱 ==")

        while (true) {
            print("명령) ")

            val input = readlnOrNull()!!.trim() //절대 null일리가 없는 경우 !!
            val rq = Rq(input)

            when(rq.action) {
                "종료" -> {
                    systemController.actionExit(rq)
                    break
                }
                "등록" -> wiseSayingController.actionWrite(rq)
                "목록" -> wiseSayingController.actionList(rq)
                "삭제" -> wiseSayingController.actionDelete(rq)
                "수정" -> wiseSayingController.actionModify(rq)
            }
        }
    }
}