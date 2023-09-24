package com.GestionProjets.control;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestionProjets.entities.Task;
import com.GestionProjets.repositories.TaskRepository;

@Service
public class TaskService {
 @Autowired
 TaskRepository taskRepository;
 
 public List<Task> getAllTasks() {
	 return taskRepository.findAll();
 }
 
 public Task createTask(Task task) {
	 return taskRepository.save(null);
 }
 public Optional<Task> getTaskById(long id){
	 return taskRepository.findById(id);
 }
 public void delete(long id) {
		taskRepository.deleteById(id);
	}
}
