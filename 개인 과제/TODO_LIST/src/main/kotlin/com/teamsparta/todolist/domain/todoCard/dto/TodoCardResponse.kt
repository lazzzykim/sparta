package com.teamsparta.todolist.domain.todoCard.dto

data class TodoCardResponse(
    val id: Long,
    val title: String,
    val description: String,
    val authorName: String,
    val date: String
)
