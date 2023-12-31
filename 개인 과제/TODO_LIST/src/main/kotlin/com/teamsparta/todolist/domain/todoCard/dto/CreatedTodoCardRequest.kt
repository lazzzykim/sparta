package com.teamsparta.todolist.domain.todoCard.dto

data class CreatedTodoCardRequest(
    val title: String,
    val description: String,
    val authorName: String,
    val date: String
)
