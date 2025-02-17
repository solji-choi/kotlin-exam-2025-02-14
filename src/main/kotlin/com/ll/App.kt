package com.ll

import com.ll.global.bean.SingletonScope.systemController
import com.ll.global.bean.SingletonScope.wiseSayingController
import com.ll.global.rq.Rq

class App {
    fun run() {

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
                "빌드" -> wiseSayingController.actionBuild(rq)
                "등록" -> wiseSayingController.actionWrite(rq)
                "목록" -> wiseSayingController.actionList(rq)
                "삭제" -> wiseSayingController.actionDelete(rq)
                "수정" -> wiseSayingController.actionModify(rq)
            }
        }
    }
}