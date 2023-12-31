package com.teamsparta.todolist.domain.todoCard.controller

import com.teamsparta.todolist.domain.exception.ModelNotFoundException
import com.teamsparta.todolist.domain.todoCard.dto.CreatedTodoCardRequest
import com.teamsparta.todolist.domain.todoCard.dto.TodoCardResponse
import com.teamsparta.todolist.domain.todoCard.dto.UpdateTodoCardRequest
import com.teamsparta.todolist.domain.todoCard.service.TodoCardService
import com.teamsparta.todolist.domain.todoCard.service.TodoCardServiceImpl
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/todos")
@RestController
class TodoCardController(
    private val todoCardService: TodoCardServiceImpl,
    cardService: TodoCardServiceImpl,
) {

    @GetMapping
    fun getTodoCardList(): ResponseEntity<List<TodoCardResponse>> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(todoCardService.getAllTodoCardList())
    }

    @GetMapping("/{todoId}")
    fun getTodoCard(
        @PathVariable todoId: Long,
    ): ResponseEntity<TodoCardResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(todoCardService.getTodoCardById(todoId))
    }

    @PostMapping
    fun createTodoCard(
        @RequestBody createdTodoCardRequest: CreatedTodoCardRequest,
    ): ResponseEntity<TodoCardResponse> {
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(todoCardService.createTodoCard(createdTodoCardRequest))
    }

    @PatchMapping("/{todoId}")
    fun updateTodoCard(
        @PathVariable todoId: Long,
        @RequestBody updateTodoCardRequest: UpdateTodoCardRequest,
    ): ResponseEntity<TodoCardResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(todoCardService.updateTodoCard(todoId, updateTodoCardRequest))
    }

    @DeleteMapping("/{todoId}")
    fun deleteTodoCard(
        @PathVariable todoId: Long,
    ): ResponseEntity<Unit> {
        todoCardService.deleteTodoCard(todoId)
        return ResponseEntity
            .status(HttpStatus.NO_CONTENT)
            .build()
    }
}