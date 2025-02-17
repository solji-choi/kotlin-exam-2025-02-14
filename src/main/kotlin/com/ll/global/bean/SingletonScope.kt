package com.ll.global.bean

import com.ll.domain.system.system.controller.SystemController
import com.ll.domain.wiseSaying.wiseSaying.controller.WiseSayingController
import com.ll.domain.wiseSaying.wiseSaying.repository.WiseSayingMemoryRepository
import com.ll.domain.wiseSaying.wiseSaying.service.WiseSayingService

object SingletonScope {
    val wiseSayingController by lazy { WiseSayingController() }
    val wiseSayingService by lazy { WiseSayingService() }
    val wiseSayingRepository by lazy { WiseSayingMemoryRepository() }
    val systemController by lazy { SystemController() }
}