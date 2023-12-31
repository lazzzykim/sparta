package com.teamsparta.todolist.domain.todoCard.service

import com.teamsparta.todolist.domain.exception.ModelNotFoundException
import com.teamsparta.todolist.domain.todoCard.dto.CreatedTodoCardRequest
import com.teamsparta.todolist.domain.todoCard.dto.TodoCardResponse
import com.teamsparta.todolist.domain.todoCard.dto.UpdateTodoCardRequest
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service


@Service
class TodoCardServiceImpl : TodoCardService {

    // TODO: DB에서 TodoCard를 가져와 todoCardResponse로 변환 후 반환
    override fun getAllTodoCardList(): List<TodoCardResponse> {
        TODO("Not yet implemented")
    }

    // TODO: DB에서 todoId에 해당하는 todoCard를 가져와서 todoCardResponse로 변환 후 반환
    // TODO: 만약 todoID에 해당하는 todoCard가 없다면 ModelNotFoundException
    override fun getTodoCardById(todoId: Long): TodoCardResponse {
        throw ModelNotFoundException(modelName = "Course", id = 1L)
    }

    @Transactional
    // TODO: request를 todoCard로 변환 후 DB에 저장
    override fun createTodoCard(request: CreatedTodoCardRequest): TodoCardResponse {
        TODO("Not yet implemented")
    }

    // TODO: DB에서 todoId에 해당하는 todoCard를 가져와서 request로 업데이트 후 db에 저장 후 todoCardResponse로 변환 후 반환
    // TODO: DB에서 todoId에 해당하는 todoCard를 가져와서 todoCardResponse로 변환 후 반환
    @Transactional
    override fun updateTodoCard(todoId: Long, request: UpdateTodoCardRequest): TodoCardResponse {
        TODO("Not yet implemented")
    }

    // TODO: DB에서 todoID에 해당하는 todoCard 삭제
    // TODO: DB에서 todoId에 해당하는 todoCard를 가져와서 todoCardResponse로 변환 후 반환
    @Transactional
    override fun deleteTodoCard(todoId: Long) {
        TODO("Not yet implemented")
    }

}