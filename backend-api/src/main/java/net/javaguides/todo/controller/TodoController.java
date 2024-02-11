package net.javaguides.todo.controller;

import lombok.AllArgsConstructor;
import net.javaguides.todo.dto.TodoDto;
import net.javaguides.todo.service.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/todos")
@AllArgsConstructor
public class TodoController {

    private TodoService todoService;

    //Build Add Todo REST API
    @PostMapping()

    public ResponseEntity<TodoDto> addTodo(@RequestBody TodoDto todoDto)
    {
        TodoDto savedTodo = todoService.addTodo(todoDto);

        return  new ResponseEntity<>(savedTodo, HttpStatus.CREATED);
    }

    // Build Get Todo BYId REST API
    @GetMapping("{id}")
    public ResponseEntity<TodoDto> getTodo(@PathVariable("id") Long todoId){
        TodoDto todoDto = todoService.getTodo(todoId);
        return new ResponseEntity<>(todoDto, HttpStatus.OK);
    }

    // Build GET ALL TODO REST API
    @GetMapping
    public ResponseEntity<List<TodoDto>> getAllTodos(){
        List<TodoDto> todos = todoService.getAllTodo();
//        return new ResponseEntity<>(todos, HttpStatus.OK);
        return ResponseEntity.ok(todos);
    }

    // Build UPDATE TODO REST API
    @PutMapping("{id}")
    public ResponseEntity<TodoDto> updateTodo(@RequestBody TodoDto todoDto, @PathVariable("id")  Long todoId){
       TodoDto updatedTodo = todoService.updateTodo(todoDto, todoId);
       return ResponseEntity.ok(updatedTodo);
    }

    // Build DELETE TODO REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteTodo(@PathVariable("id") Long todoId){
        todoService.deleteTodo(todoId);
        return ResponseEntity.ok("Todo deleted successfully!.");
    }

    // Build Complete TODO REST API
    @PatchMapping("{id}/complete")
    public ResponseEntity<TodoDto> completedTodo(@PathVariable("id") Long todoId){
        TodoDto updatedTodo = todoService.completeTodo(todoId);
        return  ResponseEntity.ok(updatedTodo);
    }

}
