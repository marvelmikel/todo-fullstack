package net.javaguides.todo.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.todo.dto.TodoDto;
import net.javaguides.todo.entity.Todo;
import net.javaguides.todo.repository.TodoRepository;
import net.javaguides.todo.service.TodoService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TodoServiceImpl implements TodoService {

    private TodoRepository todoRepository;

    private ModelMapper modelMapper;


    @Override
    public TodoDto addTodo(TodoDto todoDto) {

        // Convert TodoDTo object into Todo Jpa entity
        Todo todo = modelMapper.map(todoDto, Todo.class);

        // Todo Jpa entity
        Todo saveTodo = todoRepository.save(todo);

        // Convert saved Todo Jpa entity into TodoDto object
        return modelMapper.map(saveTodo, TodoDto.class);
    }

    @Override
    public TodoDto getTodo(Long id) {
        Todo todo = todoRepository.findById(id).get();

        return modelMapper.map(todo, TodoDto.class);
    }
}
