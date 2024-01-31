package net.javaguides.todo.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.todo.dto.TodoDto;
import net.javaguides.todo.entity.Todo;
import net.javaguides.todo.repository.TodoRepository;
import net.javaguides.todo.service.TodoService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TodoServiceImpl implements TodoService {

    private TodoRepository todoRepository;
    @Override
    public TodoDto addTodo(TodoDto todoDto) {

        // Convert TodoDTo into Todo Jpa entity
        Todo todo = new Todo();
        todo.setTitle(todoDto.getTitle());
        todo.setDescription(todoDto.getDescription());
        todo.setCompleted(todoDto.isCompleted());

        // Todo Jpa entity
        Todo saveTodo = todoRepository.save(todo);

        // Convert saved Todo Jpa entity into TodoDto object
        TodoDto savedTodoDto = new TodoDto();
        savedTodoDto.setId(saveTodo.getId());
        savedTodoDto.setTitle(saveTodo.getTitle());
        savedTodoDto.setDescription(savedTodoDto.getDescription());
        savedTodoDto.setCompleted(savedTodoDto.isCompleted());

        return savedTodoDto;
    }
}
