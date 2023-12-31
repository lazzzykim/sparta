package com.teamsparta.todolist.domain.todoCard.service

import com.teamsparta.todolist.domain.todoCard.controller.TodoCardController
import com.teamsparta.todolist.domain.todoCard.dto.CreatedTodoCardRequest
import com.teamsparta.todolist.domain.todoCard.dto.TodoCardResponse
import com.teamsparta.todolist.domain.todoCard.dto.UpdateTodoCardRequest

interface TodoCardService {

    fun getAllTodoCardList(): List<TodoCardResponse>

    fun getTodoCardById(todoId: Long): TodoCardResponse

    fun createTodoCard(request: CreatedTodoCardRequest): TodoCardResponse

    fun updateTodoCard(todoId: Long, request: UpdateTodoCardRequest): TodoCardResponse

    fun deleteTodoCard(todoId: Long)
}