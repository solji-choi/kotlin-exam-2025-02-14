package com.ll.domain.wiseSaying.wiseSaying.entity

class WiseSaying(
    val id: Int,
    var content: String,
    var author: String
) {
    fun modify(content: String, author: String) {
        this.content = content
        this.author = author
    }
}