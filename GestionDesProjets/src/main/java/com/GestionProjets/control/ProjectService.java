package com.GestionProjets.control;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.GestionProjets.entities.Project;
import com.GestionProjets.repositories.ProjectRepository;


@Service
public class ProjectService {

	
	 @Autowired
	 ProjectRepository projectRepository;
	 
	 public List<Project> getAllProjects() {
		 return projectRepository.findAll();
	 }
	 
	 public Project createProject(Project project) {
		 return projectRepository.save(project);
	 }
	 public Optional<Project> getprojectById(long id){
		 return projectRepository.findById(id);
	 }
	 public void delete(long id) {
			projectRepository.deleteById(id);
		}
}
