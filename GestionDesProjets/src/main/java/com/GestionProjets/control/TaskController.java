package com.GestionProjets.control;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GestionProjets.entities.Task;
import com.GestionProjets.entities.User;
import com.GestionProjets.entitiesDto.UserDto;

@RestController
@RequestMapping
 
public class TaskController {
	@Autowired
	TaskService taskService;
	
	@GetMapping()
	 public List<Task> getAlltasks(){
		 
		 return taskService.getAllTasks();
	 }
	 @PostMapping() 
	 public ResponseEntity<Task> saveTask(@RequestBody Task task) {
		  taskService.createTask(task);
	     return (ResponseEntity.ok(task));
	 }
	 
	 @GetMapping("/{id}")
	 public Optional<Task> getTaskById(@PathVariable long id) {
	     Optional<Task> task = taskService.getTaskById(id);
	     if (task.isPresent()) {
	         return Optional.empty();
	     } else {
	         return Optional.empty();
	     }
	 }
	 @DeleteMapping("/{id}")
	 public ResponseEntity<Void>  deleteTask(@PathVariable long id) {
	 	taskService.delete(id);
	 	return ResponseEntity.noContent().build();
	 }
}
