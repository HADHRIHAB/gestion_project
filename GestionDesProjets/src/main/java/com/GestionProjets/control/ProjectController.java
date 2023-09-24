package com.GestionProjets.control;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GestionProjets.entities.Project;


@RestController
@RequestMapping

public class ProjectController {
	@Autowired
	ProjectService projectService;
	
	@GetMapping()
	 public List<Project> getAllprojects(){
		 
		 return projectService.getAllProjects();
	 }
	 @PostMapping() 
	 public ResponseEntity<Project> saveProject(@RequestBody Project project) {
		  projectService.createProject(project);
	     return (ResponseEntity.ok(project));
	 }
	 
	 @GetMapping("/{id}")
	 public Optional<Project> getProjectById(@PathVariable long id) {
	     Optional<Project> project  = projectService.getprojectById(id);
	     if (project.isPresent()) {
	         return Optional.empty();
	     } else {
	         return Optional.empty();
	     }
	 }
	 @DeleteMapping("/{id}")
	 public ResponseEntity<Void>  deleteProject(@PathVariable long id) {
	 	projectService.delete(id);
	 	return ResponseEntity.noContent().build();
	 }
}
