package com.GestionProjets.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GestionProjets.entities.Task;
import com.GestionProjets.entities.User;

public interface TaskRepository extends JpaRepository<Task, Long> {
//getByName
	//sortBydeadline
	List<Task> findByUser(User user);
	Optional<Task> FindTaskByName(String Name);
}
